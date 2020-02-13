package com.cralos.myapplication2.fragments.searchview.withlistview.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;

import androidx.databinding.DataBindingUtil;

import com.cralos.myapplication2.R;
import com.cralos.myapplication2.databinding.ItemUserSerachviewBinding;
import com.cralos.myapplication2.fragments.searchview.withlistview.models.User;

import java.util.ArrayList;
import java.util.List;

public class ListAdapter extends BaseAdapter implements Filterable {

    private List<User> mData;
    private List<User> mUsersFilterList;
    private ValueFilter valueFilter;
    private LayoutInflater inflater;

    public ListAdapter(List<User> mData) {
        this.mData = mData;
        this.mUsersFilterList = mData;
    }

    @Override
    public int getCount() {
        return mData.size();
    }

    @Override
    public Object getItem(int i) {
        return mData.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (inflater == null) {
            inflater = (LayoutInflater) viewGroup.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        }
        ItemUserSerachviewBinding binding = DataBindingUtil.inflate(inflater, R.layout.item_user_serachview, viewGroup, false);
        binding.setUser(mData.get(i));
        return binding.getRoot();
    }

    @Override
    public Filter getFilter() {
        if (valueFilter == null) {
            valueFilter = new ValueFilter();
        }
        return valueFilter;
    }

    public class ValueFilter extends Filter {
        @Override
        protected FilterResults performFiltering(CharSequence charSequence) {
            FilterResults results = new FilterResults();
            if (charSequence != null && charSequence.length() > 0) {
                List<User> filterList = new ArrayList<>();
                for (int i = 0; i < mUsersFilterList.size(); i++) {
                    if (mUsersFilterList.get(i).getName().toUpperCase().contains(charSequence.toString().toUpperCase())) {
                        filterList.add(mUsersFilterList.get(i));
                    }
                }
                results.count = filterList.size();
                results.values = filterList;
            } else {
                results.count = mUsersFilterList.size();
                results.values = mUsersFilterList;
            }
            return results;
        }

        @Override
        protected void publishResults(CharSequence charSequence, FilterResults filterResults) {
            mData = (List<User>) filterResults.values;
            notifyDataSetChanged();
        }
    }

}

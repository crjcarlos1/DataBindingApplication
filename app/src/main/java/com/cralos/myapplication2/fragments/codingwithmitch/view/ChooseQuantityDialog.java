package com.cralos.myapplication2.fragments.codingwithmitch.view;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

import com.cralos.myapplication2.databinding.DialogChooseQuantityBinding;
import com.cralos.myapplication2.fragments.codingwithmitch.IQuantity;

public class ChooseQuantityDialog extends DialogFragment {
    private static final String TAG = "ChooseQuantityDialog";

    // data binding
    private DialogChooseQuantityBinding mBinding;

    private IQuantity quantity;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mBinding = DialogChooseQuantityBinding.inflate(inflater);
        mBinding.listView.setOnItemClickListener(mOnItemClickListener);
        mBinding.closeDialog.setOnClickListener(mCloseDialogListener);

        return mBinding.getRoot();
    }

    public AdapterView.OnItemClickListener mOnItemClickListener = new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
            Log.d(TAG, "onItemSelected: selected: " + adapterView.getItemAtPosition(i));

            if (quantity != null) {
                quantity.setQuantityToFragment(Integer.parseInt((String) adapterView.getItemAtPosition(i)));
            }

            getDialog().dismiss();
        }
    };

    public void setQuantityListener(IQuantity listener) {
        this.quantity = listener;
    }

    public View.OnClickListener mCloseDialogListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            getDialog().dismiss();
        }
    };
}

package com.cralos.myapplication2.fragments.codingwithmitch.view;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import com.cralos.myapplication2.R;
import com.cralos.myapplication2.databinding.FragmentCodingwithmitchBinding;
import com.cralos.myapplication2.fragments.codingwithmitch.IFragmentCodingwithmitch;
import com.cralos.myapplication2.fragments.codingwithmitch.IQuantity;
import com.cralos.myapplication2.fragments.codingwithmitch.models.Product;
import com.cralos.myapplication2.fragments.codingwithmitch.utils.Products;

/*
        this example is here: https://github.com/mitchtabian/DataBindingGettingStarted/
 */

public class FragmentCodingwithmitch extends Fragment implements IFragmentCodingwithmitch, IQuantity {

    public static final String TAG= FragmentCodingwithmitch.class.getSimpleName();

    /**Databinding*/
    private FragmentCodingwithmitchBinding binding;

    /**Product*/
    private Product product;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding= DataBindingUtil.inflate(inflater,R.layout.fragment_codingwithmitch,container,false);

        /**get data*/
        Products products=new Products();
        product=products.PRODUCTS[0];

        /**set to databinding*/
        binding.setProduct(product);

        /**quantity*/
        binding.setQuantuty(1);

        /**onClick*/
        binding.setIFragmentcoding(this);

        return binding.getRoot();
    }

    @Override
    public void inflateQuantityDialog() {
        ChooseQuantityDialog dialog=new ChooseQuantityDialog();
        dialog.setQuantityListener(this);
        dialog.show(getActivity().getSupportFragmentManager(),getActivity().getResources().getString(R.string.dialog_choose_quantity));
    }

    @Override
    public void setQuantityToFragment(int quantity) {
        binding.setQuantuty(quantity);
    }
}

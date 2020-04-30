package com.cralos.myapplication2.fragments.codingwithmitch.bindingadapters;

import android.content.Context;
import android.widget.ImageView;

import androidx.databinding.BindingAdapter;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.cralos.myapplication2.R;
import com.cralos.myapplication2.fragments.codingwithmitch.utils.StringUtil;

public class GlideBindingAdapters {

    @BindingAdapter("imageUrl")
    public static void setImageResource(ImageView imageView,int imageUrl){
        Context context=imageView.getContext();
        RequestOptions options=new RequestOptions()
                .placeholder(R.drawable.ic_launcher_background)
                .error(R.drawable.ic_launcher_background);
        Glide.with(context)
                .setDefaultRequestOptions(options)
                .load(imageUrl)
                .into(imageView);
    }

    @BindingAdapter("imageUrl")
    public static void setImageResource(ImageView imageView, StringUtil imageUrl){
        Context context=imageView.getContext();
        RequestOptions options=new RequestOptions()
                .placeholder(R.drawable.ic_launcher_background)
                .error(R.drawable.ic_launcher_background);
        Glide.with(context)
                .setDefaultRequestOptions(options)
                .load(imageUrl)
                .into(imageView);
    }

}

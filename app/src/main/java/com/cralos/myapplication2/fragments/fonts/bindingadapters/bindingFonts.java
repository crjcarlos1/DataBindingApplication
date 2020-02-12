package com.cralos.myapplication2.fragments.fonts.bindingadapters;

import android.graphics.Typeface;
import android.widget.TextView;

import androidx.databinding.BindingAdapter;

public class bindingFonts {
    @BindingAdapter("android:customFont")
    public static void setFont(TextView textView, String typefaceName) {
        textView.setTypeface(Typeface.createFromAsset(textView.getContext().getAssets(), "fonts/" + typefaceName));
    }

}

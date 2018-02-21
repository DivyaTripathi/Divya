package com.example.cs202.listview;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

/**
 * Created by CS202 on 23-01-2018.
 */

public class Adapter extends ArrayAdapter<String> {

    private String[] name;
    private Integer[] image;
    private Context context;
    private List<String> data;
    private TextView textViewname;
    private ImageView imageView;

    public Adapter(Context context, Integer[] imageId, String[] nameId) {
        super(context, R.layout.activity_main, nameId);
        this.name = nameId;
        this.image = imageId;
        this.context = context;


    }


    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        ViewHolder holder;

        if (view == null) {
            LayoutInflater mLayoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = mLayoutInflater.inflate(R.layout.list_item, null);

            holder = new ViewHolder();

            holder.textViewname = (TextView) view.findViewById(R.id.textView);
            holder.imageView = (ImageView) view.findViewById(R.id.imageView);
            view.setTag(holder);
        }else {
            holder=(ViewHolder)view.getTag();
        }

        holder.textViewname.setText(name[position]);
        holder.imageView.setImageResource(image[position]);
        return view;
    }




    private class ViewHolder {
        protected TextView textViewname;
        protected ImageView imageView;
    }

}




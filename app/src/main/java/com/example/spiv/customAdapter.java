package com.example.spiv;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class customAdapter extends BaseAdapter {
    int[] picture;
    String[] hotelName;
    list_hotel context;
    LayoutInflater inflater;
    public customAdapter(list_hotel list_hotel, String[] hotelName, int[] picture) {
        this.context=list_hotel;
        this.hotelName=hotelName;
        this.picture=picture;

    }

    @Override
    public int getCount() {
        return hotelName.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view==null)
        {
            inflater= (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
            view= inflater.inflate(R.layout.designview_hotel,viewGroup,false);
        }
        ImageView imageView=view.findViewById(R.id.ImageViewId);
        TextView textView=view.findViewById(R.id.hotelName);
        imageView.setImageResource(picture[i]);
        textView.setText(hotelName[i]);

        return view;
    }

}

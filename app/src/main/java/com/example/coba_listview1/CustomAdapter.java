package com.example.coba_listview1;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.zip.Inflater;

public class CustomAdapter extends BaseAdapter {
    Context context;
    String countryList[];
    String desc[];
    int pic[];
    LayoutInflater inflater;

    public CustomAdapter(Context applicationContext, String[] countryList, int[] pic, String[] desc) {
        this.context = context;
        this.countryList = countryList;
        this.pic = pic;
        this.desc = desc;
        inflater = (LayoutInflater.from(applicationContext));
    }

    @Override
    public int getCount() {
        return countryList.length;
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
        view = inflater.inflate(R.layout.activity_listview,null);
        TextView fruit = (TextView) view.findViewById(R.id.textView);
        ImageView icon = (ImageView) view.findViewById(R.id.icon);
        fruit.setText(countryList[i]);
        icon.setImageResource(pic[i]);
        return view;
    }
}

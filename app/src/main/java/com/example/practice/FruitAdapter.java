package com.example.practice;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class FruitAdapter extends ArrayAdapter {

    private int resourceId;

    public FruitAdapter(Context context, int resource, List<Fruit> objects) {
        super(context, resource, objects);
        resourceId = resource;

    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Fruit fruit = (Fruit) getItem(position);
        View view ;
        ViewHolder viewHolder;
        if (convertView == null){
            view = LayoutInflater.from(getContext()).inflate(resourceId,parent,false);
            viewHolder = new ViewHolder();

        }else {
            view = convertView;
        }
        TextView name = view.findViewById(R.id.name);
        TextView color = view.findViewById(R.id.color);
        name.setText(fruit.getName());
        color.setText(fruit.getColor());
        return view;
    }

    class ViewHolder{
        TextView name;
        TextView color;
    }
}

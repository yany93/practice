package com.example.practice;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class FruitaRecyclerAdapter extends RecyclerView.Adapter<FruitaRecyclerAdapter.ViewHolder> {

    private List<Fruit> mFruitList;

    static class ViewHolder extends RecyclerView.ViewHolder{

        TextView fruitName;
        TextView fruitColor;

        public ViewHolder(View view){
            super(view);
            fruitName = view.findViewById(R.id.name);
            fruitColor = view.findViewById(R.id.color);
        }
    }

    public FruitaRecyclerAdapter(List<Fruit> fruitList){
        mFruitList = fruitList;
    }



    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.fruit_item, viewGroup, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    public void onBindViewHolder(ViewHolder holder, int position){
        Fruit fruit = mFruitList.get(position);
        holder.fruitName.setText(fruit.getName());
        holder.fruitColor.setText(fruit.getColor());
    }

    public int getItemCount(){
        return mFruitList.size();
    }
}

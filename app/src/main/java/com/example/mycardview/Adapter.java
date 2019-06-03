package com.example.mycardview;

import android.content.Context;
import android.media.Image;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

/**
 * class description:
 * author ywk
 * since 2019-06-03
 */
public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

    private ArrayList<Fruit> mfruitArrayList;
    private Context mContext;
    public Adapter(ArrayList<Fruit> fruitArrayList) {
        mfruitArrayList = fruitArrayList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        mContext = viewGroup.getContext();
        View view = LayoutInflater.from(mContext).inflate(R.layout.fruit_item, viewGroup, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        Fruit fruit = mfruitArrayList.get(i);
        viewHolder.fruitName.setText(fruit.getFruitName());
        Glide.with(mContext).load(fruit.getFruitImage()).into(viewHolder.fruitImage);
    }

    @Override
    public int getItemCount() {
        return mfruitArrayList.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder{
        TextView fruitName;
        ImageView fruitImage;
        CardView mCardView;

        public ViewHolder(View view){
            super(view);
            mCardView = (CardView)view;
            fruitName = (TextView) view.findViewById(R.id.fruit_name);
            fruitImage = (ImageView) view.findViewById(R.id.fruit_iamge);
        }
    }
}
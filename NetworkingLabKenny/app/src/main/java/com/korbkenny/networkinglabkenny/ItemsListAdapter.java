package com.korbkenny.networkinglabkenny;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by KorbBookProReturns on 11/17/16.
 */

public class ItemsListAdapter extends RecyclerView.Adapter<ItemsListViewHolder> {
    ArrayList<String> mList;

    public ItemsListAdapter(ArrayList<String> list) {
        mList = list;
    }

    @Override
    public ItemsListViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        return new ItemsListViewHolder(layoutInflater.inflate(R.layout.items_list_viewholder,parent,false));
    }

    @Override
    public void onBindViewHolder(ItemsListViewHolder holder, int position) {
        holder.mTextView.setText(mList.get(position));
    }

    @Override
    public int getItemCount() {
        return mList.size();
    }
}

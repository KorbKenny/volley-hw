package com.korbkenny.networkinglabkenny;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by KorbBookProReturns on 11/17/16.
 */

public class ItemsListViewHolder extends RecyclerView.ViewHolder {

    TextView mTextView;

    public ItemsListViewHolder(View itemView) {
        super(itemView);
        mTextView = (TextView)itemView.findViewById(R.id.an_item);
    }
}

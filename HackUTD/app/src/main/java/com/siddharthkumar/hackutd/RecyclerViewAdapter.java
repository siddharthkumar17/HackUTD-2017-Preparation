package com.siddharthkumar.hackutd;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.List;

/**
 * Created by Siddharth Kumar on 3/3/2017.
 */

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>{
    List<MainActivity.Holder> holders;
    View.OnClickListener onClickListener;
    public RecyclerViewAdapter(List<MainActivity.Holder> holders, View.OnClickListener click){

            this.holders=holders;
        onClickListener=click;

    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.listviewlayout, parent, false);

        ViewHolder vh=new ViewHolder(view);
        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.textView.setText(holders.get(position).text);
        holder.cardView.setOnClickListener(onClickListener);

    }

    @Override
    public int getItemCount() {
        return holders.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{

        TextView textView;
        CardView cardView;
        public ViewHolder(View view){

            super(view);
            cardView =(CardView)view.findViewById(R.id.card);
            textView = (TextView)view.findViewById(R.id.listitem);

        }



    }





}

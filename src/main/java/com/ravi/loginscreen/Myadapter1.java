package com.ravi.loginscreen;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class Myadapter1 extends RecyclerView.Adapter<Myadapter1.MyViewHolder> {
    private List<String> countryList;
    public LayoutInflater inflater;

    public static class MyViewHolder extends RecyclerView.ViewHolder
    {
        public TextView tv1,tv2;

        public MyViewHolder(View v) {
            super(v);
            tv1 = v.findViewById(R.id.settext);
            tv2 = v.findViewById(R.id.empty);

        }
    }

    public Myadapter1(Context context,List<String> l)
    {
        countryList = l;
        inflater= LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        if (countryList.size() != 0){
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.customlist,parent,false);
        MyViewHolder vh = new MyViewHolder(v);
        return vh;
        }
        else{
            View v =LayoutInflater.from(parent.getContext()).inflate(R.layout.empty,parent,false);
            MyViewHolder vh = new MyViewHolder(v);
            return vh;
        }
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        if (countryList.size()!=0){
            String s = countryList.get(position);
            holder.tv1.setText(s);}
        if (countryList.size()==0) {
            holder.tv2.setText("Good Job - you're all caught up here");
        }
    }

    @Override
    public int getItemCount()
    {
        if (countryList.size()!=0){
            return countryList.size();}
        else
            return 1;
    }


}

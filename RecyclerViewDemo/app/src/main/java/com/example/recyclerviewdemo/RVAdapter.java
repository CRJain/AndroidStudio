package com.example.recyclerviewdemo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RVAdapter extends RecyclerView.Adapter<RVAdapter.MyViewHolder> {

    private Data[] dataset;

    public RVAdapter(Data[] dataset) {
        this.dataset = dataset;
    }
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem = layoutInflater.inflate(R.layout.activity_contact__list, parent, false);
        MyViewHolder holder = new MyViewHolder(listItem);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.textView.setText(dataset[position].getItemName());
        holder.textView2.setText(dataset[position].getItemNo());
    }

    @Override
    public int getItemCount() {
        return dataset.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        public TextView textView;
        public TextView textView2;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            this.textView = (TextView) itemView.findViewById(R.id.textView);
            this.textView2 = (TextView) itemView.findViewById(R.id.textView2);
        }
    }
}

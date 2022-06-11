package com.example.a3_monthhomework3part2;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class NamesAdapter extends RecyclerView.Adapter<NamesViewHolder> {
    private ArrayList<String> dataNames;

    public NamesAdapter(ArrayList<String> dataNames) {
        this.dataNames = dataNames;
    }

    @NonNull
    @Override
    public NamesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new NamesViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_names, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull NamesViewHolder holder, int position) {
        holder.bind(dataNames.get(position));
    }

    @Override
    public int getItemCount() {
        return dataNames.size();
    }
}

package com.example.a3_monthhomework3part2;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class NamesViewHolder extends RecyclerView.ViewHolder {
    private TextView tvNames;

    public NamesViewHolder(@NonNull View itemView) {
        super(itemView);
        tvNames = itemView.findViewById(R.id.names);
    }

    public void bind (String names){
        tvNames.setText(names);
    }
}

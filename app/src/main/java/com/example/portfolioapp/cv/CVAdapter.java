package com.example.portfolioapp.cv;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.portfolioapp.R;

import java.util.List;

public class CVAdapter extends RecyclerView.Adapter<CVAdapter.CVViewHolder> {
    List<CVItem> metadata;

    public CVAdapter(List<CVItem> metadata) {
        this.metadata = metadata;
    }

    @NonNull
    @Override
    public CVViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_cv, parent, false);
        return new CVViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CVViewHolder holder, int position) {
        holder.displayTitle.setText(metadata.get(position).getTitle());
        holder.displayDuration.setText(metadata.get(position).getDuration());
        holder.displayDescription.setText(metadata.get(position).getDescription());
    }

    @Override
    public int getItemCount() {
        return metadata.size();
    }

    public class CVViewHolder extends RecyclerView.ViewHolder {
        TextView displayTitle, displayDescription, displayDuration;

        public CVViewHolder(@NonNull View itemView) {
            super(itemView);
            displayTitle = itemView.findViewById(R.id.textView_Experience_Title);
            displayDuration = itemView.findViewById(R.id.textView_Experience_Duration);
            displayDescription = itemView.findViewById(R.id.textView_Experience_Content);
        }
    }
}

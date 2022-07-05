package com.example.portfolioapp.testimonial;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.portfolioapp.R;

import java.util.List;

public class TestimonialAdapter extends RecyclerView.Adapter<TestimonialAdapter.TestimonialViewHolder> {

    List<TestimonialItem> metadata;

    public TestimonialAdapter(List<TestimonialItem> metadata) {
        this.metadata = metadata;
    }

    @NonNull
    @Override
    public TestimonialViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_people, parent, false);

        return new TestimonialViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TestimonialViewHolder holder, int position) {
        holder.testimonial_name.setText(metadata.get(position).getName());
        holder.testimonial_description.setText(metadata.get(position).getDesc());
        holder.testimonial_pic.setImageResource(metadata.get(position).getImg());
    }

    @Override
    public int getItemCount() {
        return metadata.size();
    }

    public class TestimonialViewHolder extends RecyclerView.ViewHolder {

        TextView testimonial_name;
        TextView testimonial_description;
        ImageView testimonial_pic;

        public TestimonialViewHolder(@NonNull View itemView) {

            super(itemView);

            testimonial_name = itemView.findViewById(R.id.textView_Testimonial_Name);
            testimonial_description = itemView.findViewById(R.id.textView_Testimonial_Content);
            testimonial_pic = itemView.findViewById(R.id.imageView_Testimonial);
        }
    }

}

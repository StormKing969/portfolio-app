package com.example.portfolioapp.testimonial;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.portfolioapp.R;

import java.util.ArrayList;
import java.util.List;

public class TestimonialFragment extends Fragment {

    RecyclerView RvTestimonial;
    TestimonialAdapter adapter;
    List<TestimonialItem> metadata;

    public TestimonialFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_testimonial, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        RvTestimonial = view.findViewById(R.id.recyclerView_testimonial);

        // Create list of testimonial items
        TestimonialItem item01 = new TestimonialItem(getString(R.string.testimonial01_name), getString(R.string.testimonial01_content), R.drawable.testimonial1);
        TestimonialItem item02 = new TestimonialItem(getString(R.string.testimonial02_name), getString(R.string.testimonial02_content), R.drawable.testimonial2);

        metadata = new ArrayList<>();
        metadata.add(item01);
        metadata.add(item02);

        // Setup adapter and recycleView
        RvTestimonial.setLayoutManager(new LinearLayoutManager(getContext()));
        adapter = new TestimonialAdapter(metadata);
        RvTestimonial.setAdapter(adapter);
    }
}
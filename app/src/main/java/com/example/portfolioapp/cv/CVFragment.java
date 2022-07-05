package com.example.portfolioapp.cv;

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

public class CVFragment extends Fragment {
    RecyclerView RvCv;
    CVAdapter adapter;
    List<CVItem> items;

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        RvCv = view.findViewById(R.id.recyclerView_cv);

        // Create a list of cv items
        items = new ArrayList<>();
        items.add(new CVItem(getString(R.string.experience_title_01), getString(R.string.experience_duration_01), getString(R.string.experience_detail_01)));
        items.add(new CVItem(getString(R.string.experience_title_02), getString(R.string.experience_duration_02), getString(R.string.experience_detail_02)));
        items.add(new CVItem(getString(R.string.experience_title_03), getString(R.string.experience_duration_03), getString(R.string.experience_detail_03)));
        items.add(new CVItem(getString(R.string.experience_title_04), getString(R.string.experience_duration_04), getString(R.string.experience_detail_04)));
        items.add(new CVItem(getString(R.string.experience_title_05), getString(R.string.experience_duration_05), getString(R.string.experience_detail_05)));
        items.add(new CVItem(getString(R.string.experience_title_06), getString(R.string.experience_duration_06), getString(R.string.experience_detail_06)));

        adapter = new CVAdapter(items);
        RvCv.setLayoutManager(new LinearLayoutManager(getContext()));
        RvCv.setAdapter(adapter);
    }

    public CVFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_cv, container, false);
    }
}
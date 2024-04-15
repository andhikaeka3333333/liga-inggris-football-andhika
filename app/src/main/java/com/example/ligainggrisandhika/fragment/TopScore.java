package com.example.ligainggrisandhika.fragment;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.ligainggrisandhika.PreviewTopScore;
import com.example.ligainggrisandhika.R;
import com.example.ligainggrisandhika.adapter.AdapterClub;
import com.example.ligainggrisandhika.adapter.AdapterTopScore;
import com.example.ligainggrisandhika.model.ModelTopScore;

import java.util.ArrayList;
import java.util.List;

public class TopScore extends Fragment implements AdapterTopScore.ItemClickListener{
    List<ModelTopScore> items;
    RecyclerView recyclerView;
    AdapterTopScore adapter;
    public TopScore() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_top_score, container, false);

        items = new ArrayList<ModelTopScore>();

        // Add items to the list
        items.add(new ModelTopScore("Erling Haaland","Manchester City",R.drawable.haaland));
        items.add(new ModelTopScore("Ollie Watkins","Aston Villa",R.drawable.olliewatkins));
        items.add(new ModelTopScore("Alexander Isak","Newcastle United",R.drawable.alexanderisak));
        items.add(new ModelTopScore("Mohammed Salah","Liverpool",R.drawable.salah));
        items.add(new ModelTopScore("Dominic Solanke","Bournemouth",R.drawable.dominicsolanke));
        items.add(new ModelTopScore("Phill Fooden","Manchester City",R.drawable.phillfooden));

        // Find the RecyclerView in the fragment's layout
        recyclerView = view.findViewById(R.id.rvTopScore);

        // Set up the RecyclerView
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        adapter = new AdapterTopScore(items, requireContext());
        adapter.setClickListener(this);
        recyclerView.setAdapter(adapter);

        return view;
    }

    @Override
    public void onItemClick(View view, int position) {
        Intent intent = new Intent(getActivity(), PreviewTopScore.class);
        intent.putExtra("nama", adapter.getItem(position).getName());
        startActivity(intent);
        Toast.makeText(getActivity(), "You clicked " + adapter.getItem(position).getName() + " on row number " + position, Toast.LENGTH_SHORT).show();
    }
}
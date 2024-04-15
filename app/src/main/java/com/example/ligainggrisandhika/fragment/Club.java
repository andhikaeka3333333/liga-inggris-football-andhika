package com.example.ligainggrisandhika.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.ligainggrisandhika.R;
import com.example.ligainggrisandhika.adapter.AdapterClub;
import com.example.ligainggrisandhika.model.ModelClub;

import java.util.ArrayList;
import java.util.List;

public class Club extends Fragment implements AdapterClub.ItemClickListener{

    List<ModelClub> items;
    RecyclerView recyclerView;
    AdapterClub adapter;
    public Club() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_club, container, false);

        items = new ArrayList<ModelClub>();

        // Add items to the list
        items.add(new ModelClub("Arsenal","Emirates Stadium",R.drawable.arsenal));
        items.add(new ModelClub("Aston Villa","Villa Park",R.drawable.astonvilla));
        items.add(new ModelClub("Brentford","Brenftford Comunity Stadium",R.drawable.brentford));
        items.add(new ModelClub("Chelsea","Stamford Bridge",R.drawable.chelsea));
        items.add(new ModelClub("Manchester City","Etihad Stadium",R.drawable.manchestercity));
        items.add(new ModelClub("Manchester United","Old Trafford",R.drawable.manchesterunited));

        // Find the RecyclerView in the fragment's layout
        recyclerView = view.findViewById(R.id.rvClub);

        // Set up the RecyclerView
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        adapter = new AdapterClub(items, requireContext());
        adapter.setClickListener(this);
        recyclerView.setAdapter(adapter);

        return view;
    }

    @Override
    public void onItemClick(View view, int position) {

    }
}
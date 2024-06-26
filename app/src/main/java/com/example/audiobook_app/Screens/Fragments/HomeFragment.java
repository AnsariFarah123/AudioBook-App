package com.example.audiobook_app.Screens.Fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.audiobook_app.R;
import com.example.audiobook_app.Screens.DetailActivity;
import com.example.audiobook_app.Screens.SeeMoreActivity;
import com.example.audiobook_app.Screens.SettingsActivity;

public class HomeFragment extends Fragment{

    View view;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_home, container, false);
        view.findViewById(R.id.seeMoreBtn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(inflater.getContext(), SeeMoreActivity.class));
            }
        });

        view.findViewById(R.id.settingsBtn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(inflater.getContext(), SettingsActivity.class));
            }
        });
        view.findViewById(R.id.card1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(inflater.getContext(), DetailActivity.class));
            }
        });
        return view;
    }
}
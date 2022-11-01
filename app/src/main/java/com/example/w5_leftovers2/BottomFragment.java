package com.example.w5_leftovers2;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


public class BottomFragment extends Fragment {
    Button game;
    TextView myscore;
    int score;

    public BottomFragment() {
        // Required empty public constructor
    }



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
       View view = inflater.inflate(R.layout.fragment_bottom, container, false);
       myscore = (TextView) view.findViewById(R.id.scoretext);
       game = (Button) view.findViewById(R.id.newGame);
       return view;


    }
}
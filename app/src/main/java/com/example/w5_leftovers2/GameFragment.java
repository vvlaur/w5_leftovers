package com.example.w5_leftovers2;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import java.util.Random;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link GameFragment#newInstance} factory method to
 * create an instance of this fragment.
 */

public class GameFragment extends Fragment {
    Button bn00, bn01, bn02, bn03,
            bn10, bn11, bn12, bn13,
            bn20, bn21, bn22, bn23,
            bn30, bn31, bn32, bn33, sbutton;
    String word;
    int score;

    public String getRandomLetter(){
        Random rnd = new Random();
        char c = (char) ('a' + rnd.nextInt(26));
        Log.i("CHAR", "getRandomLetter: " + c);
        String res = "" + c;
        return res;
    }

    public String getScore(String word) {
        int counter = 0;
        if (word.length() < 4) {
            return "Too Short!";
        } else {
            for (int i = 0; i < word.length(); i++) {
                if (word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i' || word.charAt(i) == 'o' || word.charAt(i) == 'u' || word.charAt(i) == 'y') {
                    counter = counter + 1;
                }
                if (counter == 2) {
                    return "Thats Correct, +"; //score function
                }
            }
            score = score - 10;
            return "Incorrect, -10";
        }
    }

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public GameFragment() {
        // Required empty public constructor
    }


    // TODO: Rename and change types and number of parameters
    public static GameFragment newInstance(String param1, String param2) {
        GameFragment fragment = new GameFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }



    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        View view = inflater.inflate(R.layout.fragment_game, container, false);
        bn00 = (Button) view.findViewById(R.id.button00);
        bn00.setText(getRandomLetter());
        bn00.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ltr = (String) bn00.getText();

            }
        });

        bn01 = (Button) view.findViewById(R.id.button01);
        bn01.setText(getRandomLetter());

        bn02 = (Button) view.findViewById(R.id.button02);
        bn02.setText(getRandomLetter());

        bn03 = (Button) view.findViewById(R.id.button03);
        bn03.setText(getRandomLetter());

        bn10 = (Button) view.findViewById(R.id.button10);
        bn10.setText(getRandomLetter());

        bn11 = (Button) view.findViewById(R.id.button11);
        bn11.setText(getRandomLetter());

        bn12 = (Button) view.findViewById(R.id.button12);
        bn12.setText(getRandomLetter());

        bn13 = (Button) view.findViewById(R.id.button13);
        bn13.setText(getRandomLetter());

        bn20 = (Button) view.findViewById(R.id.button20);
        bn20.setText(getRandomLetter());

        bn21 = (Button) view.findViewById(R.id.button21);
        bn21.setText(getRandomLetter());

        bn22 = (Button) view.findViewById(R.id.button22);
        bn22.setText(getRandomLetter());

        bn23 = (Button) view.findViewById(R.id.button23);
        bn23.setText(getRandomLetter());

        bn30 = (Button) view.findViewById(R.id.button30);
        bn30.setText(getRandomLetter());

        bn31 = (Button) view.findViewById(R.id.button31);
        bn31.setText(getRandomLetter());

        bn32 = (Button) view.findViewById(R.id.button32);
        bn32.setText(getRandomLetter());

        bn33 = (Button) view.findViewById(R.id.button33);
        bn33.setText(getRandomLetter());

        sbutton = (Button) view.findViewById(R.id.submit);
        sbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //score
            }
        });
        return view;

    }
}


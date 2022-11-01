package com.example.w5_leftovers2;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;


public class GameFragment extends Fragment implements View.OnClickListener {
    Button bn00, bn01, bn02, bn03,
            bn10, bn11, bn12, bn13,
            bn20, bn21, bn22, bn23,
            bn30, bn31, bn32, bn33, sbutton;
    String word, txt;
    int score;
    TextView mytext;

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
                if (word.charAt(i) == 's' || word.charAt(i) == 'z' || word.charAt(i) == 'p' || word.charAt(i) == 'x' || word.charAt(i) == 'q') {
                    score = score * 2;
                }

                if (counter == 2) {
                    return "Thats Correct, +"; //score function
                }
            }
            score = score - 10;
            return "Incorrect, -10";
        }
    }


    public GameFragment() {
        // Required empty public constructor
    }



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_game, container, false);

        mytext = (TextView) view.findViewById(R.id.wordtext);

        bn00 = (Button) view.findViewById(R.id.button00);
        bn00.setText(getRandomLetter());
        bn00.setOnClickListener(this);


        bn01 = (Button) view.findViewById(R.id.button01);
        bn01.setText(getRandomLetter());
        bn01.setOnClickListener(this);

        bn02 = (Button) view.findViewById(R.id.button02);
        bn02.setText(getRandomLetter());
        bn02.setOnClickListener(this);

        bn03 = (Button) view.findViewById(R.id.button03);
        bn03.setText(getRandomLetter());
        bn03.setOnClickListener(this);

        bn10 = (Button) view.findViewById(R.id.button10);
        bn10.setText(getRandomLetter());
        bn10.setOnClickListener(this);

        bn11 = (Button) view.findViewById(R.id.button11);
        bn11.setText(getRandomLetter());
        bn11.setOnClickListener(this);

        bn12 = (Button) view.findViewById(R.id.button12);
        bn12.setText(getRandomLetter());
        bn12.setOnClickListener(this);

        bn13 = (Button) view.findViewById(R.id.button13);
        bn13.setText(getRandomLetter());
        bn13.setOnClickListener(this);

        bn20 = (Button) view.findViewById(R.id.button20);
        bn20.setText(getRandomLetter());
        bn20.setOnClickListener(this);

        bn21 = (Button) view.findViewById(R.id.button21);
        bn21.setText(getRandomLetter());
        bn21.setOnClickListener(this);

        bn22 = (Button) view.findViewById(R.id.button22);
        bn22.setText(getRandomLetter());
        bn22.setOnClickListener(this);

        bn23 = (Button) view.findViewById(R.id.button23);
        bn23.setText(getRandomLetter());
        bn23.setOnClickListener(this);

        bn30 = (Button) view.findViewById(R.id.button30);
        bn30.setText(getRandomLetter());
        bn30.setOnClickListener(this);

        bn31 = (Button) view.findViewById(R.id.button31);
        bn31.setText(getRandomLetter());
        bn31.setOnClickListener(this);

        bn32 = (Button) view.findViewById(R.id.button32);
        bn32.setText(getRandomLetter());
        bn32.setOnClickListener(this);

        bn33 = (Button) view.findViewById(R.id.button33);
        bn33.setText(getRandomLetter());
        bn33.setOnClickListener(this);

        sbutton = (Button) view.findViewById(R.id.submit);
        sbutton.setOnClickListener(this);
        return view;

    }

    @Override
    public void onClick(View view) {

        switch(view.getId()){
            case R.id.button00:
                txt = (String) bn00.getText();
                word.concat(txt);
                mytext.setText(word);
                break;
            case R.id.button01:
                txt = (String) bn01.getText();
                word.concat(txt);
                mytext.setText(word);
                break;
            case R.id.button02:
                txt = (String) bn02.getText();
                word.concat(txt);
                mytext.setText(word);
                break;
            case R.id.button03:
                txt = (String) bn03.getText();
                word.concat(txt);
                mytext.setText(word);
                break;
            case R.id.button10:
                txt = (String) bn10.getText();
                word.concat(txt);
                mytext.setText(word);
                break;
            case R.id.button11:
                txt = (String) bn11.getText();
                word.concat(txt);
                mytext.setText(word);
                break;
            case R.id.button12:
                txt = (String) bn12.getText();
                word.concat(txt);
                mytext.setText(word);
                break;
            case R.id.button13:
                txt = (String) bn13.getText();
                word.concat(txt);
                mytext.setText(word);
                break;
            case R.id.button20:
                txt = (String) bn20.getText();
                word.concat(txt);
                mytext.setText(word);
                break;
            case R.id.button21:
                txt = (String) bn21.getText();
                word.concat(txt);
                mytext.setText(word);
                break;
            case R.id.button22:
                txt = (String) bn22.getText();
                word.concat(txt);
                mytext.setText(word);
                break;
            case R.id.button23:
                txt = (String) bn23.getText();
                word.concat(txt);
                mytext.setText(word);
                break;
            case R.id.button30:
                txt = (String) bn30.getText();
                word.concat(txt);
                mytext.setText(word);
                break;
            case R.id.button31:
                txt = (String) bn31.getText();
                word.concat(txt);
                mytext.setText(word);
                break;
            case R.id.button32:
                txt = (String) bn32.getText();
                word.concat(txt);
                mytext.setText(word);
                break;
            case R.id.button33:
                txt = (String) bn33.getText();
                word.concat(txt);
                mytext.setText(word);
                break;
            case R.id.submit:
                String result = getScore(word);
                Toast.makeText(getActivity(),  result,
                        Toast.LENGTH_LONG).show();

        }

    }
}


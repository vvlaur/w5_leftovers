package com.example.w5_leftovers2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.add(R.id.frameslayout, new GameFragment());
        ft.add(R.id.frameslayout, new BottomFragment());
        ft.commit();

    }
}
package com.example.weatherapp20;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<rv_structure> items = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initRecyclerView();

    }

    private void initRecyclerView() {
        items.add(new rv_structure("9 AM", "26", ""));
        items.add(new rv_structure("10 AM", "27", ""));
        items.add(new rv_structure("11 AM", "28", ""));
        items.add(new rv_structure("12 PM", "29", ""));
        items.add(new rv_structure("1 PM", "30", ""));
        items.add(new rv_structure("2 PM", "31", ""));
    }
}
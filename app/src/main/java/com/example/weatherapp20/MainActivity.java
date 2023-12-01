package com.example.weatherapp20;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<rv_structure> items = new ArrayList<>();
    RecyclerView recyclerView;
    rvAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initRecyclerView();

    }

    private void initRecyclerView() {
        items.add(new rv_structure("9 AM", "26", "img_humidity"));
        items.add(new rv_structure("10 AM", "27", "img_wind_speed"));
        items.add(new rv_structure("11 AM", "28", "img_mostly_cloudy"));
        items.add(new rv_structure("12 PM", "29", "img_rain_umbraila"));
        items.add(new rv_structure("1 PM", "30", "img_wind_speed"));
        items.add(new rv_structure("2 PM", "31", "img_mostly_cloudy"));
        items.add(new rv_structure("3 PM", "32", "img_humidity"));

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));

        adapter = new rvAdapter(this, items);
        recyclerView.setAdapter(adapter);
    }
}
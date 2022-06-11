package com.example.a3_monthhomework3part2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private ArrayList<String> names;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recycler);
        loadData();
        NamesAdapter adapter = new NamesAdapter(names);
        recyclerView.setAdapter(adapter);
    }

    private void loadData() {
        names = new ArrayList<>();
        names.add("Aaron Ramsdale");
        names.add("Terner");
        names.add("Bukayo Saka");
        names.add("Gabriel Martinelli");
        names.add("Gabriel Magaliaish");
        names.add("Ben White");
        names.add("Kiran Tierney");
        names.add("Cedric Soares");
        names.add("Aaron Hickey");
        names.add("Tahekiro Tomiyasu");
        names.add("Sambi Lokonga");
        names.add("Granit Xhaka");
        names.add("Martin Odeegard");
        names.add("Mo Elneny");
        names.add("Thomas Partey");
        names.add("Emil Smith-Rowe");
        names.add("Eddie Nketia");
        names.add("Charlie Patino");
        names.add("Raphinia");
        names.add("Djanluka Scammaka");
        names.add("Tilemans");
        names.add("Gabriel Jesus");
        names.add("MIKEL ARTETA");


    }
}
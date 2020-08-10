package com.example.learningandroid.RecyclerView;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.learningandroid.R;

import java.util.ArrayList;

public class RecyclerViewActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);

        ArrayList<ExampleItem> exampleList = new ArrayList<>();
        exampleList.add(new ExampleItem(R.drawable.tick, "Line 1", "Line 2"));
        exampleList.add(new ExampleItem(R.drawable.cancel, "Line 3", "Line 4"));
        exampleList.add(new ExampleItem(R.drawable.preference, "Line 5", "Line 6"));
        exampleList.add(new ExampleItem(R.drawable.tick, "Line 7", "Line 8"));
        exampleList.add(new ExampleItem(R.drawable.cancel, "Line 9", "Line 10"));
        exampleList.add(new ExampleItem(R.drawable.preference, "Line 11", "Line 12"));
        exampleList.add(new ExampleItem(R.drawable.tick, "Line 13", "Line 14"));
        exampleList.add(new ExampleItem(R.drawable.cancel, "Line 15", "Line 16"));
        exampleList.add(new ExampleItem(R.drawable.preference, "Line 17", "Line 18"));
        exampleList.add(new ExampleItem(R.drawable.tick, "Line 19", "Line 20"));
        exampleList.add(new ExampleItem(R.drawable.cancel, "Line 21", "Line 22"));
        exampleList.add(new ExampleItem(R.drawable.preference, "Line 23", "Line 24"));
        exampleList.add(new ExampleItem(R.drawable.tick, "Line 25", "Line 26"));
        exampleList.add(new ExampleItem(R.drawable.cancel, "Line 27", "Line 28"));
        exampleList.add(new ExampleItem(R.drawable.preference, "Line 29", "Line 30"));

        mRecyclerView = findViewById(R.id.recyclerView);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(this);
        mAdapter = new ExampleAdapter(exampleList);

        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(mAdapter);
    }
}

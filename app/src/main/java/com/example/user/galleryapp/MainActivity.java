package com.example.user.galleryapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    RecyclerView _recyclerView;
    RecyclerAdapter _viewAdapter;
    GridLayoutManager _viewManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        _viewManager = new GridLayoutManager(this, 3);
        _viewAdapter = new RecyclerAdapter(this, ImageData.getSpacePhotos());

        _recyclerView = findViewById(R.id.recycler_view);
        _recyclerView.setHasFixedSize(true);
        _recyclerView.setLayoutManager(_viewManager);
        _recyclerView.setAdapter(_viewAdapter);
    }
}

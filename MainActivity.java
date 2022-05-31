package com.ayong.alfredyong;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button btnNewPost;
    Button btnShowAll;
    Button btnOpenMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnNewPost = findViewById(R.id.btnNewPost);
        btnShowAll = findViewById(R.id.btnShowAll);
        btnOpenMap = findViewById(R.id.btnOpenMap);

        btnNewPost.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent newAdvertIntent = new Intent(MainActivity.this, CreateAdvertActivity.class);
                startActivity(newAdvertIntent);
            }
        });

        btnShowAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent showAdvertIntent = new Intent(MainActivity.this, ShowAdvertsActivity.class);
                startActivity(showAdvertIntent);
            }
        });
// this class is for the added google map api function for main_
        btnOpenMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent showOnMapIntent = new Intent(MainActivity.this, MapActivity.class);
                startActivity(showOnMapIntent);
            }
        });
    }
}
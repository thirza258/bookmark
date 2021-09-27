package com.example.mybookmark;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    private LinearLayout linear;
    private RecyclerView recyclerView, faq;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();

    }

    public void initView() {
        linear = findViewById(R.id.linear);
        recyclerView = findViewById(R.id.reclycleView);
        faq = findViewById(R.id.faq);
    }
}
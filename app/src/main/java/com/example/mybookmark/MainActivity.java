package com.example.mybookmark;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.mybookmark.FAQ.FAQ;
import com.example.mybookmark.FAQ.FaqContent;
import com.example.mybookmark.extension.Browser;
import com.example.mybookmark.extension.BrowserRecycle;
import com.example.mybookmark.url.socialmedia.chrome;
import com.example.mybookmark.url.socialmedia.facebook;
import com.example.mybookmark.url.socialmedia.firefox;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private LinearLayout linear;
    private RecyclerView recyclerView, faq;
    private Button simple, easy, speedy;
    private ImageView image_tab, simpleRed, easyRed, speedyRed;
    private TextView tabTitle, tabDesc;
    private ImageButton twitter, facebook;
    private Button getChrome, getFirefox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
        recycleFaq();
        recycleBrowser();
        ui();
    }

    public void initView() {
        linear = findViewById(R.id.linear);
        recyclerView = findViewById(R.id.reclycleView);
        faq = findViewById(R.id.faq);
        simple = findViewById(R.id.simple);
        easy = findViewById(R.id.easy);
        speedy = findViewById(R.id.speedy);
        image_tab = findViewById(R.id.image_tab);
        tabTitle = findViewById(R.id.tab_title);
        tabDesc = findViewById(R.id.tabDesc);
        simpleRed = findViewById(R.id.simpleRed);
        easyRed = findViewById(R.id.easyRed);
        speedyRed = findViewById(R.id.speedyRed);
        twitter = findViewById(R.id.twitter);
        facebook = findViewById(R.id.facebook);
        getChrome = findViewById(R.id.getChrome);
        getFirefox = findViewById(R.id.getFirefox);
    }

    public void ui() {
        simple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                image_tab.setImageResource(R.drawable.illustration_features_tab_1);
                tabTitle.setText("Bookmark in one click");
                tabDesc.setText(R.string.organize);
                simpleRed.setVisibility(View.VISIBLE);
                easyRed.setVisibility(View.GONE);
                speedyRed.setVisibility(View.GONE);
            }
        });

        speedy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                image_tab.setImageResource(R.drawable.illustration_features_tab_2);
                tabTitle.setText("Intelligent search");
                tabDesc.setText(R.string.speedy);
                simpleRed.setVisibility(View.GONE);
                easyRed.setVisibility(View.GONE);
                speedyRed.setVisibility(View.VISIBLE);
            }
        });

        easy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                image_tab.setImageResource(R.drawable.illustration_features_tab_3);
                tabTitle.setText("Share your bookmarks");
                tabDesc.setText(R.string.easy);
                simpleRed.setVisibility(View.GONE);
                easyRed.setVisibility(View.VISIBLE);
                speedyRed.setVisibility(View.GONE);
            }
        });

        twitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, com.example.mybookmark.url.socialmedia.twitter.class);
                startActivity(intent);
            }

        });

        facebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, facebook.class);
                startActivity(intent);
            }
        });

        getChrome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, chrome.class);
                startActivity(intent);
            }
        });

        getFirefox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, firefox.class);
                startActivity(intent);
            }
        });

    }

    public void recycleFaq() {
        ArrayList<Browser> browsers = new ArrayList<>();
        browsers.add(new Browser(R.drawable.logo_chrome, "Add to Chrome", "Minimum version 62"));
        browsers.add(new Browser(R.drawable.logo_firefox, "Add to Firefox", "Minimum version 55"));
        browsers.add(new Browser(R.drawable.logo_opera, "Add to Opera", "Minimum version 46"));

        BrowserRecycle adapter = new BrowserRecycle(this);
        adapter.setBrowser(browsers);

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


    }

    public void recycleBrowser() {
        ArrayList<FAQ> faqs = new ArrayList<>();
        faqs.add(new FAQ("What is Bookmark", R.string.what));
        faqs.add(new FAQ("How I can request a new Browser", R.string.lorem));
        faqs.add(new FAQ("Is there a mobile app", R.string.lorem));
        faqs.add(new FAQ("What about other chromium browser", R.string.lorem));

        FaqContent adapter = new FaqContent(this);
        adapter.setFaq(faqs);

        faq.setAdapter(adapter);
        faq.setLayoutManager(new LinearLayoutManager(this));
    }
}
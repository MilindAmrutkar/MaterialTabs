package com.example.android.materialtabs.app;

import android.content.Intent;
import android.graphics.drawable.Icon;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import com.example.android.materialtabs.R;
import com.example.android.materialtabs.adapters.CustomTabsAdapter;
import com.example.android.materialtabs.tabs.CustomViewTabs;
import com.example.android.materialtabs.tabs.IconTabs;
import com.example.android.materialtabs.tabs.ScrollTabs;
import com.example.android.materialtabs.tabs.TextTabs;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Toolbar toolbar;
    private Button btnSimpleTabs, btnScrollableTabs, btnIconTabs, btnCustomIconTextTabs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar =  findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        btnSimpleTabs = findViewById(R.id.btnTabsWithText);
        btnScrollableTabs = findViewById(R.id.btnScrollableTabs);
        btnIconTabs = findViewById(R.id.btnIconTabs);
        btnCustomIconTextTabs = findViewById(R.id.btnCustomIconTabs);

        btnSimpleTabs.setOnClickListener(this);
        btnScrollableTabs.setOnClickListener(this);
        btnIconTabs.setOnClickListener(this);
        btnCustomIconTextTabs.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent intent = null;
        switch (v.getId()) {

            case R.id.btnTabsWithText:

                intent = new Intent(this, TextTabs.class);
                break;

            case R.id.btnIconTabs:
                intent = new Intent(this, IconTabs.class);
                break;

            case R.id.btnScrollableTabs:
                intent = new Intent(this, ScrollTabs.class);
                break;

            case R.id.btnCustomIconTabs:
                intent = new Intent(this, CustomViewTabs.class);
                break;

        }
        startActivity(intent);
    }
}

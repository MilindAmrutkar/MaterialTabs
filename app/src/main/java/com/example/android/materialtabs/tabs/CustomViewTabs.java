package com.example.android.materialtabs.tabs;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.android.materialtabs.R;
import com.example.android.materialtabs.adapters.CustomTabsAdapter;
import com.example.android.materialtabs.adapters.TextTabsAdapter;
import com.example.android.materialtabs.fragments.FragmentOne;
import com.example.android.materialtabs.fragments.FragmentThree;
import com.example.android.materialtabs.fragments.FragmentTwo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Milind Amrutkar on 02-08-2019.
 */
public class CustomViewTabs extends AppCompatActivity {

    private List<Fragment> fragmentList = new ArrayList<>();
    private List<String> titleList = new ArrayList<>();

    private ViewPager viewPager;
    private CustomTabsAdapter adapter;
    private TabLayout tabLayout;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_tabs);
        
        initialize();

        prepareDataResource();

        adapter = new CustomTabsAdapter(getSupportFragmentManager(), fragmentList, titleList);
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);

        setCustomViewForTabs();
    }

    private void setCustomViewForTabs() {
        setCustomViewForTab(0, "WALL", "TAB ONE");
        setCustomViewForTab(1, "CHAT", "TAB TWO");
        setCustomViewForTab(2, "PROFILE", "TAB THREE");
    }

    private void setCustomViewForTab(int position, String title, String subTitle) {

        LinearLayout tabView = (LinearLayout) LayoutInflater.from(this).inflate(R.layout.tab_item, null);

        TextView tvTitle = tabView.findViewById(R.id.tabTextTitle);
        tvTitle.setText(title);

        TextView tvSubTitle = tabView.findViewById(R.id.tabTextSubTitle);
        tvSubTitle.setText(subTitle);

        tabLayout.getTabAt(position).setCustomView(tabView);
    }

    private void initialize() {
        Toolbar toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle("Simple Tabs Example");

        viewPager = findViewById(R.id.viewPager);
        tabLayout = findViewById(R.id.tabs);
    }

    private void prepareDataResource() {

        addData(new FragmentOne(), "ONE");
        addData(new FragmentTwo(), "TWO");
        addData(new FragmentThree(), "THREE");

    }

    private void addData(Fragment fragment, String title) {
        fragmentList.add(fragment);
        titleList.add(title);
    }
}

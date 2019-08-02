package com.example.android.materialtabs.tabs;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.example.android.materialtabs.R;
import com.example.android.materialtabs.adapters.ScrollTabsAdapter;
import com.example.android.materialtabs.adapters.TextTabsAdapter;
import com.example.android.materialtabs.fragments.FragmentFive;
import com.example.android.materialtabs.fragments.FragmentFour;
import com.example.android.materialtabs.fragments.FragmentOne;
import com.example.android.materialtabs.fragments.FragmentSix;
import com.example.android.materialtabs.fragments.FragmentThree;
import com.example.android.materialtabs.fragments.FragmentTwo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Milind Amrutkar on 02-08-2019.
 */
public class ScrollTabs extends AppCompatActivity {

    private List<Fragment> fragmentList = new ArrayList<>();
    private List<String> titleList = new ArrayList<>();

    private ViewPager viewPager;
    private ScrollTabsAdapter adapter;
    private TabLayout tabLayout;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scroll_tabs);
        
        initialize();

        prepareDataResource();

        adapter = new ScrollTabsAdapter(getSupportFragmentManager(), fragmentList, titleList);
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);

    }

    private void initialize() {
        Toolbar toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle("Scroll Tabs Example");

        viewPager = findViewById(R.id.viewPager);
        tabLayout = findViewById(R.id.tabs);
    }

    private void prepareDataResource() {

        addData(new FragmentOne(), "ONE");
        addData(new FragmentTwo(), "TWO");
        addData(new FragmentThree(), "THREE");
        addData(new FragmentFour(), "FOUR");
        addData(new FragmentFive(), "FIVE");
        addData(new FragmentSix(), "SIX");
        addData(new FragmentOne(), "ONE");
        addData(new FragmentTwo(), "TWO");
        addData(new FragmentThree(), "THREE");
        addData(new FragmentFour(), "FOUR");
        addData(new FragmentFive(), "FIVE");
        addData(new FragmentSix(), "SIX");

    }

    private void addData(Fragment fragment, String title) {
        fragmentList.add(fragment);
        titleList.add(title);
    }
}

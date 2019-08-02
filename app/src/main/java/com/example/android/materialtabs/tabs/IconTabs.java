package com.example.android.materialtabs.tabs;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.example.android.materialtabs.R;
import com.example.android.materialtabs.adapters.IconTabsAdapter;
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
public class IconTabs extends AppCompatActivity {

    private List<Fragment> fragmentList = new ArrayList<>();


    private ViewPager viewPager;
    private IconTabsAdapter adapter;
    private TabLayout tabLayout;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_icon_tabs);

        initialize();

        prepareDataResource();

        adapter = new IconTabsAdapter(getSupportFragmentManager(), fragmentList);
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);

        setTabIcons();

    }

    private void setTabIcons() {
        tabLayout.getTabAt(0).setIcon(R.drawable.ic_face_black_24dp);
        tabLayout.getTabAt(1).setIcon(R.drawable.ic_face_black_24dp);
        tabLayout.getTabAt(2).setIcon(R.drawable.ic_face_black_24dp);
        tabLayout.getTabAt(3).setIcon(R.drawable.ic_face_black_24dp);
        tabLayout.getTabAt(4).setIcon(R.drawable.ic_face_black_24dp);
        tabLayout.getTabAt(5).setIcon(R.drawable.ic_face_black_24dp);

    }

    private void initialize() {
        Toolbar toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle("Simple Icon Tabs ");

        viewPager = findViewById(R.id.viewPager);
        tabLayout = findViewById(R.id.tabs);
    }

    private void prepareDataResource() {
        fragmentList.add(new FragmentOne());
        fragmentList.add(new FragmentTwo());
        fragmentList.add(new FragmentThree());
        fragmentList.add(new FragmentFour());
        fragmentList.add(new FragmentFive());
        fragmentList.add(new FragmentSix());

    }


}
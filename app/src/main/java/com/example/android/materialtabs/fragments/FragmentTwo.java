package com.example.android.materialtabs.fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.android.materialtabs.R;

/**
 * Created by Milind Amrutkar on 02-08-2019.
 */
public class FragmentTwo extends Fragment {

    public FragmentTwo() {
        Log.i("Fragment Check", "Fragment Two Created");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_two, container, false);
    }
}

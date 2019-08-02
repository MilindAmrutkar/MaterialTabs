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
public class FragmentFour extends Fragment {

    public FragmentFour() {
        Log.i("Fragment Check", "Fragment Three Created");
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_four, container, false);
    }
}

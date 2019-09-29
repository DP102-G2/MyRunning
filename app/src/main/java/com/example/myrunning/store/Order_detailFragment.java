package com.example.myrunning.store;


import android.app.Activity;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.myrunning.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class Order_detailFragment extends Fragment {


    private Activity activity;


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activity = getActivity();
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        activity.setTitle(R.string.order_detail);
        return inflater.inflate(R.layout.fragment_order_detail, container, false);
    }

}

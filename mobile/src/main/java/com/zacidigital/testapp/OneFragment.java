package com.zacidigital.testapp;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by angel on 11/07/2017.
 */

public class OneFragment extends Fragment {
    View view;
    TextView txtTitle;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_one,container,false);
        txtTitle = (TextView)view.findViewById(R.id.txtTitle);
        return view;
    }
}
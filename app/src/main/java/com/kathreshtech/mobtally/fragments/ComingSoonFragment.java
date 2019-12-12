package com.kathreshtech.mobtally.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.kathreshtech.mobtally.R;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class ComingSoonFragment extends BaseFragment {

    public ComingSoonFragment(){}

    public static ComingSoonFragment newInstance(String title){
        ComingSoonFragment comingSoonFragment = new ComingSoonFragment();
        Bundle bundle = new Bundle();
        bundle.putString("title",title);
        comingSoonFragment.setArguments(bundle);
        return comingSoonFragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View view = inflater.inflate(R.layout.fr_comingsoon,container,false);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }
}

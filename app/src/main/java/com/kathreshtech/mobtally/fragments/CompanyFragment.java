package com.kathreshtech.mobtally.fragments;


import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.kathreshtech.mobtally.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class CompanyFragment extends BaseFragment {


    public CompanyFragment() {
        // Required empty public constructor
    }

    public static CompanyFragment newInstance(String title){
        CompanyFragment companyFragment = new CompanyFragment();
        Bundle bundle = new Bundle();
        bundle.putString("title",title);
        companyFragment.setArguments(bundle);
        return companyFragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View view = inflater.inflate(R.layout.fr_company,container,false);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }
}

package com.kathreshtech.mobtally.fragments;


import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.kathreshtech.mobtally.R;
import com.kathreshtech.mobtally.utils.AppConstants;

/**
 * A simple {@link Fragment} subclass.
 */
public class CompanyCreateFragment extends BaseFragment {


    public CompanyCreateFragment() {
        // Required empty public constructor
    }

    public static CompanyCreateFragment newInstance(String title){
        CompanyCreateFragment companyCreateFragment = new CompanyCreateFragment();
        Bundle bundle = new Bundle();
        bundle.putString(AppConstants.INTENT_PARAM_TITLE,title);
        companyCreateFragment.setArguments(bundle);
        return companyCreateFragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View view = inflater.inflate(R.layout.fr_company_create,container,false);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }
}

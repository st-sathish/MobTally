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
import com.kathreshtech.mobtally.utils.AppConstants;

import java.util.zip.Inflater;

/**
 * A simple {@link Fragment} subclass.
 */
public class CompanyEditFragment extends BaseFragment {


    public CompanyEditFragment() {
        // Required empty public constructor
    }

    public static CompanyEditFragment newInstance(String title){
        CompanyEditFragment companyEditFragment = new CompanyEditFragment();
        Bundle bundle = new Bundle();
        bundle.putString(AppConstants.INTENT_PARAM_TITLE,title);
        companyEditFragment.setArguments(bundle);
        return companyEditFragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fr_company_edit,container,false);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }
}

package com.kathreshtech.mobtally.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.kathreshtech.mobtally.R;
import com.kathreshtech.mobtally.adapters.CompanyAdapter;
import com.kathreshtech.mobtally.utils.AppConstants;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class CompanyListFragment extends BaseFragment {

    RecyclerView mCompanyRecyclerView;

    private CompanyAdapter companyAdapter;

    public CompanyListFragment(){

    }

    public static CompanyListFragment newInstance(String title){
        CompanyListFragment companyListFragment = new CompanyListFragment();
        Bundle bundle = new Bundle();
        bundle.putString(AppConstants.INTENT_PARAM_TITLE,title);
        companyListFragment.setArguments(bundle);
        return companyListFragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View view = inflater.inflate(R.layout.fr_company_list,container,false);
        mCompanyRecyclerView = view.findViewById(R.id.cmp_recyler_vier);
        companyAdapter = new CompanyAdapter(getActivity());
        mCompanyRecyclerView.setAdapter(companyAdapter);
        mCompanyRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }
}

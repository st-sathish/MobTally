package com.kathreshtech.mobtally.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.kathreshtech.mobtally.R;
import com.kathreshtech.mobtally.utils.AppConstants;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class LedgerCreateFragment extends BaseFragment {

    public LedgerCreateFragment(){}

    public static LedgerCreateFragment newInstance(String title){
        LedgerCreateFragment ledgerCreateFragment = new LedgerCreateFragment();
        Bundle bundle =  new Bundle();
        bundle.putString(AppConstants.INTENT_PARAM_TITLE,title);
        ledgerCreateFragment.setArguments(bundle);
        return ledgerCreateFragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View view = inflater.inflate(R.layout.fr_ledger_create,container,false);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }

}

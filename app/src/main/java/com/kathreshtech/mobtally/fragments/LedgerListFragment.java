package com.kathreshtech.mobtally.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.kathreshtech.mobtally.R;
import com.kathreshtech.mobtally.utils.AppConstants;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class LedgerListFragment extends BaseFragment {

    public LedgerListFragment(){

    }

    public static LedgerListFragment newInstance(String title){
        LedgerListFragment ledgerListFragment = new LedgerListFragment();
        Bundle bundle =  new Bundle();
        bundle.putString(AppConstants.INTENT_PARAM_TITLE,title);
        ledgerListFragment.setArguments(bundle);
        return ledgerListFragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View view = inflater.inflate(R.layout.fr_ledger_list,container,false);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }
}

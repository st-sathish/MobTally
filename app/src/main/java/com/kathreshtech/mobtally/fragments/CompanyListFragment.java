package com.kathreshtech.mobtally.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.androidnetworking.AndroidNetworking;
import com.androidnetworking.error.ANError;
import com.androidnetworking.interfaces.JSONArrayRequestListener;
import com.kathreshtech.mobtally.R;
import com.kathreshtech.mobtally.adapters.CompanyAdapter;
import com.kathreshtech.mobtally.data.ApiConstants;
import com.kathreshtech.mobtally.data.network.CompanyResponse;
import com.kathreshtech.mobtally.utils.AppConstants;
import com.rx2androidnetworking.Rx2AndroidNetworking;

import org.json.JSONArray;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import io.reactivex.Observer;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

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
        getCompanyList();
    }

    public void getCompanyList(){
        Rx2AndroidNetworking.get(ApiConstants.API_COMPANY_LIST)
                .build()
                .getObjectObservable(CompanyResponse.class)
                .subscribeOn(Schedulers.io())
                .subscribe(new Observer<CompanyResponse>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(CompanyResponse companyResponse) {
                        companyAdapter.refresh(companyResponse.getCompanies());
                    }

                    @Override
                    public void onError(Throwable e) {
                        e.printStackTrace();
                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }
}

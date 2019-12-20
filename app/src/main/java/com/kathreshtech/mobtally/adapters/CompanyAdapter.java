package com.kathreshtech.mobtally.adapters;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.kathreshtech.mobtally.R;
import com.kathreshtech.mobtally.data.network.CompanyResponse;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CompanyAdapter extends RecyclerView.Adapter<CompanyAdapter.CompanyViewHolder> {

    private List<CompanyResponse.Company> companies = new ArrayList<>();

    private Activity mContext;

    public CompanyAdapter(Activity context){
        this.mContext = context;
    }

    public void refresh(List<CompanyResponse.Company> companies){
        this.companies = companies;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public CompanyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(mContext);
        View view = layoutInflater.inflate(R.layout.item_company,parent,false);
        CompanyViewHolder companyViewHolder = new CompanyViewHolder(view);
        return companyViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull CompanyViewHolder holder, int position) {
        CompanyResponse.Company company = companies.get(position);
        holder.mItemCompanyName.setText(company.getName());
    }

    @Override
    public int getItemCount() {
        return companies.size();
    }

    public static class CompanyViewHolder extends RecyclerView.ViewHolder{

        TextView mItemCompanyName;

        public CompanyViewHolder(@NonNull View itemView) {
            super(itemView);
            mItemCompanyName = itemView.findViewById(R.id.tv_item_cmp);
        }
    }
}

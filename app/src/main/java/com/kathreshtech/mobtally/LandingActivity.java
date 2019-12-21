package com.kathreshtech.mobtally;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import com.google.android.material.navigation.NavigationView;
import com.kathreshtech.mobtally.fragments.ComingSoonFragment;
import com.kathreshtech.mobtally.fragments.CompanyCreateFragment;
import com.kathreshtech.mobtally.fragments.CompanyEditFragment;
import com.kathreshtech.mobtally.fragments.CompanyListFragment;
import com.kathreshtech.mobtally.fragments.HomeFragment;
import com.kathreshtech.mobtally.fragments.LedgerAlterFragment;
import com.kathreshtech.mobtally.fragments.LedgerCreateFragment;
import com.kathreshtech.mobtally.fragments.LedgerDisplayFragment;
import com.kathreshtech.mobtally.fragments.LedgerListFragment;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

public class LandingActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    public static final int HOME_FRAGMENT = 1;
    public  static final int COMPANY_CREATE_FRAGMENT = 2;
    public static final int COMPANY_EDIT_FRAGMENT = 3;
    public static final int COMPANY_LIST_FRAGMENT = 4;
    public static final int LEDGER_LIST_FRAGMENT = 5;
    public static final int LEDGER_CREATE_FRAGMENT = 6;
    public static final int LEDGER_DISPLAY_FRAGMENT = 7;
    public static final int LEDGER_ALTER_FRAGMENT = 8;

    DrawerLayout mDrawerLayout;
    NavigationView mNavigationView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ac_landing_page);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        mDrawerLayout = findViewById(R.id.drawer_layout);
        setupToggle(mDrawerLayout,toolbar);
        displayFragment(HOME_FRAGMENT,"Home",true);

        mNavigationView = findViewById(R.id.nvView);
        mNavigationView.setNavigationItemSelectedListener(this);

    }

    public void setupToggle(DrawerLayout drawerLayout, final Toolbar toolbar){
        final ActionBarDrawerToggle actionBarDrawerToggle = new ActionBarDrawerToggle(this,drawerLayout,toolbar,
            R.string.open,R.string.close) {
            @Override
            public void onDrawerSlide(View drawerView, float slideOffset) {
                super.onDrawerSlide(drawerView, slideOffset);

                toolbar.setAlpha(1-slideOffset/2);


            }

            @Override
            public void onDrawerOpened(View drawerView) {
                super.onDrawerOpened(drawerView);
            }

            @Override
            public void onDrawerClosed(View drawerView) {
                super.onDrawerClosed(drawerView);
            }
        };

        drawerLayout.addDrawerListener(actionBarDrawerToggle);
        drawerLayout.post(actionBarDrawerToggle::syncState);
    }

    public void displayFragment(int fragid,String fragTitle,boolean addtobackstack){
        Fragment fragment;
        switch (fragid) {
            case HOME_FRAGMENT:
                fragment = HomeFragment.newInstance(fragTitle);
                break;

            case COMPANY_CREATE_FRAGMENT:
                fragment = CompanyCreateFragment.newInstance(fragTitle);
                        break;

            case COMPANY_EDIT_FRAGMENT:
                fragment = CompanyEditFragment.newInstance(fragTitle);
                break;

            case COMPANY_LIST_FRAGMENT:
                fragment = CompanyListFragment.newInstance(fragTitle);
                break;

            case LEDGER_LIST_FRAGMENT:
                fragment = LedgerListFragment.newInstance(fragTitle);
                break;

            case LEDGER_CREATE_FRAGMENT:
                fragment = LedgerCreateFragment.newInstance(fragTitle);
                break;

            case LEDGER_ALTER_FRAGMENT:
                fragment = LedgerAlterFragment.newInstance(fragTitle);
                break;

            case LEDGER_DISPLAY_FRAGMENT:
                fragment = LedgerDisplayFragment.newInstance(fragTitle);
                break;

                default:
                    fragment = ComingSoonFragment.newInstance(fragTitle);
                    break;
        }
        swithFrgment(fragment,addtobackstack);

    }

    public void swithFrgment(Fragment fragment,boolean addtobackstack){

        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.frag_container,fragment,fragment.getClass().getSimpleName());
        if(addtobackstack){
            fragmentTransaction.addToBackStack(fragment.getClass().getName());
        }
        fragmentTransaction.commit();

    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()) {
            case R.id.menu_company :
                displayFragment(LandingActivity.COMPANY_LIST_FRAGMENT, "Compnay List",true);
                break;
        }

        mDrawerLayout.closeDrawer(mNavigationView);

        return false;
    }
}

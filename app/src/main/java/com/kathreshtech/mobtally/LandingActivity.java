package com.kathreshtech.mobtally;

import android.os.Bundle;
import android.view.View;

import com.kathreshtech.mobtally.fragments.ComingSoonFragment;
import com.kathreshtech.mobtally.fragments.HomeFragment;

import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class LandingActivity extends AppCompatActivity {

    public static final int HOME_FRAGMENT = 1;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ac_landing_page);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        DrawerLayout drawerLayout = findViewById(R.id.drawer_layout);
        setupToggle(drawerLayout,toolbar);
        displayFragment(HOME_FRAGMENT,"Home",true);

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


}

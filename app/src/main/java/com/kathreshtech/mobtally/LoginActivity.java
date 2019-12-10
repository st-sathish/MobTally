package com.kathreshtech.mobtally;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnSkip,btnlogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ac_login);
        btnSkip = findViewById(R.id.btn_skip);
        btnlogin = findViewById(R.id.btn_login);

        btnSkip.setOnClickListener(this);
        btnlogin.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.btn_skip :
                startLandingPageActivity();
                break;

            case  R.id.btn_login :
                startLandingPageActivity();
                break;
        }

    }

    private void startLandingPageActivity(){
        Intent intent = new Intent(this,LandingActivity.class);
        startActivity(intent);
    }

}

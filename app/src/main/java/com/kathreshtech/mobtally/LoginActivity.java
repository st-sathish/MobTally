package com.kathreshtech.mobtally;

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
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.btn_skip :
                
                break;

            case  R.id.btn_login :
                break;
        }

    }
}

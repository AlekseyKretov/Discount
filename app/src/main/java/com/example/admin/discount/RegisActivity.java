package com.example.admin.discount;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Admin on 02.11.2017.
 */


public class RegisActivity  extends AppCompatActivity {
    Button btnOK;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        btnOK = (Button)findViewById(R.id.okButton);
        View.OnClickListener oclBtnOK = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentClass = new Intent(RegisActivity.this, MainActivity.class);
                startActivity(intentClass);
            }
        };
        btnOK.setOnClickListener(oclBtnOK);
    };
}
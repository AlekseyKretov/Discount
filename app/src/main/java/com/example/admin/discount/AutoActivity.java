package com.example.admin.discount;

/**
 * Created by Admin on 02.11.2017.
 * regAutoButton
 */


import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Button;

public class AutoActivity extends Activity{

    Button btnRegAuto;
    Button btnInp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_autorization);

        btnRegAuto = (Button)findViewById(R.id.regAutoButton);
        btnInp = (Button)findViewById(R.id.inputButton);
        View.OnClickListener oclBtnRegAuto = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentClass = new Intent(AutoActivity.this, RegisActivity.class);
                startActivity(intentClass);
            }
        };
        View.OnClickListener oclBtnInp = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentClass = new Intent(AutoActivity.this, MainActivity.class);
                startActivity(intentClass);
            }
        };
        btnRegAuto.setOnClickListener(oclBtnRegAuto);
        btnInp.setOnClickListener(oclBtnInp);
        };
}

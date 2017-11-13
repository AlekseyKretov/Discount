package com.example.admin.discount;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by Admin on 02.11.2017.
 */

public class WorkingPromotionActivity  extends Activity {
    Button btnSave;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_working_promotions);

        btnSave = (Button)findViewById(R.id.addPromsaveButton);
        View.OnClickListener oclBtnSave = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentClass = new Intent(WorkingPromotionActivity.this, ShopDiscountActivity.class);
                startActivity(intentClass);
            }
        };
        btnSave.setOnClickListener(oclBtnSave);
    };
}
package com.example.admin.discount;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

/**
 * Created by Admin on 02.11.2017.
 */

public class DiscountProductActivity  extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_discount_productlist);
    };
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_discount_productlist, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();


        switch (id) {
            case R.id.action_add:
                {
                    Intent intentClass = new Intent(DiscountProductActivity.this, WorkingProductActivity.class);
                    startActivity(intentClass);
                };
                return true;
            case R.id.action_edit:
            {
                Intent intentClass = new Intent(DiscountProductActivity.this, WorkingProductActivity.class);
                startActivity(intentClass);
            };
            return true;
            case R.id.action_back_to_discountslist:
            {
                Intent intentClass = new Intent(DiscountProductActivity.this, ShopDiscountActivity.class);
                startActivity(intentClass);
            };
            return true;
            case R.id.action_edit_back_to_map:
            {
                Intent intentClass = new Intent(DiscountProductActivity.this, MainActivity.class);
                startActivity(intentClass);
            };
            return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}

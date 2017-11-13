package com.example.admin.discount;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

/**
 * Created by Admin on 02.11.2017.
 */

public class ShopDiscountActivity  extends AppCompatActivity {
    TableLayout tableLayoutDiscounts;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shops_discountlist);

        tableLayoutDiscounts = (TableLayout)findViewById(R.id.tableDiscounts);

        View.OnClickListener oclCellTable = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentClass = new Intent(ShopDiscountActivity.this, DiscountProductActivity.class);
                startActivity(intentClass);
            }
        };

        TextView textView1 = new TextView(this);
        textView1.setText("test 1");
        TextView textView2 = new TextView(this);
        textView2.setText("test 2");
        TextView textView3 = new TextView(this);
        textView3.setText("test 3");
        TableRow tableRow1 = new TableRow(this);
        tableRow1.addView(textView1);
        tableRow1.addView(textView2);
        tableRow1.addView(textView3);
        textView1.setOnClickListener(oclCellTable);
        textView2.setOnClickListener(oclCellTable);
        textView3.setOnClickListener(oclCellTable);
        tableLayoutDiscounts.addView(tableRow1);
    };
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_shops_discountlist, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();


        switch (id) {
            case R.id.action_add:
            {
                Intent intentClass = new Intent(ShopDiscountActivity.this, WorkingPromotionActivity.class);
                startActivity(intentClass);
            };
            return true;
            case R.id.action_edit:
            {
                Intent intentClass = new Intent(ShopDiscountActivity.this, WorkingPromotionActivity.class);
                startActivity(intentClass);
            };
            return true;
            case R.id.action_edit_back_to_map:
            {
                Intent intentClass = new Intent(ShopDiscountActivity.this, MainActivity.class);
                startActivity(intentClass);
            };
            return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
package com.example.admin.discount;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.QuickContactBadge;
import android.widget.TextView;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapView;

public class MainActivity extends Activity {

    QuickContactBadge qckContactBadge;
    Button btnFavotites;
    MapView mapView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        qckContactBadge = (QuickContactBadge)findViewById(R.id.quickContactBadge2);
        btnFavotites = (Button)findViewById(R.id.favoritesButton);
        mapView = (MapView)findViewById(R.id.mapView);
        OnClickListener oclQckContactBadge = new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentClass = new Intent(MainActivity.this, AutoActivity.class);
                startActivity(intentClass);
            }
        };
        OnClickListener oclBtnFavotites = new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentClass = new Intent(MainActivity.this, FavoritesActivity.class);
                startActivity(intentClass);
            }
        };
        OnClickListener oclMapView = new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentClass = new Intent(MainActivity.this, ShopDiscountActivity.class);
                startActivity(intentClass);
            }
        };
        qckContactBadge.setOnClickListener(oclQckContactBadge);
        btnFavotites.setOnClickListener(oclBtnFavotites);
        mapView.setOnClickListener(oclMapView);
    }
}

package com.example.myselfapps;
//Nama : Rizky Muslimin
//NIM : 10118002
//Kelas : IF-1

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.apps.myselfapps.MainActivity;
import com.apps.myselfapps.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class GalleryActivity extends AppCompatActivity {

    GridView gridView;
    int[] iconList = new int[]{
            R.drawable.pp, R.drawable.potoprofile
    };
    String[] Headline = {"At Night", "At noon"
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery);

        GridViewCustom gridViewCustom = new GridViewCustom(GalleryActivity.this, iconList, Headline);
        gridView = findViewById(R.id.grid_view);
        gridView.setAdapter(gridViewCustom);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
                Toast.makeText(GalleryActivity.this, "GridView Item: "
                        + Headline[+position], Toast.LENGTH_SHORT).show();

            }
        });


        //inisialisasi variabel
        BottomNavigationView bottomNavigationView = findViewById(R.id.bot_nav);

        //Set Main Selected
        bottomNavigationView.setSelectedItemId(R.id.gallery);

        //selected listener
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()) {
                    case R.id.daily:
                        startActivity(new Intent(getApplicationContext()
                                ,DailyActivity.class));
                        overridePendingTransition(0, 0);
                        return true;
                    case R.id.gallery:
                        return true;
                    case R.id.home:
                        startActivity(new Intent(getApplicationContext()
                                , MainActivity.class));
                        overridePendingTransition(0, 0);
                        return true;
                    case R.id.music:
                        startActivity(new Intent(getApplicationContext()
                                , MusicActivity.class));
                        overridePendingTransition(0, 0);
                        return true;
                    case R.id.profile:
                        startActivity(new Intent(getApplicationContext()
                                , AboutActivity.class));
                        overridePendingTransition(0, 0);
                        return true;
                }
                return false;
            }
        });
    }
}

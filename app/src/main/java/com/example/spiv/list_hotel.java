package com.example.spiv;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.icu.text.UnicodeSetSpanner;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

public class list_hotel extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{
    private ListView listViewId;
    private String[] HotelName;
    DrawerLayout drawerLayout;
    ActionBarDrawerToggle toggle;
    private SearchView searchView;
    public Intent intent;
    private int[] Picture={R.drawable.radisson,R.drawable.panspacific_sonargong,R.drawable.longbeachsuites,R.drawable.regency_hotel,
            R.drawable.richmond,R.drawable.sarina,R.drawable.sayaji};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_hotel);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        listViewId=findViewById(R.id.listViewId);

        drawerLayout=findViewById(R.id.drawerId);
        NavigationView navigationView=findViewById(R.id.navigationId);
        navigationView.setNavigationItemSelectedListener(this);

        toggle=new ActionBarDrawerToggle(this,drawerLayout,R.string.nav_open,R.string.nav_close);

        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        HotelName=getResources().getStringArray(R.array.Hotel_Name);
        final customAdapter adapter=new customAdapter(this,HotelName,Picture);
        listViewId.setAdapter(adapter);

        listViewId.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String value=HotelName[i];
                if (value.equals("Radisson"))
                {
                    intent=new Intent(list_hotel.this,describe_hotel.class);
                    startActivity(intent);

                }
                if (value.equals("Long Beach Suites"))
                {
                    intent=new Intent(list_hotel.this,long_beach_suites.class);
                    startActivity(intent);

                }

            }
        });
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater=getMenuInflater();
        menuInflater.inflate(R.menu.menu_layout,menu);
        return super.onCreateOptionsMenu(menu);
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId()==R.id.FeedbackId)
        {
            Intent intent=new Intent(list_hotel.this,feedback.class);
            startActivity(intent);
        }
        if (item.getItemId()==R.id.About_UsId)
        {

            Intent intent=new Intent(list_hotel.this,profile.class);
            startActivity(intent);
        }

        return super.onOptionsItemSelected(item);
    }
    /*@Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
       if (toggle.onOptionsItemSelected(item))
       {
           return true;
       }

        return super.onOptionsItemSelected(item);
    }*/

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        if (item.getItemId()==R.id.shareId)
        {
            Intent intent=new Intent(this,profile.class);
            startActivity(intent);
        }
        return false;
    }
}
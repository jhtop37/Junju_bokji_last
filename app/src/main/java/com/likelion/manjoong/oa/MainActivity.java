package com.likelion.manjoong.oa;

import android.app.Fragment;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.content.Context;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;
import android.view.View;
import android.support.v7.widget.Toolbar;
import java.lang.reflect.GenericArrayType;


//url웹뷰 추강ㅎㅎ
import android.net.Uri;

public class MainActivity extends AppCompatActivity {

    private DrawerLayout drawerLayout;
    Context context = MainActivity.this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar)findViewById(R.id.tool_bar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);

        toolbar.findViewById(R.id.toolbar_email).setOnClickListener(new View.OnClickListener(){
          @Override
            public void onClick(View view){
              Toast.makeText(MainActivity.this, "아직 도착안했다이미마", Toast.LENGTH_SHORT).show();
          }
        });



        final DrawerLayout drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle actionBarDrawerToggle = new ActionBarDrawerToggle(this,drawerLayout,toolbar,0,0);
        drawerLayout.setDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.main_navigationView);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item){

                if(item.getItemId() == R.id.peopleless){
                    getFragmentManager().beginTransaction().replace(R.id.main_framelayout,new FirstFragment()).commit();
                }
                if(item.getItemId() == R.id.police){
                    getFragmentManager().beginTransaction().replace(R.id.main_framelayout,new SecondFragment()).commit();
                }
                if(item.getItemId() == R.id.lost_item){
                    getFragmentManager().beginTransaction().replace(R.id.main_framelayout,new LostItemActivity()).commit();
                }
                if(item.getItemId() == R.id.stop_car){
                    getFragmentManager().beginTransaction().replace(R.id.main_framelayout,new StopCarActivity()).commit();
                }
                if(item.getItemId() == R.id.education){
                    getFragmentManager().beginTransaction().replace(R.id.main_framelayout,new EducationActivity()).commit();
                }
                if(item.getItemId() == R.id.education2){
                    getFragmentManager().beginTransaction().replace(R.id.main_framelayout,new Education2Activity()).commit();
                }
                if(item.getItemId() == R.id.new_book){
                    getFragmentManager().beginTransaction().replace(R.id.main_framelayout,new NewBookActivity()).commit();
                }
                if(item.getItemId() == R.id.festival){
                    getFragmentManager().beginTransaction().replace(R.id.main_framelayout,new FestivalActivity()).commit();
                }
                drawerLayout.closeDrawer(GravityCompat.START);
                return false;
            }
        });
    }
}


package com.likelion.manjoong.oa;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.TabHost;
import android.widget.TextView;
import android.widget.Toast;

//url웹뷰 추강ㅎㅎ

public class MainActivity extends AppCompatActivity {
    private DrawerLayout drawerLayout;
    TabHost tabHost;
    Context context = MainActivity.this;
    TextView txt1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar)findViewById(R.id.tool_bar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);

        toolbar.findViewById(R.id.main_logo).setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });

        toolbar.findViewById(R.id.toolbar_email).setOnClickListener(new View.OnClickListener(){
          @Override
            public void onClick(View view){
              Toast.makeText(MainActivity.this, "전주시청 대표전화 063-222-1000 \n팩스 063-281-5000", Toast.LENGTH_SHORT).show();
          }
        });

        TabHost tabs = (TabHost)findViewById(R.id.tabhost);
        tabs.setup();

        TabHost.TabSpec spec = tabs.newTabSpec("복지 소개");
        spec.setContent(R.id.tab1);
        spec.setIndicator("전주 복지 정보");
        tabs.addTab(spec);

        spec = tabs.newTabSpec("복지 소개");
        spec.setContent(R.id.tab2);
        spec.setIndicator("전주 복지 시설");
        tabs.addTab(spec);

        spec = tabs.newTabSpec("복지 소개");
        spec.setContent(R.id.tab3);
        spec.setIndicator("전주 무료 급식소");
        tabs.addTab(spec);

        tabs.setCurrentTab(0);

        final DrawerLayout drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle actionBarDrawerToggle = new ActionBarDrawerToggle(this,drawerLayout,toolbar,0,0);
        drawerLayout.setDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.main_navigationView);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item){

                if(item.getItemId() == R.id.peopleless){
                    Intent intent = new Intent(getApplicationContext(), PeoplelessActivity.class);
                    startActivity(intent);
                }
                if(item.getItemId() == R.id.stop_car){
                    getFragmentManager().beginTransaction().replace(R.id.main_framelayout,new StopCarActivity()).commit();
                }
                if(item.getItemId() == R.id.police){
                    Intent intent = new Intent(getApplicationContext(), PoliceActivity.class);
                    startActivity(intent);
                }
                if(item.getItemId() == R.id.lost_item){
                    getFragmentManager().beginTransaction().replace(R.id.main_framelayout,new LostItemActivity()).commit();
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


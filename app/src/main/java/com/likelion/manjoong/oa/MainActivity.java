package com.likelion.manjoong.oa;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TabHost;

/**
 *  애플리케이션을 실행하면 제일 처음에 보이는 액티비티////
 *  최상위 레이아웃의 UI를 설정해야 함.
 *  원래는 약 3~5초간 해당 화면을 보여주고 MenuActivity로 넘어가려고 했으나,
 *  개발단계에서는 버튼을 클릭함으로써 MenuActivity로 전환
 */

public class MainActivity extends Activity {
    TabHost tabHost;
    Context context = MainActivity.this;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TabHost tabHost1 = (TabHost) findViewById(R.id.tabHost1);
        tabHost1.setup();

        // 첫 번째 Tab. (탭 표시 텍스트:"TAB 1"), (페이지 뷰:"content1")
        TabHost.TabSpec ts1 = tabHost1.newTabSpec("Tab Spec 1");
        ts1.setContent(R.id.tab1);
        ts1.setIndicator("소 식");
        tabHost1.addTab(ts1);

        // 두 번째 Tab. (탭 표시 텍스트:"TAB 2"), (페이지 뷰:"content2")
        TabHost.TabSpec ts2 = tabHost1.newTabSpec("Tab Spec 2");
        ts2.setContent(R.id.tab2);
        ts2.setIndicator("복 지");
        tabHost1.addTab(ts2);

        // 세 번째 Tab. (탭 표시 텍스트:"TAB 3"), (페이지 뷰:"content3")
        TabHost.TabSpec ts3 = tabHost1.newTabSpec("Tab Spec 3");
        ts3.setContent(R.id.tab3);
        ts3.setIndicator("생 활");
        tabHost1.addTab(ts3);

        // 네 번째 Tab. (탭 표시 텍스트:"TAB 4"), (페이지 뷰:"content4")
        TabHost.TabSpec ts4 = tabHost1.newTabSpec("Tab Spec 4");
        ts4.setContent(R.id.tab4);
        ts4.setIndicator("소 통");
        tabHost1.addTab(ts4);

    }
    public void btn_Newnews(View v) {
        Uri uri = Uri.parse("http://www.jeonju.go.kr/planweb/board/list.9is?contentUid=9be517a74f8dee91014f9194f6070bf8&boardUid=9be517a74f8dee91014f90e8502d0602&contentUid=9be517a74f8dee91014f9194f6070bf8");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }
    public void btn_Newbook(View v) {
        Uri uri = Uri.parse("http://www.jeonju.go.kr/common/search/search.jsp");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }
    public void btn_Education(View v) {
        Uri uri = Uri.parse("http://www.jeonju.go.kr/common/search/search.jsp");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }
    public void btn_ServiceSearch(View v) {
        Intent intent = new Intent(MainActivity.this, WelfareSearch.class);
        startActivity(intent);
    }
    public void btn_FacilitySearch(View v) {
        Intent intent = new Intent(MainActivity.this, WelfareFacilitySearch.class);
        startActivity(intent);
    }
    public void btn_FreeEat(View v) {
        Intent intent = new Intent(MainActivity.this, FreeEat.class);
        startActivity(intent);
    }

    public void btn_Police(View v) {
        Intent intent = new Intent(MainActivity.this, PoliceActivity.class);
        startActivity(intent);
    }
    public void btn_Peopleless(View v) {//
        Intent intent = new Intent(MainActivity.this, PeoplelessActivity.class);
        startActivity(intent);
    }
    public void btn_Parking(View v) {
        Uri uri = Uri.parse("https://parkingsms.jeonju.go.kr ");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }
    public void btn_StreetLamp(View v) {
        Uri uri = Uri.parse("http://ws.roadlighting.kr/slamp");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }
    public void btn_Hall(View v) {
        Uri uri = Uri.parse("http://edu.jeonju.go.kr");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }
}



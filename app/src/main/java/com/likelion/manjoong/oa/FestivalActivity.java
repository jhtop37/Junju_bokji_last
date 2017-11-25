package com.likelion.manjoong.oa;

import android.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * Created by YuJiHyun on 2017-11-25.
 */
public class FestivalActivity extends Fragment{
    private View rootView;
    WebView mWeb;
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedIinstanceState){
        Log.e("here", "m.m2");

        rootView = inflater.inflate(R.layout.activity_festival, container, false);
        Log.e("here", "m.m");

        mWeb = (WebView)rootView. findViewById(R.id.webview_festival);
        mWeb.setWebViewClient(new MyWebClient());
        WebSettings set = mWeb.getSettings();
        set.setJavaScriptEnabled(true);
        set.setBuiltInZoomControls(true);
        mWeb.loadUrl("http://www.jeonju.go.kr/planweb/board/list.9is?contentUid=9be517a74f8dee91014f919636db0c07&boardUid=9be517a74f8dee91014f90eb023c0639&contentUid=9be517a74f8dee91014f919636db0c07");

        return rootView;
    }

    class MyWebClient extends WebViewClient{
        public boolean shouldOverrideUrlLoading(WebView view, String url){
            view.loadUrl(url);
            return true;
        }

    }
}


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
public class EducationActivity extends Fragment{
    private View rootView;
    WebView mWeb;
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedIinstanceState){
        Log.e("here", "m.m2");

        rootView = inflater.inflate(R.layout.activity_education, container, false);
        Log.e("here", "m.m");

        mWeb = (WebView)rootView. findViewById(R.id.webview_education);
        mWeb.setWebViewClient(new MyWebClient());
        WebSettings set = mWeb.getSettings();
        set.setJavaScriptEnabled(true);
        set.setBuiltInZoomControls(true);
        mWeb.loadUrl("http://edu.jeonju.go.kr/");
        return rootView;
    }

    class MyWebClient extends WebViewClient{
        public boolean shouldOverrideUrlLoading(WebView view, String url){
            view.loadUrl(url);
            return true;
        }

    }
}


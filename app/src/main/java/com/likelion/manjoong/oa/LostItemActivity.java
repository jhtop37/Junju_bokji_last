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
public class LostItemActivity extends Fragment{
    private View rootView;
    WebView mWeb;
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedIinstanceState){
        Log.e("here", "m.m2");

        rootView = inflater.inflate(R.layout.activity_lostitem, container, false);
        Log.e("here", "m.m");

        mWeb = (WebView)rootView. findViewById(R.id.webview_lostitem);
        mWeb.setWebViewClient(new MyWebClient());
        WebSettings set = mWeb.getSettings();
        set.setJavaScriptEnabled(true);
        set.setBuiltInZoomControls(true);
        mWeb.loadUrl("http://www.jeonju.go.kr/planweb/board/list.9is?boardUid=9be517a74f8dee91014f95aff6121499&dataUid=&layoutUid=9be517a74f72e96b014f81ffae3a005b&contentUid=9be517a74f8dee91014f95b1af6014bc#start");

        return rootView;
    }

    class MyWebClient extends WebViewClient{
        public boolean shouldOverrideUrlLoading(WebView view, String url){
            view.loadUrl(url);
            return true;
        }

    }
}


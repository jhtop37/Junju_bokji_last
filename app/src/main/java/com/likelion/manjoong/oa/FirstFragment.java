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
public class FirstFragment extends Fragment{
    private View rootView;
    WebView mWeb;
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedIinstanceState){
        Log.e("here", "m.m2");

        rootView = inflater.inflate(R.layout.activity_education_support, container, false);
        Log.e("here", "m.m");

        mWeb = (WebView)rootView. findViewById(R.id.webview_education_support);
        mWeb.setWebViewClient(new MyWebClient());
        WebSettings set = mWeb.getSettings();
        set.setJavaScriptEnabled(true);
        set.setBuiltInZoomControls(true);
        mWeb.loadUrl("https://www.google.com/maps/d/viewer?hl=ko&mid=1wl5j_FKgaJxEBwPsdIEy006asoU&ll=35.818223811025035%2C127.11472609999998&z=12");
        return rootView;
    }

    class MyWebClient extends WebViewClient{
        public boolean shouldOverrideUrlLoading(WebView view, String url){
            view.loadUrl(url);
            return true;
        }
    }
}

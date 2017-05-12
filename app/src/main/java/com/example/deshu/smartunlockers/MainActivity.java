package com.example.deshu.smartunlockers;

import android.app.Activity;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class MainActivity extends ActionBarActivity {
    private WebView myWebview;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myWebview=(WebView)findViewById(R.id.WebView);
        WebSettings WebSettings =myWebview.getSettings();
        WebSettings.setJavaScriptEnabled(true);
        myWebview.loadUrl("http://smartunlockers.in/");
    }
}

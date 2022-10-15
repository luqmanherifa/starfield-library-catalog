package com.luqman.uas.katalogstarfieldbuku;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

import androidx.appcompat.app.AppCompatActivity;

public class InfoBantuan extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.info_webview);
        final WebView webView = (WebView)findViewById(R.id.webView);
        WebSettings webViewSettings = webView.getSettings();
        webViewSettings.setDefaultFontSize(12);

        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl("file:///android_asset/bantuan.html");

    }

}
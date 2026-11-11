package com.samim.htmlbuilder;

import android.app.*;
import android.os.*;
import android.webkit.*;
import android.view.*;
import android.widget.*;
import android.content.*;
import android.net.*;
import android.graphics.Color;

public class MainActivity extends Activity {

    LinearLayout layout;
    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.setBackgroundColor(Color.WHITE);

        TextView title = new TextView(this);
        title.setText("SAMIM HTML TO APK BUILDER");
        title.setTextSize(20);
        title.setTextColor(Color.BLACK);
        title.setPadding(15,20,15,20);

        webView = new WebView(this);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setDomStorageEnabled(true);
        webView.setWebViewClient(new WebViewClient());

        webView.loadData(
            "<html><body style='background:#08111f;color:white;text-align:center;padding:40px;font-family:Arial'>"
            + "<h1>SAMIM HTML BUILDER</h1>"
            + "<h3>Welcome!</h3>"
            + "<p>Online APK Builder Ready</p>"
            + "</body></html>",
            "text/html",
            "UTF-8"
        );

        layout.addView(title);
        layout.addView(webView);

        setContentView(layout);
    }
}

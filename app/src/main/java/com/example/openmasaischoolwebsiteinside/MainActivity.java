package com.example.openmasaischoolwebsiteinside;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {
    private Button btnmasai;
    private WebView webmasai;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnmasai=findViewById(R.id.btnmasai);
        webmasai=findViewById(R.id.webmasai);
        btnmasai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                webmasai.getSettings().getJavaScriptEnabled();
                webmasai.loadUrl("https://www.masaischool.com/");
            }
        });
    }
}
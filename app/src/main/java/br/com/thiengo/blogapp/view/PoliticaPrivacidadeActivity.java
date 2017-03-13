package br.com.thiengo.blogapp.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

import br.com.thiengo.blogapp.R;

public class PoliticaPrivacidadeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_politica_privacidade);

        WebView webView = (WebView) findViewById(R.id.wv_content);
        //webView.loadUrl("https://blogapptestblog.wordpress.com/politica-de-privacidade/");
        webView.loadUrl("file:///android_asset/politica_privacidade.html");
    }
}

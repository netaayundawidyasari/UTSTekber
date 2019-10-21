package com.aplikasi.utstekber;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentProvider;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ContentProvidersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content_providers);

        Button button12 = (Button) findViewById(R.id.button12);

        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btn12 = new Intent(ContentProvidersActivity.this,SyntaxContentProvidersActivity.class);
                startActivity(btn12);
            }
        });
    }

    public void LinkContentProviders(View view) {
        Intent browserIntent= new Intent(Intent.ACTION_VIEW, Uri.parse("https://developer.android.com/guide/topics/providers/content-provider-creating?hl=id"));
        startActivity(browserIntent);
    }
}

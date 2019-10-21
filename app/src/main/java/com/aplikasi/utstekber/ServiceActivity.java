package com.aplikasi.utstekber;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ServiceActivity extends AppCompatActivity {
Button button8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service);

        button8= (Button) findViewById(R.id.button8);

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btn8= new Intent(ServiceActivity.this,SyntaxActivity.class);
                startActivity(btn8);
            }
        });
    }

    public void LinkService(View view) {
        Intent browserIntent= new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.sinaryuda.web.id/tutorial/android-services-lifecycle.html"));
        startActivity(browserIntent);
    }
}

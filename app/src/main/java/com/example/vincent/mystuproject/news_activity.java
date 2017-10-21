package com.example.vincent.mystuproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class news_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.news_layout);

        TextView textView = (TextView) findViewById(R.id.news_more_more);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(news_activity.this, "You clickeed 更多", Toast.LENGTH_SHORT).show();
            }
        });


    }
}

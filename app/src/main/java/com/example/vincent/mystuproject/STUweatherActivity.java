package com.example.vincent.mystuproject;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by VINCENT on 2017/10/15.
 */

public class STUweatherActivity extends AppCompatActivity {

    /**获取温度 湿度  天气情况  污染程度*/

    private TextView stuweather;
    private TextView stu_tem;
    private TextView stu_hum;
    private TextView stu_PM;
    private TextView stu_co;

    private CardView stuWeaTEM;
    private CardView stuHum;
    private CardView stuPmCo;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.stuweather_layout);

        stuWeaTEM = (CardView) findViewById(R.id.stu_cardview_WeatherandTem);
        stuWeaTEM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(STUweatherActivity.this, "You clicked the WeatherandTem",Toast.LENGTH_LONG);
            }
        });

        stuWeaTEM = (CardView) findViewById(R.id.stu_cardview_humidity);
        stuWeaTEM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(STUweatherActivity.this, "You clicked the hum",Toast.LENGTH_LONG);
            }
        });

        stuWeaTEM = (CardView) findViewById(R.id.stu_cardview_pollution);
        stuWeaTEM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(STUweatherActivity.this, "You clicked the pollusion",Toast.LENGTH_LONG);
            }
        });


    }
}

package com.example.vincent.mystuproject;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class CityWeatherActivity extends AppCompatActivity {

    private RecyclerView cityweatherLayout;

    private TextView titleCity;
    private TextView cityDegreeText;
    private TextView cityWeatherInfoText;
    private LinearLayout forecastLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_city_weather);

        TextView textView1 =(TextView) findViewById(R.id.city_weather_more);
        textView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(CityWeatherActivity.this, "你点击了更多即将跳转界面", Toast.LENGTH_SHORT).show();
            }
        });


        cityweatherLayout = (RecyclerView) findViewById(R.id.city_weahter_recycle);/**
         RecycleView 部分还不会解决
         */
        titleCity = (TextView) findViewById(R.id.city_title);
        cityDegreeText =(TextView) findViewById(R.id.city_degree_text);
        cityWeatherInfoText= (TextView) findViewById(R.id.city_weahter_info_text);
        forecastLayout= (LinearLayout) findViewById(R.id.forecast_layout);

        /**
        SharedPreferences prefs= PreferenceManager.getDefaultSharedPreferences(this);
        String cityWeatherString= prefs.getString("weather",null);
        if (cityWeatherString !=null){

        }

         还没有添加天气数据库
         */
        /**
         * 这部分参考第一行代码即可
         * */
    }
}

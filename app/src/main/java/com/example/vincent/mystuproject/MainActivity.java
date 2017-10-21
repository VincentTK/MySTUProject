package com.example.vincent.mystuproject;

import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private DrawerLayout mDrawerLayout;

    private TextView  viewSTU;
    private Spinner   spinnerSTU;
    private ArrayAdapter adapterSTU;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);

        RecyclerView  recyclerView= (RecyclerView) findViewById(R.id.main_layout);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        RecycleAdapter adapter= new RecycleAdapter();
        recyclerView.setAdapter(adapter);

        NavigationView navView = (NavigationView) findViewById(R.id.nav_view);
        ActionBar actionBar = getSupportActionBar();
        if (actionBar !=null){
            actionBar.setDisplayHomeAsUpEnabled(true); /**显示HomeAsUp这个导航按钮*/
            actionBar.setHomeAsUpIndicator(R.mipmap.ic_menu);
        }
        navView.setCheckedItem(R.id.nav_profile);
        navView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int menuid = item.getItemId();
                if (menuid==R.id.nav_profile){
                   Toast.makeText(MainActivity.this,"点击了账户信息",Toast.LENGTH_SHORT).show();
                }else if (menuid == R.id.nav_calendar){
                    Toast.makeText(MainActivity.this,"点击了日历",Toast.LENGTH_SHORT).show();
                }else if (menuid == R.id.nav_favourites){
                    Toast.makeText(MainActivity.this,"点击了喜欢",Toast.LENGTH_SHORT).show();
                }else if (menuid == R.id.nav_setting){
                    Toast.makeText(MainActivity.this,"点击了设置",Toast.LENGTH_SHORT).show();
                }
                return  true;
            }
        });

        spinnerSTU =(Spinner) findViewById(R.id.stu_position_spinner);
       /** viewSTU =  (TextView) findViewById(R.id.stu_position_text);*/
        //将可选内容与ArrayAdapter连接起来
        adapterSTU=ArrayAdapter.createFromResource(this,R.array.stu_position_choose,android.R.layout.simple_spinner_item);

        adapterSTU.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        //将adapter2 添加到spinner中
        spinnerSTU.setAdapter(adapterSTU);

        /**spinnerSTU.setOnItemSelectedListener(new SpinnerSTUItemSelcetedListeners());
         * 为Spinner 设置各个点击事件还未实现
         * */
    }
   /** 下面这段不是很理解*/
   /** 这里实际上是对Android自带的Toolbar进行了更改，更改了HomeAsUp按钮的模式
    * 其实这部分可以直接用自定义的Toolbar控件来实现，看是否需要而已，
    * 如果确实需要toolbar也可以对系统自带的进行更改达到自己的需求
    * */

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case android.R.id.home:
                mDrawerLayout.openDrawer(GravityCompat.START); /**打开侧滑滑动菜单栏*/
                break;

            default:
        }
        return true;
    }
}

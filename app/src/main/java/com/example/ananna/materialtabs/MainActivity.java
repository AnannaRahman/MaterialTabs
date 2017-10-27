package com.example.ananna.materialtabs;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    private ViewPager viewPager;
    private Toolbar toolBar;
    private TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tabLayout =(TabLayout)findViewById(R.id.tabLayout);
        toolBar = (Toolbar) findViewById(R.id.toolBarLayout);
        viewPager =(ViewPager)findViewById(R.id.viewPager);
    }
}

package com.example.test_tablayout;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.example.test_tablayout.Fragments.BlankFragment;
import com.example.test_tablayout.Fragments.BlankFragment2;
import com.example.test_tablayout.Fragments.BlankFragment3;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TabLayout tabLayout = findViewById(R.id.tab_layout);
        ViewPager viewPager = findViewById(R.id.view_pager);

        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());
        viewPagerAdapter.AddFragment(new BlankFragment(), "First Fmt");
        viewPagerAdapter.AddFragment(new BlankFragment2(), "Second Fmt");
        viewPagerAdapter.AddFragment(new BlankFragment3(), "Third Fmt");

        viewPager.setAdapter(viewPagerAdapter);
        tabLayout.setupWithViewPager(viewPager);

    }
}

package com.example.tablayoutbotomnavigation;

import android.os.Bundle;
import android.view.MenuItem;
import androidx.annotation.NonNull;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;
import com.google.android.material.tabs.TabLayout;


import androidx.appcompat.app.AppCompatActivity;

import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.ViewPager;



import fragment.ViewPagerAdapter;

public class MainActivity extends AppCompatActivity {

private ViewPager  viewPager;
private BottomNavigationView bottomNavigationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // Đảm bảo bạn đã đặt view cho layout

        viewPager = findViewById(R.id.view_pager);
        bottomNavigationView = findViewById(R.id.botom_navigation);

        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager(), FragmentStatePagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        viewPager.setAdapter(adapter);
        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                if (item.getItemId() == R.id.menu_1) {
                    viewPager.setCurrentItem(0);
                } else if (item.getItemId() == R.id.menu_2) {
                    viewPager.setCurrentItem(1);
                } else if (item.getItemId() == R.id.menu_3) {
                    viewPager.setCurrentItem(2);
                }
                return true;
            }
        });




        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {}

            @Override
            public void onPageSelected(int position) {
                switch (position) {
                    case 0:
                        bottomNavigationView.getMenu().findItem(R.id.menu_1).setChecked(true);
                        break;
                    case 1:
                        bottomNavigationView.getMenu().findItem(R.id.menu_2).setChecked(true);
                        break;
                    case 2:
                        bottomNavigationView.getMenu().findItem(R.id.menu_3).setChecked(true);
                        break;
                }
            }

            @Override
            public void onPageScrollStateChanged(int state) {}
        });

            }


    }


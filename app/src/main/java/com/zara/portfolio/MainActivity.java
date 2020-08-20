package com.zara.portfolio;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;
import com.zara.portfolio.ui.mon.MondayFragment;
import com.zara.portfolio.ui.tue.TuesDayFragment;
import com.zara.portfolio.ui.wed.WednesdayFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 1.get viewpager from xml
        ViewPager vp = findViewById(R.id.vp);

        // 2.make viewpager adapter
        vp.setAdapter(new DayRvAdapter(getSupportFragmentManager(), 0));

        // 3. connect tablayout and viewpager
        TabLayout tabLayout = findViewById(R.id.tabLayout);
        tabLayout.setupWithViewPager(vp);

        // finish how to make viewpager and tablayout

    }

    class DayRvAdapter extends FragmentStatePagerAdapter {

        public DayRvAdapter(@NonNull FragmentManager fm, int behavior) {
            super(fm, behavior);
        }

        @NonNull
        @Override
        public Fragment getItem(int position) {
            switch (position) {
                case 0:
                    return new MondayFragment();
                case 1:
                    return new TuesDayFragment();
                case 2:
                    return new WednesdayFragment();
            }
            return new MondayFragment();
        }

        @Override
        public int getCount() {
            return 3;
        }

        @Nullable
        @Override
        public CharSequence getPageTitle(int position) {
            switch (position) {
                case 0:
                    return "a";
                case 1:
                    return "b";
                case 2:
                    return "c";
            }
            return "";
        }
    }
}

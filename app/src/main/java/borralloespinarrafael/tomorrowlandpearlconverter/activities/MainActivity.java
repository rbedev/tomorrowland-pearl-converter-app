package borralloespinarrafael.tomorrowlandpearlconverter.activities;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.content.res.ResourcesCompat;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import borralloespinarrafael.tomorrowlandpearlconverter.R;
import borralloespinarrafael.tomorrowlandpearlconverter.fragments.FragmentTMLBelgium;
import borralloespinarrafael.tomorrowlandpearlconverter.fragments.FragmentTMLWinter;

public class MainActivity extends AppCompatActivity {

    private ViewPager viewPager;
    private TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        viewPager = findViewById(R.id.container);
        viewPager.setAdapter(new SectionsPagerAdapter(getSupportFragmentManager()));

        tabLayout = findViewById(R.id.tabs);

        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.addOnTabSelectedListener(new TabLayout.ViewPagerOnTabSelectedListener(viewPager));
        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                if(tab.getPosition()==0) {
                    tabLayout.setSelectedTabIndicatorColor(ResourcesCompat.getColor(getResources(), R.color.colorTMLBelgiumLight, null));
                }else{
                    tabLayout.setSelectedTabIndicatorColor(ResourcesCompat.getColor(getResources(), R.color.colorTMLWinterLight, null));
                }
            }
            @Override
            public void onTabUnselected(TabLayout.Tab tab) {}
            @Override
            public void onTabReselected(TabLayout.Tab tab) {}
        });

    }

    public class SectionsPagerAdapter extends FragmentPagerAdapter {
        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }
        @Override
        public Fragment getItem(int position) {
            if(position == 0){
                return new FragmentTMLBelgium();
            }else{
                return new FragmentTMLWinter();
            }
        }
        @Override
        public int getCount() {
            return 2;
        }
    }
}

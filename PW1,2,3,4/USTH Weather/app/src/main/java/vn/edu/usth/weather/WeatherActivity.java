package vn.edu.usth.weather;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager.widget.PagerAdapter;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import java.util.Locale;

@SuppressWarnings("unused")
public class WeatherActivity extends AppCompatActivity {
    private ViewPager viewPager;
    private TabLayout tabLayout;
    public static final String tag = "WeatherActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //set.
        setContentView(R.layout.activity_weather);
        Log.i(tag, "On Creating");

        tabLayout = findViewById(R.id.tab_layout);
        TabLayoutMediator TabLayoutMediator = new TabLayoutMediator(tabLayout, viewPager, (tab, position) -> {
            switch (position) {
                case 0:
                    tab.setText("tab0");
                    break;
                case 1:
                    tab.setText("tab1");
                    break;
                case 2:
                    tab.setText("tab2");
                    break;
            }
        }).attach();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(tag, "On Starting");
    }
    @Override
    protected void onResume(){
        super.onResume();
        Log.i(tag,"On Resuming");
    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.i(tag,"On Stopping");
    }
    @Override
    protected void onPause(){
        super.onPause();
        Log.i(tag,"On Pausing");
    }
    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.i(tag,"On Destroying");
    }

}



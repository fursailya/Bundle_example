package app.fursa.test.test;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.Arrays;


public class TabAdapter extends FragmentPagerAdapter {
    private ArrayList<String> tabs;
    public TabAdapter(FragmentManager fm) {
        super(fm);

        tabs = new ArrayList<>(Arrays.asList(
           "Понедельник",
           "Вторник",
           "Среда"
        ));
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabs.get(position);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return DayFragment.newInstance(position);
            case 1:
                return DayFragment.newInstance(position);
            case 2:
                return DayFragment.newInstance(position);

        }
        return null;
    }

    @Override
    public int getCount() {
        return tabs.size();
    }
}

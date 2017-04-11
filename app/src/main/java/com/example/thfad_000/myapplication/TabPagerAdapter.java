package com.example.thfad_000.myapplication;

/**
 * Created by thfad_000 on 2017-04-11.
 */
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by Junyoung on 2016-06-23.
 */

public class TabPagerAdapter extends FragmentStatePagerAdapter {

    // Count number of tabs
    private int tabCount;

    public TabPagerAdapter(FragmentManager fm, int tabCount) {
        super(fm);
        this.tabCount = tabCount;
    }

    @Override
    public Fragment getItem(int position) {

        // Returning the current tabs
        switch (position) {
            case 0:
                Fragment_1 tabFragment1 = new Fragment_1();
                return tabFragment1;
            case 1:
                Fragment_2 tabFragment2 = new Fragment_2();
                return tabFragment2;
            case 2:
                Fragment_3 tabFragment3 = new Fragment_3();
                return tabFragment3;
            case 3:
                Fragment_4 tabFragment4 = new Fragment_4();
                return tabFragment4;

            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return tabCount;
    }
}
package com.example.viewpagerforswipepage;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

/**
 * Provides the appropriate {@link Fragment} for a view pager.
 */
public class SimpleFragmentPagerAdapter extends FragmentPagerAdapter {
    public SimpleFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0){
            return new MondayFragment();
        }else if (position == 1){
            return new TuesdayFragment();
        }else
        return new WednesdayFragment();
    }

    @Override
    public int getCount() {
        return 3;
    }
}

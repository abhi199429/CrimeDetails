package com.example.abhishek.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by Abhishek on 1/28/2018.
 */

public class CrimeListActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }

}

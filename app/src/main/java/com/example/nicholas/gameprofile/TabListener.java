package com.example.nicholas.gameprofile;

/**
 * Created by Nicholas on 7/18/2016.
 */

import android.app.ActionBar;
import android.app.Fragment;
import android.app.FragmentTransaction;

public class TabListener implements ActionBar.TabListener{

    Fragment tabFragment;

    public TabListener(Fragment fragment){
        this.tabFragment=fragment;
    }

    @Override
    public void onTabSelected(ActionBar.Tab tab, FragmentTransaction ft) {
        ft.replace(R.id.MyGamesContainer, tabFragment);
    }

    @Override
    public void onTabUnselected(ActionBar.Tab tab, FragmentTransaction ft) {
        ft.remove(tabFragment);
    }

    @Override
    public void onTabReselected(ActionBar.Tab tab, FragmentTransaction ft) {

    }
}

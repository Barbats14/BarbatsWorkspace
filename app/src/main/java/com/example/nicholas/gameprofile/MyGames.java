package com.example.nicholas.gameprofile;

import android.app.Fragment;
import android.app.ActionBar;
import android.app.Notification;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


public class MyGames extends AppCompatActivity {

    ActionBar.Tab activeTab, pastTab;

    Fragment activeFragment = new MyGamesActive();
    Fragment pastFragment = new MyGamesPast();

    @SuppressWarnings("deprecation")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_games);

        ActionBar actionBar = getActionBar();

        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);

        activeTab = actionBar.newTab().setText("Active Games");
        pastTab = actionBar.newTab().setText("Past Games");

        activeTab.setTabListener(new TabListener(activeFragment));
        pastTab.setTabListener(new TabListener(pastFragment));

        actionBar.addTab(activeTab);
        actionBar.addTab(pastTab);
    }
}

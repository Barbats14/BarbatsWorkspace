package com.example.nicholas.gameprofile;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.GregorianCalendar;

/**
 * Created by Nicholas on 7/18/2016.
 */
public class MyGamesPast extends Fragment{

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View activeView = inflater.inflate(R.layout.mygames_past,null);

        ArrayList<String> eventTitle = new ArrayList<>();
        eventTitle.add("Telikos Basket");
        eventTitle.add("Telikos CACKfest");
        eventTitle.add("Telikos fucksket");
        eventTitle.add("Roses 2015");
        eventTitle.add("Telikos Kypelou 2016");

        ArrayList<Integer> turnPlayers = new ArrayList<>();
        turnPlayers.add(24);
        turnPlayers.add(8);
        turnPlayers.add(16);
        turnPlayers.add(13);
        turnPlayers.add(22);

        ArrayList<Integer> totalPlayers = new ArrayList<>();
        totalPlayers.add(24);
        totalPlayers.add(9);
        totalPlayers.add(24);
        totalPlayers.add(14);
        totalPlayers.add(24);

        ArrayList<GregorianCalendar> eventDate = new ArrayList<>();
        eventDate.add(new GregorianCalendar(2016, 10, 14, 14, 15));
        eventDate.add(new GregorianCalendar(2016, 9, 24, 20, 30));
        eventDate.add(new GregorianCalendar(2016, 8, 19, 17, 15));
        eventDate.add(new GregorianCalendar(2016, 11, 24, 18, 45));
        eventDate.add(new GregorianCalendar(2016, 12, 24, 10, 30));

        ArrayList<eventInfo> events = new ArrayList<>();
        for (int i=0; i < 5; i++){
            events.add(new eventInfo(eventTitle.get(i), totalPlayers.get(i), turnPlayers.get(i), eventDate.get(i)));
        }

        activeAdapter activeGamesAdapter = new activeAdapter(this, events);
        ListView activeListView = (ListView) findViewById(R.id.pastListView);
        activeListView.setAdapter(activeGamesAdapter);

        return activeView;
    }
}

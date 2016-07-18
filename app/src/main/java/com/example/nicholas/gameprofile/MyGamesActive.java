package com.example.nicholas.gameprofile;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Nicholas on 7/18/2016.
 */
public class MyGamesActive extends Fragment{
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View activeView = inflater.inflate(R.layout.mygames_active,null);

        return activeView;
    }
}

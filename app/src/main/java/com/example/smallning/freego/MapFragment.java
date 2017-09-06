package com.example.smallning.freego;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.amap.api.maps.AMap;

import com.amap.api.maps.MapView;
import com.amap.api.maps.UiSettings;


/**
 * Created by Smallning on 2017/9/5.
 */

public class MapFragment extends Fragment {
    private MapView mapView;
    private AMap aMap;

    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_map,container,false);
        mapView=view.findViewById(R.id.map);
        mapView.onCreate(savedInstanceState);
        aMap=mapView.getMap();

        UiSettings settings=aMap.getUiSettings();
        settings.setCompassEnabled(true);

        return view;
    }
}

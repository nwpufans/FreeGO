package com.example.smallning.freego;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Smallning on 2017/9/6.
 */

public class OptionFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_option,container,false);

        RecyclerView recyclerView=view.findViewById(R.id.recyclerView);
        LinearLayoutManager layoutManager=new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);
        myAdapter adapter=new myAdapter(getItem());
        recyclerView.setAdapter(adapter);
        return view;
    }


    private List<Item> getItem(){
        List<Item> list=new ArrayList<>();
        Item item1=new Item();
        item1.setName("功能1");
        item1.setImageId(R.mipmap.ic_launcher);
        list.add(item1);
        Item item2=new Item();
        item2.setName("功能2");
        item2.setImageId(R.mipmap.ic_launcher);
        list.add(item2);
        Item item3=new Item();
        item3.setName("功能3");
        item3.setImageId(R.mipmap.ic_launcher);
        list.add(item3);
        Item item4=new Item();
        item4.setName("功能4");
        item4.setImageId(R.mipmap.ic_launcher);
        list.add(item4);
        return list;
    }
}

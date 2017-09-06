package com.example.smallning.freego;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button mainButton;
    private Button mapButton;
    private Button societyButton;
    private Button optionButton;

    private Toolbar toolbar;

    private MainFragment mainFragment;
    private MapFragment mapFragment;
    private SocietyFragment societyFragment;
    private OptionFragment optionFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar=(Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        mainButton=(Button)findViewById(R.id.mainButton);
        mapButton=(Button)findViewById(R.id.mapButton);
        societyButton=(Button)findViewById(R.id.societyButton);
        optionButton=(Button)findViewById(R.id.optionButton);
        mainButton.setOnClickListener(this);
        mapButton.setOnClickListener(this);
        societyButton.setOnClickListener(this);
        optionButton.setOnClickListener(this);

        mainFragment=new MainFragment();
        mapFragment=new MapFragment();
        societyFragment=new SocietyFragment();
        optionFragment=new OptionFragment();


    }


    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.mainButton:
                showFragment(mainFragment);
                break;
            case R.id.mapButton:
                showFragment(mapFragment);
                break;
            case R.id.societyButton:
                showFragment(societyFragment);
                break;
            case R.id.optionButton:
                showFragment(optionFragment);
                break;
            default:
                break;
        }
    }
    private void showFragment(Fragment fragment) {
        FragmentManager manager=getSupportFragmentManager();
        FragmentTransaction transaction=manager.beginTransaction();
        if(!fragment.isAdded())  {
            transaction.add(R.id.fragmentPosition,fragment);
        }
        hideFragment();
        transaction.show(fragment);
        transaction.commit();
    }

    private void hideFragment(){
        FragmentTransaction transaction=getSupportFragmentManager().beginTransaction();
        transaction.hide(mainFragment).hide(mapFragment).hide(societyFragment).hide(optionFragment);
        transaction.commit();
    }

}
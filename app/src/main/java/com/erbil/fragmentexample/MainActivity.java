package com.erbil.fragmentexample;

import android.app.FragmentManager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.erbil.fragmentexample.Fragment.FragmentA;

public class MainActivity extends AppCompatActivity implements MainView, View.OnClickListener {

    MainPresenter presenter;
    FragmentA fragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.button1).setOnClickListener(this);
        findViewById(R.id.button2).setOnClickListener(this);
        FragmentManager fragmentManager = getFragmentManager();
        fragment = (FragmentA) fragmentManager.findFragmentById(R.id.fragment_a);

        presenter = new MainPresenterImpl(this);
    }

    @Override
    public void onClick(View v) {
        findViewById(R.id.fragment_a_layout).setVisibility(View.VISIBLE);
        presenter.sendText(v);
    }

    @Override
    public void setFragmentText(String name) {
        fragment.setText("Button " + name  + " clicked...");
    }
}

package com.erbil.fragmentexample;

import android.app.Activity;
import android.app.FragmentManager;
import android.view.View;

import com.erbil.fragmentexample.Fragment.FragmentA;

public class MainPresenterImpl implements MainPresenter {

    private Activity activity;

    public MainPresenterImpl(Activity activity) {
        this.activity = activity;
    }

    @Override
    public void sendText(View v) {

        FragmentManager fragmentManager = activity.getFragmentManager();
        FragmentA fragment = (FragmentA) fragmentManager.findFragmentById(R.id.fragment_a);
        fragmentManager.beginTransaction().show(fragment).commit();

        switch (v.getId()) {
            case R.id.button1:
                fragment.setText("Button 1 clicked...");
                break;
            case R.id.button2:
                fragment.setText("Button 2 clicked...");
                break;
            default:
                break;
        }
    }
}

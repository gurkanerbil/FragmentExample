package com.erbil.fragmentexample;

import android.app.FragmentManager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button button;
    Button button2;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);

        button.setOnClickListener(this);
        button2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        FragmentManager fragmentManager = getFragmentManager();
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
        findViewById(R.id.fragment_a_layout).setVisibility(View.VISIBLE);
    }
}

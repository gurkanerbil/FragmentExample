package com.erbil.fragmentexample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    MainPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.button1).setOnClickListener(this);
        findViewById(R.id.button2).setOnClickListener(this);

        presenter = new MainPresenterImpl(this);
    }

    @Override
    public void onClick(View v) {
        findViewById(R.id.fragment_a_layout).setVisibility(View.VISIBLE);
        presenter.sendText(v);
    }
}

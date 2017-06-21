package com.erbil.fragmentexample;

import android.view.View;

class MainPresenterImpl implements MainPresenter {
    private MainView mainView;

    MainPresenterImpl(MainView mainView) {
        this.mainView = mainView;
    }

    @Override
    public void sendText(View v) {

        switch (v.getId()) {
            case R.id.button1:
                mainView.setFragmentText("1");
                break;
            case R.id.button2:
                mainView.setFragmentText("2");
                break;
            default:
                break;
        }
    }
}

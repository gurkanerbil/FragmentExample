package com.erbil.fragmentexample;

import android.app.Fragment;
import android.app.FragmentManager;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.erbil.fragmentexample.Fragment.FragmentB;

public class FragmentPresenterImpl implements FragmentPresenter {
    private Fragment fragment;


    public FragmentPresenterImpl(Fragment fragment) {
        this.fragment = fragment;
    }

    @Override
    public void sendText(String text) {
        fragment.getActivity().findViewById(R.id.fragment_b_layout).setVisibility(View.VISIBLE);
        FragmentManager fragmentManager = fragment.getFragmentManager();
        FragmentB fragmentB = (FragmentB) fragmentManager.findFragmentById(R.id.fragment_b);
        fragmentB.setTextB(text);
    }

    @Override
    public void setText(TextView textView, String text) {
        textView.setText(text);
    }

    @Override
    public void checkError(EditText editText) {
        if(TextUtils.isEmpty(editText.getText())) {
            editText.setError("Your message");
            return;
        }
    }
}

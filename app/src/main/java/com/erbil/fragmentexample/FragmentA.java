package com.erbil.fragmentexample;

import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class FragmentA extends Fragment {
    TextView tv;
    String text;
    Button sendingButton;
    EditText editText;

    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_a, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        tv = (TextView) getActivity().findViewById(R.id.textView1);
        sendingButton = (Button) getActivity().findViewById(R.id.sending_button);
        editText = (EditText) getActivity().findViewById(R.id.edit_text);

        sendingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentBManager = getFragmentManager();
                FragmentB fragmentB = (FragmentB) fragmentBManager.findFragmentById(R.layout.fragment_b);
                fragmentB.setText(String.valueOf(editText.getText()));
            }
        });
    }

    public void setText(String text) {
        this.text = text;
        tv.setText(text);
    }
}

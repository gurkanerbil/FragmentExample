package com.erbil.fragmentexample.Fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import com.erbil.fragmentexample.FragmentPresenter;
import com.erbil.fragmentexample.FragmentPresenterImpl;
import com.erbil.fragmentexample.R;

public class FragmentA extends Fragment implements View.OnClickListener{
    TextView tv;
    EditText editText;
    FragmentPresenter fragmentPresenter;

    @Override
    public View onCreateView(LayoutInflater inflater,
                             @Nullable ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_a, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        tv = (TextView) getActivity().findViewById(R.id.textView1);

        editText = (EditText) getActivity().findViewById(R.id.edit_text);
        fragmentPresenter = new FragmentPresenterImpl(this);
        fragmentPresenter.checkError(editText);

        getActivity().findViewById(R.id.sending_button).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        fragmentPresenter.sendText(String.valueOf(editText.getText()));
    }

    public void setText(String text) {
        fragmentPresenter.setText(tv, text);
    }
}

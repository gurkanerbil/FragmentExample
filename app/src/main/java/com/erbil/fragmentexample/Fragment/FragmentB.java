package com.erbil.fragmentexample.Fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.erbil.fragmentexample.FragmentPresenter;
import com.erbil.fragmentexample.FragmentPresenterImpl;
import com.erbil.fragmentexample.R;

public class FragmentB extends Fragment {

    TextView textView;
    FragmentPresenter fragmentPresenter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater,
                             @Nullable ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_b, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        textView = (TextView) getActivity().findViewById(R.id.data_text_view);
        fragmentPresenter = new FragmentPresenterImpl(this);
    }

    public void setTextB(String text) {
        fragmentPresenter.setText(textView, text);
    }
}

package com.erbil.fragmentexample;

import android.widget.EditText;
import android.widget.TextView;

public interface FragmentPresenter {
    void sendText(String text);
    void setText(TextView textView, String text);
    void checkError(EditText editText);
}

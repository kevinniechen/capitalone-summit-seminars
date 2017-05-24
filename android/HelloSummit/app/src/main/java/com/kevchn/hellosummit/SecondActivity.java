package com.kevchn.hellosummit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        String editTextInput = "";

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            editTextInput = extras.getString(MainActivity.EDIT_TEXT_INPUT_EXTRA) + " is cool!";
        }

        TextView editTextEntryTextView = (TextView) findViewById(R.id.edit_text_input_text_view);
        editTextEntryTextView.setText(editTextInput);
    }
}
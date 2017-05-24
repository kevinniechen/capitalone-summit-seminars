package com.kevchn.hellosummit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public static final String EDIT_TEXT_INPUT_EXTRA = "ENTERED_TEXT";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.button_main);

        // On button click, start second activity and send information about entered text
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                // Send text to second activity
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra(EDIT_TEXT_INPUT_EXTRA, getEditTextInput());
                startActivity(intent);
            }
        });
    }

    public String getEditTextInput() {
        EditText editText = (EditText) findViewById(R.id.edit_text_main);
        return editText.getText().toString();
    }
}

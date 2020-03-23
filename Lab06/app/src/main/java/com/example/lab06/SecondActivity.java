package com.example.lab06;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.io.File;

public class SecondActivity extends AppCompatActivity {
    MySharedPreference pref;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        pref = new MySharedPreference(this);
        TextView textView = findViewById(R.id.textView2);
        textView.setText(pref.getValue());

        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        if(extras != null) {
            boolean getBool = extras.getBoolean("extra");
            TextView textViewIntent = findViewById(R.id.textViewIntent);
            textViewIntent.setText(String.valueOf(getBool));
        }
    }
}

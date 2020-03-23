package com.example.lab06;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    MySharedPreference pref;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pref = new MySharedPreference(this);
    }

    public void saveAction(View view) {
        EditText editText = (EditText) findViewById(R.id.editText);
        String str = editText.getText().toString();
        System.out.println(str);
        pref.save(str);
    }

    public void changeActivity(View view){
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("extra", true);
        startActivity(intent);
    }
}

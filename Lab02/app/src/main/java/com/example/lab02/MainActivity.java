package com.example.lab02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("Activity", "Mesaj debug");
        Log.e("Activity", "Mesaj eroare");
        Log.v("Activity", "Mesaj verbose");
        Log.w("Activity", "Mesaj warning");
//        Log.ASSERT("Activity", "Mesaj assert");

        Button btn = (Button) findViewById(R.id.button2);
        btn.setOnClickListener(new View.OnClickListener() {
                   @Override
                   public void onClick(View v) {
                       Toast.makeText(MainActivity.this, "You pushed the button from push function", Toast.LENGTH_SHORT).show();
                   }
               }
        );
    }

    public void push1(View v) {
        Toast.makeText(MainActivity.this,"You pushed the button from on create", Toast.LENGTH_LONG).show();
        Toast.makeText(this, "You pushed the button from push function", Toast.LENGTH_SHORT).show();
    }
}

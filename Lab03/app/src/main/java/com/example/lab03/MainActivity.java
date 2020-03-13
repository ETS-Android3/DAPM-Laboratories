package com.example.lab03;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import org.w3c.dom.Text;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void checkCredentials(View view) {
        EditText editTextName = (EditText) findViewById(R.id.editTextName);
        EditText editTextPass = (EditText) findViewById(R.id.editTextPass);
        if (editTextName.getText().toString().equals("student") && editTextPass.getText().toString().equals("student")){
            Intent intent = new Intent(this, FindTheNumberActivity.class);
            intent.putExtra(EXTRA_MESSAGE, "AHA");
            startActivity(intent);
        }
    }
}

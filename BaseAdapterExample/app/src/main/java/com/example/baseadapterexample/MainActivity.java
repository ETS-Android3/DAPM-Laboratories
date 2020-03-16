package com.example.baseadapterexample;

import android.app.Activity;
import android.os.Bundle;
import android.widget.GridView;

public class MainActivity extends Activity {

    GridView simpleGrid;
    int animals[] = {R.drawable.i3, R.drawable.i4, R.drawable.i5, R.drawable.i6, R.drawable.i7, R.drawable.i8, R.drawable.i5, R.drawable.i6, R.drawable.i7};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        simpleGrid = (GridView) findViewById(R.id.simpleGridView);
        CustomAdapter customAdapter = new CustomAdapter(getApplicationContext(), animals);
        simpleGrid.setAdapter(customAdapter);
    }
}
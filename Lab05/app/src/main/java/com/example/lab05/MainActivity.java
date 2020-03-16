package com.example.lab05;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

public class MainActivity extends Activity {
    private ListView listOfCars;
    protected CarAdapter carAdapter;
    private EditText addNewCar;
    private Button addButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listOfCars = (ListView) findViewById(R.id.lv_list_cars);

        carAdapter = new CarAdapter(this);
        listOfCars.setAdapter(carAdapter);

        carAdapter.addCar("Dacia", R.drawable.lab5_car_icon);
        carAdapter.addCar("Renault", R.drawable.lab5_car_icon);
        carAdapter.addCar("Mazda", R.drawable.lab5_car_icon);
        carAdapter.addCar("Porsche", R.drawable.lab5_car_icon);

        addNewCar = (EditText) findViewById(R.id.ed_new_car);
        addButton = (Button) findViewById(R.id.b_add_car);

        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                carAdapter.addCar(addNewCar.getText().toString(), R.drawable.lab5_car_icon);
                addNewCar.setText("");
            }
        });

    }

}

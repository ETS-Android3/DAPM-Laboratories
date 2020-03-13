package com.example.lab03;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import static com.example.lab03.R.id.button2;

public class FindTheNumberActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_the_number);
    }

    public int generateNumber(){
        return (int)(Math.random() * 10);
    }

    int number = generateNumber();

    public void guessNumber(View view){

        EditText inputText = (EditText) findViewById((R.id.editText2));
        Integer inputNumber = Integer.parseInt(inputText.getText().toString());

        Button button = (Button) findViewById(button2);
        ColorDrawable buttonColor = (ColorDrawable) button.getBackground();
        if (buttonColor.getColor() == Color.BLUE){
            button.setBackgroundColor(Color.RED);
        }
        else{
            button.setBackgroundColor(Color.BLUE);
        }
        if (inputNumber == number){
            Toast.makeText(this,"You won! Try again", Toast.LENGTH_SHORT).show();
            number = generateNumber();
        }
        else{
            if (inputNumber < number)
                Toast.makeText(this, "Higher", Toast.LENGTH_SHORT).show();
            else
                Toast.makeText(this, "Lower", Toast.LENGTH_SHORT).show();
        }
    }
}

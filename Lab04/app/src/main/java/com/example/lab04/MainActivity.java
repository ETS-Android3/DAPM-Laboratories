package com.example.lab04;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView text;
    GridLayout gridLayout;
    LinearLayout linearLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // 0 = x, 1 = o
    int activePlayer = 0;
    boolean gameIsActive = true;
    // 2 unplayed
    int[] gameState = {2, 2, 2, 2, 2, 2, 2, 2, 2};
    int[][] winningPositions = {{0,1,2}, {3,4,5}, {6,7,8}, {0,3,6}, {1,4,7}, {2,5,8}, {0,4,8}, {2,4,6}};

    public void dropIn(View view) {
        linearLayout = findViewById(R.id.ll_play);
        ImageView counter = (ImageView) view;
        // get the current Image View (counter tag)
        int tappedCounter = Integer.parseInt(counter.getTag().toString());
        text = (TextView) findViewById(R.id.tv_message);

        //if the space is empty(is 2) and the game is not over
        if (gameState[tappedCounter] == 2 && gameIsActive) {
            //set the current player
            gameState[tappedCounter] = activePlayer;
            if (activePlayer == 0) {
                // setImageResource for counter as x
                counter.setImageResource(R.drawable.lab4_x);
                // change the player's turn
                activePlayer = 1;
            } else {
                // setImageResource for counter as zero
                counter.setImageResource(R.drawable.lab4_zero);
                activePlayer = 0;
            }
            for (int[] winningPosition : winningPositions) {
                if (gameState[winningPosition[0]] == gameState[winningPosition[1]] &&
                        gameState[winningPosition[1]] == gameState[winningPosition[2]] &&
                        gameState[winningPosition[0]] != 2) {
                    // Someone has won!
                    gameIsActive = false;
                    String winner = "Player1 -> 0";

                    if (gameState[winningPosition[0]] == 0) {
                        winner = "Player2 -> x";
                    }
                    // Make a toast with the messaje winner + " has won!"
                    //Toast.makeText(this, winner + " has won!", Toast.LENGTH_SHORT).show();
                    linearLayout.setVisibility(View.VISIBLE);
                    text.setText(winner + " has won!");
                } else {
                    boolean gameIsOver = true;

                    for (int counterState : gameState) {
                        if (counterState == 2)
                            gameIsOver = false;
                    }
                    if (gameIsOver) {
                        // Make a toast with the messaje "It's a draw!"
                        //Toast.makeText(this, "It's a draw!", Toast.LENGTH_SHORT).show();
                        linearLayout.setVisibility(View.VISIBLE);
                        text.setText("It's a draw!");
                    }
                }
            }
        }
    }

    public void playAgain(View view) {
        linearLayout = findViewById(R.id.ll_play);
        activePlayer = 0;
        gameIsActive = true;
        for (int i = 0; i < 9; i++){
            gameState[i] = 2;
        }
        System.out.println("SSS" + gameState[0]);
        gridLayout = findViewById(R.id.gridLayout);

        for (int i = 0; i < gridLayout.getChildCount(); i++) {
            ((ImageView) gridLayout.getChildAt(i)).setImageResource(0);
        }
        linearLayout.setVisibility(View.INVISIBLE);
    }
}

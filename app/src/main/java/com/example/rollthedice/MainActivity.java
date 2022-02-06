package com.example.rollthedice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private ImageView imageViewDice;

    Button dicebtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the ImageView in the layout
        imageViewDice = findViewById(R.id.image_view_dice);

        // Find the Button in the layout
        dicebtn = findViewById(R.id.dicebtn);


        dicebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Do a dice roll when the button is clicked
                rolldice();
            }
        });

    }

    private void rolldice() {
        // Create new Dice object  and roll the dice
         Random random = new Random();

        int randomNumber = random.nextInt(6) + 1;

        // Determine which drawable resource ID to use based on the dice roll
        switch (randomNumber) {
            case 1:
                imageViewDice.setImageResource(R.drawable.dice_1);
                break;
            case 2:
                imageViewDice.setImageResource(R.drawable.dice_2);
                break;
            case 3:
                imageViewDice.setImageResource(R.drawable.dice_3);
                break;
            case 4:
                imageViewDice.setImageResource(R.drawable.dice_4);
                break;
            case 5:
                imageViewDice.setImageResource(R.drawable.dice_5);
                break;
            case 6:
                imageViewDice.setImageResource(R.drawable.dice_6);
                break;
        }
    }
}
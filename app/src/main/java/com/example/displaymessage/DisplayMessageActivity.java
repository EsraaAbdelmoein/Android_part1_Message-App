package com.example.displaymessage;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DisplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);
        // Add delay to simulate heavy work on the main thread
        try {
            Thread.sleep(3000); // wait 3 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        // Capture the intent and extract the message
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        // Find the TextView and set the text (with "from Esraa")
        TextView textView = findViewById(R.id.textViewMessage);
        textView.setText("Message from Esraa: " + message);

        // Find the root layout
        LinearLayout root = findViewById(R.id.rootLayout);

        // Change background color based on message
        if (message.equalsIgnoreCase("red")) {
            root.setBackgroundColor(Color.RED);
        } else if (message.equalsIgnoreCase("blue")) {
            root.setBackgroundColor(Color.BLUE);
        } else if (message.equalsIgnoreCase("green")) {
            root.setBackgroundColor(Color.GREEN);
        } else if (message.equalsIgnoreCase("yellow")) {
            root.setBackgroundColor(Color.YELLOW);
        } else if (message.equalsIgnoreCase("magenta")) {
            root.setBackgroundColor(Color.MAGENTA);
        } else {
            root.setBackgroundColor(Color.WHITE); // default
        }

    }
}

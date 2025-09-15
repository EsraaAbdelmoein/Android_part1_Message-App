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
        
        try {
            Thread.sleep(3000); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        
        TextView textView = findViewById(R.id.textViewMessage);
        textView.setText("Message from Esraa: " + message);

        
        LinearLayout root = findViewById(R.id.rootLayout);

        
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
            root.setBackgroundColor(Color.WHITE); 
        }

    }
}

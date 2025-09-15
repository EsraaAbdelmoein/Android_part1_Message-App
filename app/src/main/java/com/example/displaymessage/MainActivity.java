package com.example.displaymessage;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "com.example.displaymessage.EXTRA_MESSAGE";

    private EditText editMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editMessage = findViewById(R.id.edit_message);
        Log.i("DM", "MainActivity.onCreate()");
    }

    public void sendMessage(View v) {
        String msg = editMessage.getText().toString().trim();
        Log.i("DM", "MainActivity.sendMessage(): " + msg);

        Intent intent = new Intent(this, DisplayMessageActivity.class);
        intent.putExtra(EXTRA_MESSAGE, msg);
        startActivity(intent);
    }
}

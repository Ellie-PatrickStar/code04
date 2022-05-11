package com.example.code04;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MessageActivity extends AppCompatActivity {
    //public static final String MESSAGE_STRING = MainActivity.class.getName() + "_MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message);

        TextView tvMessage = findViewById(R.id.tvMessage);
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.MESSAGE_STRING);
        if (message != null) {
            if (tvMessage != null) {
                tvMessage.setText(message);

            }

        }
    }
}
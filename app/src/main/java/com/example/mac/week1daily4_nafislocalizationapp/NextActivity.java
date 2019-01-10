package com.example.mac.week1daily4_nafislocalizationapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class NextActivity extends AppCompatActivity {

    private TextView displayTextView, instructionTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();

        String displayText = bundle.getString("selectedString");

        displayTextView = findViewById(R.id.displayTextId);
        instructionTextView = findViewById(R.id.instructionTextId);

        displayTextView.setText(displayText);
    }

    public void onClick(View view){

        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);

    }
}

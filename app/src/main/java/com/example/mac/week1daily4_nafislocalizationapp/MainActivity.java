package com.example.mac.week1daily4_nafislocalizationapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView foodTextView, clothTextView, houseTextView, internetTextView, computerTextView;
    private Button btnGoToNextActivity;
    String selectedText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        foodTextView = findViewById(R.id.foodTextViewId);
        clothTextView = findViewById(R.id.clothTextViewId);
        houseTextView = findViewById(R.id.houseTextViewId);
        internetTextView = findViewById(R.id.internetTextViewId);
        computerTextView = findViewById(R.id.computerTextViewId);
        btnGoToNextActivity = findViewById(R.id.btnGoToNextActivityId);

        btnGoToNextActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(selectedText == null || selectedText.isEmpty()){

                    Toast.makeText(MainActivity.this, "Please select one word", Toast.LENGTH_SHORT).show();
                }
                else {
                    Intent intent = new Intent(MainActivity.this, NextActivity.class);
                    Bundle bundle = new Bundle();
                    bundle.putString("selectedString", selectedText);
                    intent.putExtras(bundle);
                    startActivity(intent);
                }
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
        selectedText = "";
    }

    public void onClick(View view) {

        switch (view.getId()){
            case R.id.foodTextViewId:
                selectedText = foodTextView.getText().toString();
                break;

            case R.id.clothTextViewId:
                selectedText = clothTextView.getText().toString();
                break;

            case R.id.houseTextViewId:
                selectedText = houseTextView.getText().toString();
                break;

            case R.id.internetTextViewId:
                selectedText = internetTextView.getText().toString();
                break;

            case R.id.computerTextViewId:
                selectedText = computerTextView.getText().toString();
                break;

        }

        Toast.makeText(this, "Saved", Toast.LENGTH_SHORT).show();
    }
}

package com.example.androiduitesting;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ShowActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);

        // Get the city name passed from MainActivity
        String cityName = getIntent().getStringExtra("city");

        // Display the city name
        TextView textView = findViewById(R.id.textView_city);
        textView.setText(cityName);

        // Set up the back button
        Button backButton = findViewById(R.id.button_back);
        backButton.setOnClickListener(v -> finish());

    }
}
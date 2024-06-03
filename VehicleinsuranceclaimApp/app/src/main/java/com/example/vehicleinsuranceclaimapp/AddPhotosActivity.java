package com.example.vehicleinsuranceclaimapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class AddPhotosActivity extends AppCompatActivity {

    private Button capturePhotoButton;
    // Add other necessary variables for photo capture/upload

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_photos);

        capturePhotoButton = findViewById(R.id.capturePhotoButton);

        capturePhotoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Implement logic to capture photo or select from gallery
            }
        });
    }
}
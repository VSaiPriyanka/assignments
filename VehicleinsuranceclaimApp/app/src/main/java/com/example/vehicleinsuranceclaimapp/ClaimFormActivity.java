package com.example.vehicleinsuranceclaimapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class ClaimFormActivity extends AppCompatActivity {

    private EditText incidentDetailsEditText, vehicleDetailsEditText, policyDetailsEditText;
    private Button submitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_claim_form);

        incidentDetailsEditText = findViewById(R.id.incidentDetailsEditText);
        vehicleDetailsEditText = findViewById(R.id.vehicleDetailsEditText);
        policyDetailsEditText = findViewById(R.id.policyDetailsEditText);
        submitButton = findViewById(R.id.submitButton);

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Implement logic to submit claim form data
            }
        });
    }
}
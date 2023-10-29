package com.sliit.blindvision;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Landing extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landing);
        Button btnWifiCalibration = findViewById(R.id.btn_wifi_calibration);
        Button btnRouteFinder = findViewById(R.id.btn_route_finder);

        btnWifiCalibration.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // For this example, let's open WiFi settings as calibration. Adjust this as needed.
                startActivity(new Intent(Landing.this,StartingScreen.class));
            }
        });
        btnRouteFinder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Landing.this, Route.class));
            }
        });

    }
}
package com.example.healthkitsample;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.google.android.material.slider.Slider;

public class SignupActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        Slider seekBar = findViewById(R.id.slideBar);
        seekBar.addOnSliderTouchListener(new Slider.OnSliderTouchListener() {
            @Override
            public void onStartTrackingTouch(@NonNull Slider slider) {
                int value = (int) seekBar.getValue();
                Log.d("Slider Value", String.valueOf(value));

            }

            @Override
            public void onStopTrackingTouch(@NonNull Slider slider) {
                int value = (int) seekBar.getValue();
                Log.d("Slider Value 2", String.valueOf(value));

            }
        });
    }
}
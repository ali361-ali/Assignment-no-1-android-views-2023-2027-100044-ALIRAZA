package com.example.assignment1_androidviews;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.example.assignment1_androidviews.databinding.ActivityLinearLayoutBinding;

public class LinearBoxActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityLinearLayoutBinding binding = ActivityLinearLayoutBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
}

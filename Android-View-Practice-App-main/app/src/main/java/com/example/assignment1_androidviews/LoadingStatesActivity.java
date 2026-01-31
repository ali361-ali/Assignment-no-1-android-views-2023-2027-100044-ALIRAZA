package com.example.assignment1_androidviews;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.example.assignment1_androidviews.databinding.ActivityProgressBarBinding;

public class LoadingStatesActivity extends AppCompatActivity {

    private ActivityProgressBarBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityProgressBarBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btnIncreaseProgress.setOnClickListener(v -> {
            int current = binding.progressBarHorizontal.getProgress();
            if (current < 100) {
                binding.progressBarHorizontal.setProgress(current + 10);
            } else {
                binding.progressBarHorizontal.setProgress(0);
            }
        });
    }
}

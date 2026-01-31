package com.example.assignment1_androidviews;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.example.assignment1_androidviews.databinding.ActivityRatingBarBinding;

public class FeedbackStarActivity extends AppCompatActivity {

    private ActivityRatingBarBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityRatingBarBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.ratingBar.setOnRatingBarChangeListener((ratingBar, rating, fromUser) -> {
            binding.txtRatingValue.setText(getString(R.string.rating_value, rating));
        });
    }
}

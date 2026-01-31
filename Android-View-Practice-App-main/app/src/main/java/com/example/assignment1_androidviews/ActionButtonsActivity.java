package com.example.assignment1_androidviews;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.example.assignment1_androidviews.databinding.ActivityButtonBinding;

public class ActionButtonsActivity extends AppCompatActivity {

    private ActivityButtonBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityButtonBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btnClickMe.setOnClickListener(v -> 
            binding.txtButtonResult.setText(getString(R.string.button_clicked)));
    }
}

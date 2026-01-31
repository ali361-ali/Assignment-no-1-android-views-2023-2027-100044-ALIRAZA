package com.example.assignment1_androidviews;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.example.assignment1_androidviews.databinding.ActivityToggleButtonBinding;

public class StateButtonActivity extends AppCompatActivity {

    private ActivityToggleButtonBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityToggleButtonBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.toggleButton.setOnCheckedChangeListener((buttonView, isChecked) -> {
            binding.txtToggleStatus.setText(isChecked ? getString(R.string.toggle_on) : getString(R.string.toggle_off));
        });
    }
}

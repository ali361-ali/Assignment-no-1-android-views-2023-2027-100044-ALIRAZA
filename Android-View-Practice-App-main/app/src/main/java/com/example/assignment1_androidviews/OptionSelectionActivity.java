package com.example.assignment1_androidviews;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.example.assignment1_androidviews.databinding.ActivityCheckBoxBinding;

public class OptionSelectionActivity extends AppCompatActivity {

    private ActivityCheckBoxBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityCheckBoxBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.checkBox.setOnCheckedChangeListener((buttonView, isChecked) -> {
            String status = isChecked ? "Checked" : "Unchecked";
            binding.txtCheckBoxStatus.setText(getString(R.string.checkbox_status, status));
        });
    }
}

package com.example.assignment1_androidviews;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.example.assignment1_androidviews.databinding.ActivitySwitchBinding;

public class ToggleSwitchActivity extends AppCompatActivity {

    private ActivitySwitchBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySwitchBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.switchView.setOnCheckedChangeListener((buttonView, isChecked) -> {
            String status = isChecked ? "Enabled" : "Disabled";
            binding.txtSwitchStatus.setText(status);
        });
    }
}

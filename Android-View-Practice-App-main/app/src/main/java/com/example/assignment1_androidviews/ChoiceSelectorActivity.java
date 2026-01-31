package com.example.assignment1_androidviews;

import android.os.Bundle;
import android.widget.RadioButton;
import androidx.appcompat.app.AppCompatActivity;
import com.example.assignment1_androidviews.databinding.ActivityRadioButtonBinding;

public class ChoiceSelectorActivity extends AppCompatActivity {

    private ActivityRadioButtonBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityRadioButtonBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.radioGroup.setOnCheckedChangeListener((group, checkedId) -> {
            RadioButton radioButton = findViewById(checkedId);
            if (radioButton != null) {
                binding.txtRadioResult.setText(getString(R.string.radio_selected, radioButton.getText().toString()));
            }
        });
    }
}

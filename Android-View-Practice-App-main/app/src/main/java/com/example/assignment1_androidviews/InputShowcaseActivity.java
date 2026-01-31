package com.example.assignment1_androidviews;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.example.assignment1_androidviews.databinding.ActivityEditTextBinding;

public class InputShowcaseActivity extends AppCompatActivity {

    private ActivityEditTextBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityEditTextBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btnSubmit.setOnClickListener(v -> {
            String input = binding.editText.getText().toString();
            if (!input.isEmpty()) {
                binding.txtResult.setText(input);
            } else {
                binding.editText.setError(getString(R.string.edit_text_hint));
            }
        });
    }
}

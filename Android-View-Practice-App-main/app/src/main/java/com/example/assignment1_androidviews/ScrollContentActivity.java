package com.example.assignment1_androidviews;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.example.assignment1_androidviews.databinding.ActivityScrollViewBinding;

public class ScrollContentActivity extends AppCompatActivity {

    private ActivityScrollViewBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityScrollViewBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle(R.string.title_scrollview);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }
}

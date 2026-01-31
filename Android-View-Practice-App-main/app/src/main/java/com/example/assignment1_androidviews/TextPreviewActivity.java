package com.example.assignment1_androidviews;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.example.assignment1_androidviews.databinding.ActivityTextViewBinding;

public class TextPreviewActivity extends AppCompatActivity {

    public static final String MOVIE = "Movie";
    public static final String SHARED_ELEMENT_NAME = "Hero";

    private ActivityTextViewBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityTextViewBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        
        // TextView is static in this demo, but we could set text programmatically
        binding.textView.setText(R.string.text_view_content);
        
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setTitle(R.string.title_textview);
        }
    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }
}

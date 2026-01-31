package com.example.assignment1_androidviews;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.example.assignment1_androidviews.databinding.ActivityImageViewBinding;

public class GalleryViewActivity extends AppCompatActivity {

    private ActivityImageViewBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityImageViewBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        
        // Image is set via XML, but could be set here:
        // binding.imageView.setImageResource(R.drawable.movie);
    }
}

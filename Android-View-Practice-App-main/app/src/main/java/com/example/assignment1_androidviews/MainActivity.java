package com.example.assignment1_androidviews;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.example.assignment1_androidviews.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btnTextView.setOnClickListener(v -> startActivity(new Intent(this, TextPreviewActivity.class)));
        binding.btnEditText.setOnClickListener(v -> startActivity(new Intent(this, InputShowcaseActivity.class)));
        binding.btnButton.setOnClickListener(v -> startActivity(new Intent(this, ActionButtonsActivity.class)));
        binding.btnImageView.setOnClickListener(v -> startActivity(new Intent(this, GalleryViewActivity.class)));
        binding.btnCheckBox.setOnClickListener(v -> startActivity(new Intent(this, OptionSelectionActivity.class)));
        binding.btnRadioButton.setOnClickListener(v -> startActivity(new Intent(this, ChoiceSelectorActivity.class)));
        binding.btnSwitch.setOnClickListener(v -> startActivity(new Intent(this, ToggleSwitchActivity.class)));
        binding.btnToggleButton.setOnClickListener(v -> startActivity(new Intent(this, StateButtonActivity.class)));
        binding.btnSpinner.setOnClickListener(v -> startActivity(new Intent(this, DropdownListActivity.class)));
        binding.btnListView.setOnClickListener(v -> startActivity(new Intent(this, SimpleListViewActivity.class)));
        binding.btnRecyclerView.setOnClickListener(v -> startActivity(new Intent(this, ModernScrollActivity.class)));
        binding.btnGridView.setOnClickListener(v -> startActivity(new Intent(this, GridDisplayActivity.class)));
        binding.btnProgressBar.setOnClickListener(v -> startActivity(new Intent(this, LoadingStatesActivity.class)));
        binding.btnSeekBar.setOnClickListener(v -> startActivity(new Intent(this, SliderControlActivity.class)));
        binding.btnRatingBar.setOnClickListener(v -> startActivity(new Intent(this, FeedbackStarActivity.class)));
        binding.btnLinearLayout.setOnClickListener(v -> startActivity(new Intent(this, LinearBoxActivity.class)));
        binding.btnRelativeLayout.setOnClickListener(v -> startActivity(new Intent(this, RelativeBoxActivity.class)));
        binding.btnConstraintLayout.setOnClickListener(v -> startActivity(new Intent(this, FlexibleLayoutActivity.class)));
        binding.btnFrameLayout.setOnClickListener(v -> startActivity(new Intent(this, StackLayoutActivity.class)));
        binding.btnScrollView.setOnClickListener(v -> startActivity(new Intent(this, ScrollContentActivity.class)));
    }
}

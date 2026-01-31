package com.example.assignment1_androidviews;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import com.example.assignment1_androidviews.databinding.ActivityGridViewBinding;

public class GridDisplayActivity extends AppCompatActivity {

    private ActivityGridViewBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityGridViewBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        String[] data = new String[30];
        for (int i = 0; i < 30; i++) {
            data[i] = "Grid " + (i + 1);
        }

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, data) {
            @NonNull
            @Override
            public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
                View view = super.getView(position, convertView, parent);
                TextView text = (TextView) view.findViewById(android.R.id.text1);
                text.setTextColor(Color.WHITE);
                return view;
            }
        };

        binding.gridView.setAdapter(adapter);

        binding.gridView.setOnItemClickListener((parent, view, position, id) -> {
            Toast.makeText(this, "Clicked: " + data[position], Toast.LENGTH_SHORT).show();
        });
    }
}

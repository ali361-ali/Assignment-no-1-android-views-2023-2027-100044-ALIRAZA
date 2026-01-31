package com.example.assignment1_androidviews;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.example.assignment1_androidviews.databinding.ActivityRecyclerViewBinding;
import java.util.ArrayList;
import java.util.List;

public class ModernScrollActivity extends AppCompatActivity {

    private ActivityRecyclerViewBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityRecyclerViewBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        List<ItemModel> dataList = new ArrayList<>();
        for (int i = 1; i <= 20; i++) {
            dataList.add(new ItemModel("Item " + i, "This is the description for item " + i));
        }

        RecyclerViewAdapter adapter = new RecyclerViewAdapter(dataList);
        binding.recyclerView.setLayoutManager(new LinearLayoutManager(this));
        binding.recyclerView.setAdapter(adapter);
    }
}

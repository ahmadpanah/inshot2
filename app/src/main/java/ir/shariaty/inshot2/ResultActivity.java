package ir.shariaty.inshot2;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import ir.shariaty.inshot2.databinding.ActivityResultBinding;

public class ResultActivity extends AppCompatActivity {

    ActivityResultBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityResultBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.image.setImageURI(getIntent().getData());
    }
}
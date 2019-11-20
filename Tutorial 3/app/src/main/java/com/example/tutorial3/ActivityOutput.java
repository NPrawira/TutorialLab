package com.example.tutorial3;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class ActivityOutput extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_output);

        TextView result = findViewById(R.id.vHasil);

        Intent intent = getIntent();
        String addition = (String)intent.getSerializableExtra("Jumlah");
        result.setText(addition);
    }
}

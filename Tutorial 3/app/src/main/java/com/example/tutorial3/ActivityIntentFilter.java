package com.example.tutorial3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class ActivityIntentFilter extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intentfilter);

        Button btnSend = findViewById(R.id.sendMail);

        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent si = new Intent(Intent.ACTION_SEND);
                si.setType("message/rfc822");
                si.putExtra(Intent.EXTRA_EMAIL, new String[]{"naufalpraw@gmail.com"});
                si.putExtra(Intent.EXTRA_SUBJECT, "Intent Filter");
                si.putExtra(Intent.EXTRA_TEXT, "Email ini adalah contoh Intent Filter");
                startActivity(Intent.createChooser(si, "Email lewat..."));
            }
        });
    }
}

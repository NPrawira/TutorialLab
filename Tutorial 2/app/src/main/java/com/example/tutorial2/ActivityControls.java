package com.example.tutorial2;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ActivityControls extends Activity {
    TextView txt;
    EditText edit;
    String test;
    Button b1,b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.control_button);

        b1= findViewById(R.id.text_id);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.control_edittext);
                edit = findViewById(R.id.edittext);

                b2 = findViewById(R.id.button);
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        test = edit.getText().toString();
                        setContentView(R.layout.control_textview);
                        txt = findViewById(R.id.txtId);
                        txt.setText("Selamat datang " + test);
                    }
                });
            }
        });
    }
}

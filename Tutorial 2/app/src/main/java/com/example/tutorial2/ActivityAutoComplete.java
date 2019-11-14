package com.example.tutorial2;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class ActivityAutoComplete extends Activity {
        AutoCompleteTextView autocmplt;
        String[] arr = {"A'qila", "Albert", "Aeru", "Halim", "Raudhiatul", "Azhrin",
                "Nandaffa", "Thalia", "Luthfie", "Fahreza", "Hada", "Naufal"};
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);

            setContentView(R.layout.control_autocomplete);

            autocmplt = (AutoCompleteTextView)findViewById(R.id.autoCompleteTextView1);
            ArrayAdapter<String> adapter = new ArrayAdapter<>
            (this, android.R.layout.select_dialog_item, arr);

            autocmplt.setThreshold(1);
            autocmplt.setAdapter(adapter);
        }
}

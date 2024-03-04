package com.thinkaliker.claritytools;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String sampleText = getString(R.string.sample_text);

        // Example: Updating a TextView
        TextView textView = findViewById(R.id.textView);
        textView.setText(sampleText);
    }
}
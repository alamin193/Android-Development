package com.example.mytextviewdemo3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView nametextView;
    private TextView ageText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nametextView=(TextView)findViewById(R.id.textView);
        nametextView.setText("Anisul Islam");
        ageText=(TextView) findViewById(R.id.agetextView);
        ageText.setText("23 years old");
    }
}
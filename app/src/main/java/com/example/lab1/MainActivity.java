package com.example.lab1;

import androidx.appcompat.app.AppCompatActivity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;
import android.graphics.Typeface;


public class MainActivity extends AppCompatActivity {

    private TextView tvMain;
    Button upButton, b1;
    Float diff=2.0f;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.b1 =(Button)findViewById(R.id.button1);
        this.tvMain = (TextView) findViewById(R.id.tvMain); //this kviecia globalu
        this.tvMain.setText("Pagrindinis langas - Labas");
        this.upButton = findViewById(R.id.buttonUp);
    }

    public void onBtnMainClick(View view) {
        this.tvMain.setText("Paspausta");
    }

    public void onButton2Color(View view) {
        tvMain.setTextColor(Color.rgb(200,240,200));

    }
    public void onButtonUpSize (View view) {
        tvMain.setTextSize(tvMain.getTextSize() + diff);
    }
    public void onButton1Style (View view) {
        tvMain.setTypeface(Typeface.MONOSPACE);
    }

}


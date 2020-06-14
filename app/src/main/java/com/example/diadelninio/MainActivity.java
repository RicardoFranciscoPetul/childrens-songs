package com.example.diadelninio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    ImageButton bob, goDiego;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bob = findViewById(R.id.bob);
        goDiego = findViewById(R.id.goDiego);

        bob.setOnClickListener(this);
        goDiego.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.bob:{
                Toast.makeText(this, "Hiciste click a bob", Toast.LENGTH_SHORT).show();
                break;
            }
            case R.id.goDiego:{
                Toast.makeText(this, "Hiciste click a go diego", Toast.LENGTH_SHORT).show();
                break;
            }
        }
    }
}

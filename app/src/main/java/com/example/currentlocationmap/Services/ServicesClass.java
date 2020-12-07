package com.example.currentlocationmap.Services;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.currentlocationmap.R;

public class ServicesClass extends AppCompatActivity implements View.OnClickListener {

    Button start,stop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_services_class);

        start = findViewById(R.id.start_button_id);
        stop = findViewById(R.id.stop_button_id);

        start.setOnClickListener(this);
        stop.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view == start){
            startService(new Intent(this,ServicesEx.class));
        }else if (view == stop){
            stopService(new Intent(this,ServicesEx.class));
        }
    }
}
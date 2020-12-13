package com.example.currentlocationmap;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.currentlocationmap.CurrentLocation.MyLocationClass;
import com.example.currentlocationmap.CustomePlacePicker.CustomPlacePickerActivity;
import com.example.currentlocationmap.PlacePicker.PlacePickerActivity;
import com.example.currentlocationmap.RootFinding.CarRootFindingMap;
import com.example.currentlocationmap.Services.ServicesClass;
import com.example.currentlocationmap.TwoLocationsDirections.MapDirectionActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button second_button_id,services_button_id,carAnimation_button_id,
            diections_button_id,custome_picker_button_id,place_picker_button_id;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         second_button_id = findViewById(R.id.second_button_id);
         services_button_id = findViewById(R.id.services_button_id);
        carAnimation_button_id = findViewById(R.id.carAnimation_button_id);
        diections_button_id = findViewById(R.id.diections_button_id);
        custome_picker_button_id = findViewById(R.id.custome_picker_button_id);
        place_picker_button_id = findViewById(R.id.place_picker_button_id);

         second_button_id.setOnClickListener(this);
         services_button_id.setOnClickListener(this);
        carAnimation_button_id.setOnClickListener(this);
        diections_button_id.setOnClickListener(this);
        custome_picker_button_id.setOnClickListener(this);
        place_picker_button_id.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        if (view == second_button_id){
            Intent intent = new Intent(getApplicationContext(), MyLocationClass.class);
            startActivity(intent);
        }else if(view == services_button_id){
            Intent intent = new Intent(getApplicationContext(), ServicesClass.class);
            startActivity(intent);
        }else if (view == diections_button_id){
            Intent intent = new Intent(getApplicationContext(), MapDirectionActivity.class);
            startActivity(intent);
        }else if (view == carAnimation_button_id){
            Intent intent = new Intent(getApplicationContext(), CarRootFindingMap.class);
            startActivity(intent);
        }else if (view == custome_picker_button_id){
            Intent intent = new Intent(getApplicationContext(),CustomPlacePickerActivity.class);
            startActivity(intent);
        }else if (view == place_picker_button_id){
            Intent intent = new Intent(getApplicationContext(), PlacePickerActivity.class);
            startActivity(intent);
        }
    }
}
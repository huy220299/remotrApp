package com.example.nvhuy.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.Switch;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {
    Switch click;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        click = findViewById(R.id.click);
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference("Control");
        myRef.setValue("asdad");


        click.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked){
                myRef.child("Wifi").setValue("On");
            }else {
                myRef.child("Wifi").setValue("off");
            }
        });




    }
}
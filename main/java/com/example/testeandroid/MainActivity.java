package com.example.testeandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {
Button btncont;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btncont=(Button) findViewById(R.id.btncont);
        btncont.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                btncont
            }
        }

    });
}

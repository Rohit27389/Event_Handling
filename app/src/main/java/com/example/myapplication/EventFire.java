package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class EventFire extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button=findViewById(R.id.button5);
        button.setOnClickListener(new EventHandler());

        Button button1=findViewById(R.id.button6);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(EventFire.this, "Number 6", Toast.LENGTH_SHORT).show();
            }
        });

        Button button2=findViewById(R.id.button7);
        View.OnClickListener listener=new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(EventFire.this, "Number 7", Toast.LENGTH_SHORT).show();
            }
        };
        button2.setOnClickListener(listener);

    }
}

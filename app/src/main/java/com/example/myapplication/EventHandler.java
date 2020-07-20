package com.example.myapplication;

import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class EventHandler implements View.OnClickListener {
    @Override
    public void onClick(View view) {
        Button b= (Button) view;
        b.setText("Number 5");
    }
}

package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.button1) {
            Toast.makeText(this, "click First", Toast.LENGTH_SHORT).show();
        }
        if(id==R.id.button2){
            Toast.makeText(this, "click Second", Toast.LENGTH_SHORT).show();
        }
        if(id==R.id.button3){
            Toast.makeText(this, "click third", Toast.LENGTH_SHORT).show();
        }
        if(id==R.id.button4){
            Toast.makeText(this, "click fourth", Toast.LENGTH_SHORT).show();
        }
    }

/*

    @Override
    public void onClick(View view) {
        Button button=(Button)view;

        Toast.makeText(this, button.getText().toString(), Toast.LENGTH_SHORT).show();
    }

*/

}

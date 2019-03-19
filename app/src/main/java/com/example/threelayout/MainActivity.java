package com.example.threelayout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btn_one;
    private Button btn_two;
    private Button btn_three;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_one = findViewById(R.id.btn1);
        btn_two = findViewById(R.id.btn2);
        btn_three = findViewById(R.id.btn3);
        btn_one.setOnClickListener(this);
        btn_two.setOnClickListener(this);
        btn_three.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn1:
                Intent intent1 = new Intent(MainActivity.this, LinearLayoutActivity.class);
                startActivity(intent1);
                break;
            case R.id.btn2:
                Intent intent2 = new Intent(MainActivity.this, ConstraintLayoutActivity.class);
                startActivity(intent2);
                break;
            case R.id.btn3:
                Intent intent3 = new Intent(MainActivity.this, TableLayout.class);
                startActivity(intent3);
                break;
        }
    }
}
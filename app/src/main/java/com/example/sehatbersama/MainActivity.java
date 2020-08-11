package com.example.sehatbersama;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnMoveActivity = findViewById(R.id.btn_move_activity);
        btnMoveActivity.setOnClickListener(this);

        Button btnMoveWithDataActivity = findViewById(R.id.btn_move_activity_data);
        btnMoveWithDataActivity.setOnClickListener(this);

        Button btnMoveWithObjectActivity = findViewById(R.id.btn_move_activity_object);
        btnMoveWithObjectActivity.setOnClickListener(this);

        Button btnMoveWithSubjectActivity = findViewById(R.id.btn_move_activity_subject);
        btnMoveWithSubjectActivity.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_move_activity:
                Intent moveIntent = new Intent(MainActivity.this, MoveActivity.class);
                startActivity(moveIntent);
                break;
            case R.id.btn_move_activity_data:
                Intent moveWithDataIntent = new Intent(MainActivity.this, MoveWithDataActivity.class);
                startActivity(moveWithDataIntent);
                break;
            case R.id.btn_move_activity_object:
                Intent moveWithObjectIntent = new Intent(MainActivity.this, MoveWithObjectActivity.class);
                startActivity(moveWithObjectIntent);
                break;
            case R.id.btn_move_activity_subject:
                Intent moveWithSubjectIntent = new Intent(MainActivity.this, MoveWithSubjectActivity.class);
                startActivity(moveWithSubjectIntent);
                break;
        }
    }
}

package com.example.dawn;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.dawn.myapplication.MainActivity;
import com.example.dawn.myapplication.R;

public class RVLogActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rvlog);
        Button btnCamperInfo = (Button)findViewById(R.id.btnCamperInfo);
        Button btnVehicleInfo = (Button)findViewById(R.id.btnVehicleInfo);
        btnCamperInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(RVLogActivity.this, CamperInfo.class));
            }
        });
    }
}

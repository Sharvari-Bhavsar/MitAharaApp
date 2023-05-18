package com.example.try_fragment;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
public class MainActivity2 extends AppCompatActivity {
    Button Pbtn,Hbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Pbtn = findViewById(R.id.P_button);
        Hbtn = findViewById(R.id.H_button);

        Pbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity2.this, loginActivity.class));
            }
        });
        Hbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity2.this, loginActiviy_H.class));


            }
        });

    }
}

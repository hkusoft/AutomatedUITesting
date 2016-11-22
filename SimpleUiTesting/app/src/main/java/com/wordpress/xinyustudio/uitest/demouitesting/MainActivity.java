package com.wordpress.xinyustudio.uitest.demouitesting;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.wordpress.xinyustudio.uitest.demouitesting.ActivityA;

public class MainActivity extends AppCompatActivity {

    private Button mButtonGotoActivityA;
    private Button mButtonGotoActivityB;
    private Button mButtonGotoActivityC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mButtonGotoActivityA = (Button) findViewById(R.id.activity_a);
        mButtonGotoActivityB = (Button) findViewById(R.id.activity_b);
        mButtonGotoActivityC = (Button) findViewById(R.id.activity_c);

        mButtonGotoActivityA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(MainActivity.this, ActivityA.class);
                startActivity(it);
            }
        });


        mButtonGotoActivityB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(MainActivity.this, ActivityB.class);
                startActivity(it);
            }
        });


        mButtonGotoActivityC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(MainActivity.this, ActivityC.class);
                startActivity(it);
            }
        });
    }
}

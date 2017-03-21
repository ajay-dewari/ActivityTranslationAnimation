package com.justdial.openactivitytransactionanimation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView bottom, right, left, top;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        top= (TextView) findViewById(R.id.top);
        right= (TextView) findViewById(R.id.right);
        left= (TextView) findViewById(R.id.left);
        bottom= (TextView) findViewById(R.id.bootm);

        bottom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openFromBottom();
            }
        });

        left.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openFromLeft();
            }
        });

        right.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openFromRight();
            }
        });

        top.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openFromTop();
            }
        });
    }

    void openFromBottom(){
        Intent i = new Intent(MainActivity.this, NewActivity.class);
        startActivity(i);
        overridePendingTransition( R.anim.slide_in_up, R.anim.slide_out_up );
    }

    void openFromTop(){
        Intent i = new Intent(MainActivity.this, NewActivity.class);
        startActivity(i);
        overridePendingTransition( R.anim.slide_in_down, R.anim.slide_out_down );
    }

    void openFromRight(){
        Intent i = new Intent(MainActivity.this, NewActivity.class);
        startActivity(i);
        overridePendingTransition( R.anim.slide_in_right, R.anim.slide_out_right );
    }

    void openFromLeft(){
        Intent i = new Intent(MainActivity.this, NewActivity.class);
        startActivity(i);
        overridePendingTransition( R.anim.slide_in_left, R.anim.slide_out_left );
    }

}

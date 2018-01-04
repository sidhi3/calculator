package com.example.ridhi.calci;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button b1;
    Button b2;
    Button b3;
    Button b4;
    Button b5;
    Button b6;
    Button b7;
    Button b8;
    Button b9;
    Button b0;
    Button b11;
    Button b12;
    Button b13;
    Button b14;
    Button b15;
    TextView tv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b0=(Button) findViewById(R.id.button0);
        b1=(Button) findViewById(R.id.button1);
        b2=(Button) findViewById(R.id.button2);
        b3=(Button) findViewById(R.id.button3);
        b4=(Button) findViewById(R.id.button4);
        b5=(Button) findViewById(R.id.button5);
        b6=(Button) findViewById(R.id.button6);
        b7=(Button) findViewById(R.id.button7);
        b8=(Button) findViewById(R.id.button8);
        b9=(Button) findViewById(R.id.button9);
        b11=(Button) findViewById(R.id.btn1);
        b12=(Button) findViewById(R.id.btn2);
        b13=(Button) findViewById(R.id.btn3);
        b14=(Button) findViewById(R.id.btn4);
        b15=(Button) findViewById(R.id.button15);
        tv=(TextView) findViewById(R.id.textView3);
    }
    public void one(View view)
    {
        {
            tv.setText(tv.getText() + "1");
        }
    }
}

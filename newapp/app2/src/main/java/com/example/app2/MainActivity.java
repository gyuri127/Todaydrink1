package com.example.app2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button trueBtn;
    TextView targetTextView;
    Button falseBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        trueBtn = (Button)findViewById(R.id.btn_visible_true);
        targetTextView = (TextView)findViewById(R.id.text_visible_target);
        falseBtn = (Button) findViewById(R.id.btn_visible_false);

        trueBtn.setOnClickListener(this);
        falseBtn.setOnClickListener(this);
    }

    public void onClick(View view){
        if(view == trueBtn){
            targetTextView.setVisibility(View.VISIBLE);
        }
        else if(view == falseBtn){
            targetTextView.setVisibility(View.INVISIBLE);
        }

    }


}
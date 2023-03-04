package com.akki.calculator;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView result , sol;
    public String num1, num2,num3="",num4,num5;
    public int i,j;
    Button one, two , three, four, five, six, seven, eight,nine,zero,dot,ac,equal,plus,minus,multi,dev;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        result= findViewById(R.id.result_tv);
        result.setOnClickListener(this);
        sol = findViewById(R.id.sol);
        sol.setOnClickListener(this);
        one = findViewById(R.id.one);
        one.setOnClickListener(this);
        two = findViewById(R.id.two);
        two.setOnClickListener(this);
        three = findViewById(R.id.three);
        three.setOnClickListener(this);
        four = findViewById(R.id.four);
        four.setOnClickListener(this);
        five = findViewById(R.id.five);
        five.setOnClickListener(this);
        six = findViewById(R.id.six);
        six.setOnClickListener(this);
        seven=findViewById(R.id.seven);
        seven.setOnClickListener(this);
        eight=findViewById(R.id.eight);
        eight.setOnClickListener(this);
        nine=findViewById(R.id.nine);
        nine.setOnClickListener(this);
        zero=findViewById(R.id.zero);
        zero.setOnClickListener(this);
        dot=findViewById(R.id.dot);
        dot.setOnClickListener(this);
        plus=findViewById(R.id.plus);
        plus.setOnClickListener(this);
        minus=findViewById(R.id.minus);
        minus.setOnClickListener(this);
        multi=findViewById(R.id.multi);
        multi.setOnClickListener(this);
        dev=findViewById(R.id.dev);
        dev.setOnClickListener(this);
        equal=findViewById(R.id.equal);
        equal.setOnClickListener(this);
        ac=findViewById(R.id.ac);
        ac.setOnClickListener(this);
    }
    public void s(){
        if(TextUtils.isEmpty(num1)){
            num1=sol.getText().toString();
            sol.setText("");
        }
        else{
            num2=sol.getText().toString();
            switch (num3) {
                case "+":
                    num4=String.valueOf((Long.parseLong(num1)+Long.parseLong(num2)));
                    break;
                case "-":
                    num4=String.valueOf((Long.parseLong(num1)-Long.parseLong(num2)));
                    break;
                case "*":
                    num4=String.valueOf((Long.parseLong(num1)*Long.parseLong(num2)));
                    break;
                case "/":
                    num4=String.valueOf((Long.parseLong(num1)/Long.parseLong(num2)));
                    break;
            }
            result.setText(num4);
        }
    }
    public void mat(){
        switch (num3) {
            case "+":
            case "-":
            case "*":
            case "/":
                s();
                break;
        }
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case (R.id.one):
                sol.append("1");
                mat();
                break;
            case (R.id.two):
                sol.append("2");
                mat();
                break;
            case (R.id.three):
                sol.append("3");
                mat();
                break;
            case (R.id.four):
                sol.append("4");
                mat();
                break;
            case (R.id.five):
                sol.append("5");
                mat();
                break;
            case (R.id.six):
                sol.append("6");
                mat();
                break;
            case (R.id.seven):
                sol.append("7");
                mat();
                break;
            case (R.id.eight):
                sol.append("8");
                mat();
                break;
            case (R.id.nine):
                sol.append("9");
                mat();
                break;
            case (R.id.zero):
                sol.append("0");
                break;
            case (R.id.dot):
                sol.append(".");
                break;
            case (R.id.ac):
                num1="";
                num2="";
                num3="";
                sol.setText("");
                result.setText("");
                break;
            case (R.id.plus):
                //sol.append("+");
                if(!TextUtils.isEmpty(num3)) {
                    num1 = result.getText().toString();
                    sol.setText("");
                    num3="+";
                }
                else {
                    s();
                    num3 = "+";
                }
                break;
            case (R.id.minus):
                //sol.setText("-");
                if(!TextUtils.isEmpty(num3)) {
                    num1 = result.getText().toString();
                    sol.setText("");
                    num3="-";
                }
                else {
                    s();
                    num3 = "-";
                }
                break;
            case (R.id.multi):
                //sol.setText("*");
                if(!TextUtils.isEmpty(num3)) {
                    num1 = result.getText().toString();
                    sol.setText("");
                    num3="*";
                }
                else {
                    s();
                    num3 = "*";
                }
                break;
            case (R.id.dev):
                //sol.setText("/");
                if(!TextUtils.isEmpty(num3)) {
                    num1 = result.getText().toString();
                    sol.setText("");
                    num3="/";
                }
                else {
                    s();
                    num3 = "/";
                }
                break;
            case (R.id.equal):
                //sol.setText("");
                num1="";
                num2="";
                num3="";
                break;
        }
    }

}


package com.example.simplecalculater;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button b0,b1,b2,b3,b4,b6,b5,b7,b8,b9,back,clear,equal,plus,minus,badd,bmul,bdiv,plusmin,off,bdot;
    EditText et;
    double fn,sn;
    String operator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et = (EditText)findViewById(R.id.et);
        b0 = (Button)findViewById(R.id.b0);
        b1 = (Button)findViewById(R.id.b1);
        b2 = (Button)findViewById(R.id.b2);
        b3 = (Button)findViewById(R.id.b3);
        b4 = (Button)findViewById(R.id.b4);
        b5 = (Button)findViewById(R.id.b5);
        b6 = (Button)findViewById(R.id.b6);
        b7 = (Button)findViewById(R.id.b7);
        b8 = (Button)findViewById(R.id.b8);
        b9 = (Button)findViewById(R.id.b9);
        bdot = (Button)findViewById(R.id.bdot);
        back = (Button)findViewById(R.id.back);
        clear = (Button)findViewById(R.id.clear);
        equal = (Button)findViewById(R.id.equal);
        plus = (Button)findViewById(R.id.plus);
        minus = (Button)findViewById(R.id.minus);
        bmul = (Button)findViewById(R.id.bmul);
        bdiv = (Button)findViewById(R.id.bdiv);
        plusmin = (Button)findViewById(R.id.plusmin);
        off = (Button)findViewById(R.id.off);

        b0.setOnClickListener(this);
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
        b5.setOnClickListener(this);
        b6.setOnClickListener(this);
        b7.setOnClickListener(this);
        b8.setOnClickListener(this);
        b9.setOnClickListener(this);
        bdot.setOnClickListener(this);
        back.setOnClickListener(this);
        clear.setOnClickListener(this);
        equal.setOnClickListener(this);
        plus.setOnClickListener(this);
        minus.setOnClickListener(this);
        bmul.setOnClickListener(this);
        bdiv.setOnClickListener(this);
        plusmin.setOnClickListener(this);
        off.setOnClickListener(this);

    }

    public void onClick(View v){
        String string =et.getText().toString();
        switch (v.getId()){
            case R.id.b0:
                et.setText(string+b0.getText());
                break;
            case R.id.b1:
                et.setText(string+b1.getText());
                break;
            case R.id.b2:
                et.setText(string+b2.getText());
                break;
            case R.id.b3:
                et.setText(string+b3.getText());
                break;
            case R.id.b4:
                et.setText(string+b4.getText());
                break;
            case R.id.b5:
                et.setText(string+b5.getText());
                break;
            case R.id.b6:
                et.setText(string+b6.getText());
                break;
            case R.id.b7:
                et.setText(string+b7.getText());
                break;
            case R.id.b8:
                et.setText(string+b8.getText());
                break;
            case R.id.b9:
                et.setText(string+b9.getText());
                break;
            case R.id.bdot:
                et.setText(string+bdot.getText());
                break;
            case R.id.clear:
                et.setText("");
                break;

            case R.id.back:
                StringBuilder stb = new StringBuilder(string);
                stb.deleteCharAt(string.length()-1);
                et.setText(stb.toString());
                break;
            case R.id.plus:
                operator = "+";
                fn=Double.parseDouble(et.getText().toString());
                et.setText("");
                break;
            case R.id.minus:
                operator = "-";
                fn=Double.parseDouble(et.getText().toString());
                et.setText("");
                break;
            case R.id.bmul:
                operator = "*";
                fn=Double.parseDouble(et.getText().toString());
                et.setText("");
                break;
            case R.id.bdiv:
                operator = "/";
                fn=Double.parseDouble(et.getText().toString());
                et.setText("");
                break;
            case R.id.plusmin:

                et.setText(Double.parseDouble(et.getText().toString())*(-1)+"");
                break;
            case R.id.equal:
                sn=Double.parseDouble(et.getText().toString());
                double result=0;
                switch (operator){
                    case "+":
                        result=fn+sn;
                        break;
                    case "-":
                        result=fn-sn;
                        break;
                    case "*":
                        result=fn*sn;
                        break;
                    case "/":
                        result=fn/sn;
                        break;
                }
                et.setText(result+"");
                break;
            case R.id.off:
                finish();
                break;

        }
    }
}

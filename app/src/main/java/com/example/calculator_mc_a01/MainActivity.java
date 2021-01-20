package com.example.calculator_mc_a01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button one;
    private Button two;
    private Button three;
    private Button four;
    private Button five;
    private Button six;
    private Button seven;
    private Button eight;
    private Button nine;
    private Button zero;
    private Button multiply;
    private Button divide;
    private Button add;
    private Button subtract;
    private Button clear;
    private Button equ;
    private TextView values;
    private TextView results;
    private final char ADDITION='+';
    private final char SUBTRACTION='-';
    private final char MULTIPLY='*';
    private final char DIVIDE='/';
    private final char Equal='=';
    private double val1=Double.NaN;
    private double val2;
    private char act;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setupUIView();

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               values.setText(values.getText().toString()+ "0");
            }
        } );

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                values.setText(values.getText().toString()+ "1");
            }
        } );

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                values.setText(values.getText().toString()+ "2");
            }
        } );

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                values.setText(values.getText().toString()+ "3");
            }
        } );

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                values.setText(values.getText().toString()+ "4");
            }
        } );

        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                values.setText(values.getText().toString()+ "5");
            }
        } );

        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                values.setText(values.getText().toString()+ "6");
            }
        } );

        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                values.setText(values.getText().toString()+ "7");
            }
        } );

        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                values.setText(values.getText().toString()+ "8");
            }
        } );

        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                values.setText(values.getText().toString()+ "9");
            }
        } );

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
                act=ADDITION;
               results.setText(String.valueOf(val1)+ "+");
               values.setText(null);
            }
        } );
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
                act=DIVIDE;
                results.setText(String.valueOf(val1)+ "/");
                values.setText(null);
            }
        } );
        subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
                act=SUBTRACTION;
                results.setText(String.valueOf(val1)+ "-");
                values.setText(null);
            }
        } );
        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
                act=MULTIPLY;
                results.setText(String.valueOf(val1)+ "*");
                values.setText(null);
            }
        } );

        equ.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                compute();
                act=Equal;
                results.setText(results.getText().toString()+String.valueOf(val2)+ "="+ String.valueOf(val1));
                values.setText(null);
            }
        });
        clear.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                if(values.getText().length()>0)
                {
                    CharSequence name=values.getText().toString();
                    values.setText(name.subSequence(0,name.length()-1));
                }
                else
                {
                    val1=Double.NaN;
                    val2=Double.NaN;
                    values.setText(null);
                    results.setText(null);
                }
            }
        });




}
private void setupUIView()
{
    one=(Button)findViewById(R.id.button1);
    zero=(Button)findViewById(R.id.button0);
    two=(Button)findViewById(R.id.button2);
    three=(Button)findViewById(R.id.button3);
    four=(Button)findViewById(R.id.button4);
    five=(Button)findViewById(R.id.button5);
    six=(Button)findViewById(R.id.button6);
    seven=(Button)findViewById(R.id.button7);
    eight=(Button)findViewById(R.id.button8);
    nine=(Button)findViewById(R.id.button9);
    equ=(Button)findViewById(R.id.buttonEqual);
    clear=(Button)findViewById(R.id.buttonClear);
    multiply=(Button)findViewById(R.id.buttonMultiply);
    divide=(Button)findViewById(R.id.buttonDivide);
    add=(Button)findViewById(R.id.buttonAdd);
    subtract=(Button)findViewById(R.id.buttonSub);
    values=(TextView) findViewById(R.id.tv_val);
    results=(TextView)findViewById(R.id.tvresults);



}
private void compute()
{
    if(!Double.isNaN(val1))
    {
    val2=Double.parseDouble(values.getText().toString());
    switch(act)
    {
        case ADDITION:
            val1=val1+val2;
            break;
        case SUBTRACTION:
            val1=val1-val2;
            break;
            case MULTIPLY:
        val1=val1*val2;
        break;
        case DIVIDE:
        val1=val1/val2;
        break;
        case Equal:
        break;

    }
    }
    else
    {
        val1=Double.parseDouble(values.getText().toString());
    }
}

}
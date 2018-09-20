package com.andriodinternship.basiccalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button Addition,Subtraction,Multiplication,Division;
    private TextView Et1,Et2,Et3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Addition=(Button)findViewById(R.id.btnAdd);
        Subtraction=(Button)findViewById(R.id.btnSubtract);
        Multiplication=(Button)findViewById(R.id.btnMultiply);
        Division=(Button)findViewById(R.id.btnDiv);

        Et1=(EditText)findViewById(R.id.et1);
        Et2=(EditText)findViewById(R.id.et2);
        Et3=(EditText)findViewById(R.id.et3);

        Addition.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(Et1.getText().toString().equals("")||Et2.getText().toString().equals(""))
                {
                    Toast.makeText(MainActivity.this,"Please enter number",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Et1.getText().toString();
                    Et2.getText().toString();
                    double a1=Double.valueOf(Et1.getText().toString());
                    double a2=Double.valueOf(Et2.getText().toString());
                    double a3;
                    a3=a1+a2;
                    Et3.setText(String.valueOf(a3));
                }
            }
        });

        Subtraction.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(Et1.getText().toString().equals("")||Et2.getText().toString().equals(""))
                {
                    Toast.makeText(MainActivity.this,"Please enter number",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Et1.getText().toString();
                    Et2.getText().toString();
                    double a1=Double.valueOf(Et1.getText().toString());
                    double a2=Double.valueOf(Et2.getText().toString());
                    double a3;
                    a3=a1-a2;
                    Et3.setText(String.valueOf(a3));
                }
            }
        });

        Multiplication.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(Et1.getText().toString().equals("")||Et2.getText().toString().equals(""))
                {
                    Toast.makeText(MainActivity.this,"Please enter number",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Et1.getText().toString();
                    Et2.getText().toString();
                    double a1=Double.valueOf(Et1.getText().toString());
                    double a2=Double.valueOf(Et2.getText().toString());
                    double a3;
                    a3=a1*a2;
                    Et3.setText(String.valueOf(a3));
                }
            }
        });

        Division.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(Et1.getText().toString().equals("")||Et2.getText().toString().equals(""))
                {
                    Toast.makeText(MainActivity.this,"Please enter number",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Et1.getText().toString();
                    Et2.getText().toString();
                    double a1=Double.valueOf(Et1.getText().toString());
                    double a2=Double.valueOf(Et2.getText().toString());
                    double a3;
                    a3=a1/a2;
                    Et3.setText(String.valueOf(a3));
                }
            }
        });


    }





}

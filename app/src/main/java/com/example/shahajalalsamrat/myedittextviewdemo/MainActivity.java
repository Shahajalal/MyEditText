package com.example.shahajalalsamrat.myedittextviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button button1,button2,button3,button4;
    EditText edittext1,edittext2;
    TextView textview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1= (Button) findViewById(R.id.plusid);
        button2= (Button) findViewById(R.id.minusid);
        button3= (Button) findViewById(R.id.productid);
        button4= (Button) findViewById(R.id.divisionid);

        edittext1= (EditText) findViewById(R.id.edittext1id);
        edittext2= (EditText) findViewById(R.id.edittext2id);

        textview= (TextView) findViewById(R.id.resultid);

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
       try{
           String number1,number2;
           double num1,num2,result;
           number1=edittext1.getText().toString();
           number2=edittext2.getText().toString();
           num1=Double.parseDouble(number1);
           num2=Double.parseDouble(number2);

           if(v.getId()==R.id.plusid)
           {

               result=num1+num2;
               textview.setText("the result is :" + result);

           }
           else if(v.getId()==R.id.minusid)
           {
               result=num1-num2;
               textview.setText("the result is :" + result);
           }
           else if(v.getId()==R.id.productid)
           {
               result=num1*num2;
               textview.setText("the result is :" + result);
           }
           else
           {
               result=num1/num2;
               textview.setText("the result is :" + result);
           }
       }catch(Exception e)
       {
           Toast.makeText(MainActivity.this,"please input numbers",Toast.LENGTH_SHORT).show();
       }
    }
}

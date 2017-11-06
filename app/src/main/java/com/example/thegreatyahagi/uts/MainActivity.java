package com.example.thegreatyahagi.uts;

import android.renderscript.Double2;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button Lingk, Persg, Segt;
    EditText Input1, Input2;
    TextView Luas, Keliling;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Lingk = (Button) findViewById(R.id.hitlgk);
        Persg = (Button) findViewById(R.id.hitpsg);
        Segt = (Button) findViewById(R.id.hitsgt);
        Input1 = (EditText) findViewById(R.id.input1);
        Input2 = (EditText) findViewById(R.id.input2);
        Luas = (TextView) findViewById(R.id.luas);
        Keliling = (TextView) findViewById(R.id.kell);

        Persg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String op1 = Input1.getText().toString().trim();
                String op2 = Input2.getText().toString().trim();

                Double a = Double.parseDouble(op1);
                Double b = Double.parseDouble(op2);
                Double luas = a * b;
                Double kell = (a * 2) + (b * 2);

                Luas.setText("Luas : " + luas);
                Keliling.setText("Keliling : " + kell);

            }
        });

        Segt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String op1 = Input1.getText().toString().trim();
                String op2 = Input2.getText().toString().trim();

                Double a = Double.parseDouble(op1);
                Double b = Double.parseDouble(op2);
                Double pangk = Math.pow(a, 2) + Math.pow(b, 2);
                Double luas = (a * b) / 2;
                Double kell = a + b + Math.sqrt(pangk);

                Luas.setText("Luas : " + luas);
                Keliling.setText("Keliling : " + kell);

            }
        });

        Segt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String op1 = Input1.getText().toString().trim();
                String op2 = Input2.getText().toString().trim();

                Double a = Double.parseDouble(op1);
                Double b = Double.parseDouble(op2);
                Double pangk = Math.pow(a, 2) + Math.pow(b, 2);
                Double luas = (a * b) / 2;
                Double kell = a + b + Math.sqrt(pangk);

                Luas.setText("Luas : " + luas);
                Keliling.setText("Keliling : " + kell);

            }
        });

        Lingk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String op1=Input1.getText().toString().trim();

                Double a= Double.parseDouble(op1);
                Double luas=Math.PI*a*a;
                Double kell=Math.PI*2*a;

                Luas.setText("Luas : "+ luas);
                Keliling.setText("Keliling : "+kell);

            }
        });
    }
}







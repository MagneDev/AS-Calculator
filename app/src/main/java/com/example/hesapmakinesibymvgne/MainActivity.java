package com.example.hesapmakinesibymvgne;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText num1 = findViewById(R.id.editTextNum1);
        EditText num2 = findViewById(R.id.editTextNum2);
        TextView result = findViewById(R.id.textViewResult);


        Button btn_topla = findViewById(R.id.btnTopla);
        Button btn_cikar = findViewById(R.id.btnCikar);
        Button btn_carp = findViewById(R.id.btnCarp);
        Button btn_bol = findViewById(R.id.btnBol);



            btn_topla.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int firstNumber = Integer.parseInt(num1.getText().toString());
                    int secondNumber = Integer.parseInt(num2.getText().toString());
                    int toplam = firstNumber + secondNumber;
                    result.setText(Integer.toString(toplam));
                }
            });
        btn_cikar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int firstNumber = Integer.parseInt(num1.getText().toString());
                int secondNumber = Integer.parseInt(num2.getText().toString());
                int fark = firstNumber - secondNumber;
                result.setText(Integer.toString(fark));
            }
        });
        btn_carp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int firstNumber = Integer.parseInt(num1.getText().toString());
                int secondNumber = Integer.parseInt(num2.getText().toString());
                int carpim = firstNumber * secondNumber;
                result.setText(Integer.toString(carpim));
            }
        });
        btn_bol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int firstNumber = Integer.parseInt(num1.getText().toString());
                int secondNumber = Integer.parseInt(num2.getText().toString());
                int bolum = firstNumber / secondNumber;
                result.setText(Integer.toString(bolum));
            }
        });



    }
}
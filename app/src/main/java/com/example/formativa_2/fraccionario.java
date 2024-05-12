package com.example.formativa_2;

import android.os.Bundle;
import android.text.style.TtsSpan;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;


public class fraccionario extends AppCompatActivity {
    ImageView igual;
    EditText F1, F2, resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fraccionario);
        igual = findViewById(R.id.imageView2);
        F1= findViewById(R.id.fraccionario_1);
        F2 = findViewById(R.id.fraccionario2);
        resultado = findViewById(R.id.output_fraccionarios);

        igual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String[] f1Strings = F1.getText().toString().split("/");
                String[] f2Strings = F2.getText().toString().split("/");
                int f1Num1 = Integer.parseInt(f1Strings[0]);
                int f1Num2 = Integer.parseInt(f1Strings[1]);
                int f2Num1 = Integer.parseInt(f2Strings[0]);
                int f2Num2 = Integer.parseInt(f2Strings[1]);

                int numerador = f1Num1 * f2Num2 + f2Num1 * f1Num2;
                int denominador = f1Num2 * f2Num2;
                String result = numerador + "/" + denominador;
                resultado.setText(result);


            }
        });

    }
}
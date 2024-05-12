package com.example.formativa_2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


import androidx.appcompat.app.AppCompatActivity;

public class ecuacion_cuadratica extends AppCompatActivity {

    EditText A ,B ,C ,R1 ,R2;
    Button calcular;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ecuacion_cuadratica);
        A = findViewById(R.id.componente_a);
        B = findViewById(R.id.componente_b);
        C = findViewById(R.id.componente_c);
        R1 = findViewById(R.id.raiz1);
        R2 = findViewById(R.id.raiz2);
        calcular = findViewById(R.id.calcular_ecuacion_cuadratica);

        calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double a = Double.parseDouble(A.getText().toString());
                double b = Double.parseDouble(B.getText().toString());
                double c = Double.parseDouble(C.getText().toString());

                double discriminante = b * b - 4 * a * c;

                if (discriminante > 0) {
                    double x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
                    double x2 = (-b - Math.sqrt(discriminante)) / (2 * a);
                    String X1 = String.valueOf(x1);
                    String X2 = String.valueOf(x2);
                    R1.setText(X1);
                    R2.setText(X2);
                } else if (discriminante == 0) {
                    double x = -b / (2 * a);
                    String X = "raiz unica: " + String.valueOf(x);
                    R1.setText(X);
                } else {
                    double parte_real = -b / (2 * a);
                    double parte_imaginaria = Math.sqrt(-discriminante) / (2 * a);
                    String pr = String.valueOf(parte_real);
                    String pi = String.valueOf(parte_imaginaria);
                    R1.setText(pr);
                    R2.setText(pi);
                }
            }
        });
    }
}
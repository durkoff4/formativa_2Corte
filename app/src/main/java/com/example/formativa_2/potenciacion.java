package com.example.formativa_2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class potenciacion extends AppCompatActivity {
    EditText base, exponente, resultado;
    Button calcular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_potenciacion);
        calcular = findViewById(R.id.boton_calcular_potencia);
        base = findViewById(R.id.base);
        exponente = findViewById(R.id.exponente);
        resultado = findViewById(R.id.resultado);

        calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               double B = Double.parseDouble(String.valueOf(base.getText()));
               double E = Double.parseDouble(String.valueOf(exponente.getText()));
               double result = Math.pow(B,E);
               String r = String.valueOf(result);
               resultado.setText(r);
            }
        });
    }
}
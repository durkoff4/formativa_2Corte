package com.example.formativa_2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView listado;
    ArrayList<String> opciones;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        opciones = new ArrayList<String>();
        opciones.add("potenciacion");
        opciones.add("fraccionario");
        opciones.add("raiz cuadratica");
        listado = (ListView) findViewById(R.id.lista);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,opciones);
        listado.setAdapter(adapter);

        listado.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i;
                switch (position){
                    case 0:
                        i = new Intent(getApplicationContext(), potenciacion.class);
                        startActivity(i);
                        break;
                    case 1:
                        i = new Intent(getApplicationContext(), fraccionario.class);
                        startActivity(i);
                        break;
                    case 2:
                        i = new Intent(getApplicationContext(), ecuacion_cuadratica.class);
                        startActivity(i);
                        break;
                }
            }
        });

    }
}
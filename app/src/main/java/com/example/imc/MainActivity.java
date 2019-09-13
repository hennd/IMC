package com.example.imc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button btnCalcularIMC;
    private EditText txtPeso;
    private EditText txtAltura;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


       btnCalcularIMC = findViewById(R.id.btnCalcularIMC);
       txtPeso = findViewById(R.id.txtPeso);
       txtAltura = findViewById(R.id.txtAltura);

       btnCalcularIMC.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {

               Intent intent = new Intent(getBaseContext(), tela2.class);
               intent.putExtra("peso",txtPeso.getText().toString());
               intent.putExtra("altura",txtAltura.getText().toString());
               startActivity(intent);


           }
       });
    }
}

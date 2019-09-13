package com.example.imc;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class tela2 extends AppCompatActivity
{
    TextView mostra;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela2);

        mostra = findViewById(R.id.mostra);
        Intent intent = getIntent();

        String peso = intent.getStringExtra("peso");
        String altura = intent.getStringExtra("altura");

        mostra.setText(peso + " "+ altura);
        double pesocalc=Double.parseDouble(peso);
        double alturacalc=Double.parseDouble(altura);
        double resultado=pesocalc/(alturacalc*alturacalc);

        String resultado1=String.valueOf(resultado);

        if (resultado<18.5)
            mostra.setText("seu imc é"+resultado1+" e seu resultado e: Abaixo do Peso");
        else if(resultado>=18.5 && resultado<=24.9)
            mostra.setText("seu imc é"+resultado1+" e seu resultado e: Peso Normal");
        else if(resultado>=25 && resultado<=29.9)
            mostra.setText("seu imc é"+resultado1+" e seu resultado e: Sobrepeso");
        else if(resultado>=30 && resultado<=34.9)
            mostra.setText("seu imc é"+resultado1+" e seu resultado e: Obesidade Grau 1");
        else if(resultado>=35 && resultado<=39.9)
            mostra.setText("seu imc é"+resultado1+" e seu resultado e: Obesidade Grau 2");
        else if(resultado>=40)
            mostra.setText("seu imc é"+resultado1+" e seu resultado e: Obesidade Grau 3");
    }
}

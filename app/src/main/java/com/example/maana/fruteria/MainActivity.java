package com.example.maana.fruteria;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private EditText Resultado;
    private String texto;
    private Button bt1,bt2,bt3,bt4,bt5,bt6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bt1 = (Button)findViewById(R.id.Platano);
        bt1.setOnClickListener(this);

        bt2 = (Button)findViewById(R.id.Piña);
        bt2.setOnClickListener(this);

        bt3 = (Button)findViewById(R.id.Pera);
        bt3.setOnClickListener(this);

        bt4 = (Button)findViewById(R.id.Manzana);
        bt4.setOnClickListener(this);

        bt5 = (Button)findViewById(R.id.Naranja);
        bt5.setOnClickListener(this);

        bt6 = (Button)findViewById(R.id.Limon);
        bt6.setOnClickListener(this);

        Resultado = (EditText)findViewById(R.id.Resultado);

    }
    public void onClick(View v){
       if(v == bt1){
           texto = bt1.getText().toString();
           Resultado.setText(texto);
       }else if (v == bt2){
           texto = bt2.getText().toString();
           Resultado.setText(texto);
       }else if (v == bt3){
           texto = bt3.getText().toString();
           Resultado.setText(texto);
       }else if (v == bt4){
           texto = bt4.getText().toString();
           Resultado.setText(texto);
       }else if (v == bt5){
           texto = bt5.getText().toString();
           Resultado.setText(texto);
       }else{
           texto = bt6.getText().toString();
           Resultado.setText(texto);
       }

    }
    /*
    public void funcionPlatano(View v){
        Button bt1 = (Button)findViewById(R.id.Platano);
        String texto = bt1.getText().toString();
        Resultado.setText(texto);
    }
    public void funcionPiña(View v){
        Button bt2 = (Button)findViewById(R.id.Piña);
        String texto = bt2.getText().toString();
        Resultado.setText(texto);
    }
    public void funcionPera(View v){
        Button bt3 = (Button)findViewById(R.id.Pera);
        String texto = bt3.getText().toString();
        Resultado.setText(texto);
    }
    public void funcionManzana(View v){
        Button bt4 = (Button)findViewById(R.id.Manzana);
        String texto = bt4.getText().toString();
        Resultado.setText(texto);
    }
    public void funcionNaranja(View v){
        Button bt5 = (Button)findViewById(R.id.Naranja);
        String texto = bt5.getText().toString();
        Resultado.setText(texto);
    }
    public void funcionLimon(View v){
        Button bt6 = (Button)findViewById(R.id.Limon);
        String texto = bt6.getText().toString();
        Resultado.setText(texto);
    }*/
}

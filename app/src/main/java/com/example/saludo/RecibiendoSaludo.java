package com.example.saludo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class RecibiendoSaludo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recibiendo_saludo);

    }
    public void Regresar(View view){
        Intent i=new Intent(this, MainActivity.class);

        startActivity(i);
    }
}

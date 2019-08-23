package com.example.pte;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity
{

    TextReader textReader;
    Button miboton;

    String arregloSecundario[] =new String[30];
    String archivo[][] = new String [10000][30];

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        miboton=(Button)findViewById(R.id.enter);
        textReader = new TextReader();
        textReader.checkPermission(this);
        archivo = textReader.cargar();
        this.comprobar();

    }

    public void comprobar()
    {
        Toast.makeText(this,archivo[2][10],Toast.LENGTH_LONG).show();
    }




}
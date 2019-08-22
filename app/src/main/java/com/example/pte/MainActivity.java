package com.example.pte;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    String archivo[][];
    Button miboton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        miboton=(Button)findViewById(R.id.enter);


    }

    public void cargar(View v)
    {
        archivo= new String[10000][30];

        TextReader textReader = new TextReader();

        archivo = textReader.cargar();
    }


}

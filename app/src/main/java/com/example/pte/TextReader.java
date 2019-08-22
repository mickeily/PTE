package com.example.pte;

import android.Manifest;
import android.content.pm.PackageManager;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class TextReader extends AppCompatActivity
{

    String archivo[][] = new String[10000][30];
    String arregloSecundario[] =new String[30];
    public static final int MY_PERMISSIONG = 1;

    public String[][] cargar()
    {
        File myFile = new File("/sdcard/PT/texto.txt");
        try
        {
            FileInputStream fileInputStream = new FileInputStream(myFile);
            BufferedReader myReader = new BufferedReader(new InputStreamReader(fileInputStream));
            String linea="";
            int contador = 0;

            while ((linea= myReader.readLine())!=null)
            {
                arregloSecundario=linea.split(";");
                archivo[contador]=arregloSecundario;
                contador++;

            }
            myReader.close();


        }catch (Exception e)
        {
            e.getMessage();

        }




        return null;

    }

    public void onRequestPermissionResult (int requestCode,String[] permission, int[] grantResults)
    {
        switch (requestCode)
        {
            case MY_PERMISSIONG:
            if(grantResults.length>0 && grantResults[0]== PackageManager.PERMISSION_GRANTED)
            {

            }else
            {
                return;
            }
        }
    }

    public void checkPermission()
    {
        if(ContextCompat.checkSelfPermission(TextReader.this, Manifest.permission.READ_EXTERNAL_STORAGE)!=PackageManager.PERMISSION_GRANTED)
        {
            if(ActivityCompat.shouldShowRequestPermissionRationale(TextReader.this,Manifest.permission.READ_EXTERNAL_STORAGE))
            {

            }
            else
            {
                ActivityCompat.requestPermissions(TextReader.this, new String[] Manifest.permission.READ_EXTERNAL_STORAGE),MY_PERMISSIONG;
            }
        }
    }



}

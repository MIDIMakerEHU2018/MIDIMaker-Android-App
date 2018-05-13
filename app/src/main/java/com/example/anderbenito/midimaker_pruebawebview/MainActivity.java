package com.example.anderbenito.midimaker_pruebawebview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void analizarAudio(View view){

        Intent i = new Intent(this, MyWb.class);
        startActivity(i);

    }

    public void mostrarInfo(View view){

        Intent i = new Intent(this, InfoClass.class);
        startActivity(i);

    }
}

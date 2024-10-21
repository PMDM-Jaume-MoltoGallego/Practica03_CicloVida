package com.example.ciclovida;

import android.os.Bundle;
import android.util.Log;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;



public class MainActivity extends AppCompatActivity {

    private static final String DEBUG_TAG = "LogsAndroid_1";

    //TODO Sirve para cuando se ejecuta por primera vez la aplicación,
    // cuando ponemos en primer plano nuestra aplicación desde las aplicaciones abiertas
    @Override
    protected void onStart() {
        super.onStart();
    }

    //TODO Sirve para cuando le damos al boton de atrás,
    // cuando le damos al boton HOME teniendo la aplicación en primer plano,
    // cuando accedemos a las aplicaciones abiertas
    @Override
    protected void onStop() {
        super.onStop();
    }

    //TODO Sirve para varias utilidades,como para cuando le damos al boton de atrás,
    // cuando le damos al boton HOME teniendo la aplicación en primer plano,
    // cuando accedemos a las aplicaciones abiertas
    @Override
    protected void onPause() {
        super.onPause();
        Log.i(DEBUG_TAG,"onPause");
    }

    //TODO Sirve para cuando se ejecuta por primera vez la aplicación,
    // cuando ponemos en primer plano nuestra aplicación desde las aplicaciones abiertas
    @Override
    protected void onResume() {
        super.onResume();
    }

    //TODO Sirve para cuando ponemos en primer plano nuestra aplicación desde las aplicaciones abiertas
    @Override
    protected void onRestart() {
        super.onRestart();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}
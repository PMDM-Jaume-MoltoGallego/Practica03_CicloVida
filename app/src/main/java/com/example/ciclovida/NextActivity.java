package com.example.ciclovida;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class NextActivity extends AppCompatActivity {

    private static final String DEBUG_TAG = "LogsAndroid_2";
    private static final String CADENA = "ACTIVIDAD_2";

    //TODO Sirve para cuando se ejecuta por primera vez la aplicación,
    // cuando ponemos en primer plano nuestra aplicación desde las aplicaciones abiertas
    @Override
    protected void onStart() {
        super.onStart();
        Log.i(DEBUG_TAG,"onStart");
    }

    //TODO Sirve para cuando le damos al boton de atrás,
    // cuando le damos al boton HOME teniendo la aplicación en primer plano,
    // cuando accedemos a las aplicaciones abiertas
    @Override
    protected void onStop() {
        super.onStop();
        Log.i(DEBUG_TAG,"onStop");
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
        Log.i(DEBUG_TAG,"onResume");
    }

    //TODO Sirve para cuando ponemos en primer plano nuestra aplicación desde las aplicaciones abiertas
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(DEBUG_TAG,"onRestart");
    }

    //TODO Sirve para cuando el usuario le da al boton de atrás o lo hace el sistema
    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (isFinishing()) {
            Log.i(DEBUG_TAG, "onDestroy: El usuario acaba la activity");
        } else {
            Log.i(DEBUG_TAG, "onDestroy: El sistema acaba la activity");
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_next);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        String cadena = savedInstanceState.getString(CADENA);
        Log.i(DEBUG_TAG, "onRestoreInstanceState: " + cadena);

    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.i(DEBUG_TAG, "onSaveInstanceState: En onSaveInstance() se guarda la cadena, así no se destruira con el onDestroy() al cambiar el dispositivo de orientación");
        outState.putString(CADENA, "Esta cadena se salva gracias a recuperarla onRestoreInstanceState()");
    }


}
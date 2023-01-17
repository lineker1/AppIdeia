package me.udemy.appideia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;

public class SplashActivity extends AppCompatActivity {

    String TAG = "APP_MINHA_IDEIA";

    int tempoDeEspera = 1000 * 3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Log.d(TAG, "onCreate: Tela Splash carregada...");

        trocarTela();

    }

    private void trocarTela() {

        Log.d(TAG, "trocarTela: Mudando de tela...");

        new Handler().postDelayed(() -> {

            Log.d(TAG, "trocarTela: Esperando um tempo...");

            Intent trocarDeTela = new Intent(SplashActivity.this, MainActivity.class);
            startActivity(trocarDeTela);
            finish();

        }, tempoDeEspera);


    }
}
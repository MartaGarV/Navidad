package com.example.marta.navidad;

import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MediaPlayer musica = MediaPlayer.create(this, R.raw.cajas_registradoras);
        musica.start();

        Typeface miFuente = Typeface.createFromAsset(getAssets(),"ThePerfectChristmas.ttf");
        TextView frase =  findViewById(R.id.frase);
        TextView frase1 = findViewById(R.id.frase1);
        frase.setTypeface(miFuente);
        frase1.setTypeface(miFuente);

        Animation animacion = AnimationUtils.loadAnimation(this,R.anim.animacion);
        frase.startAnimation(animacion);
        frase1.startAnimation(animacion);


    }
}

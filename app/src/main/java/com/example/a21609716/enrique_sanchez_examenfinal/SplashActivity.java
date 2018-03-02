package com.example.a21609716.enrique_sanchez_examenfinal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import com.mikhaellopez.circularfillableloaders.CircularFillableLoaders;

public class SplashActivity extends AppCompatActivity implements Animation.AnimationListener{
    private TextView tt;
    private ImageView ii;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        tt=(TextView) findViewById(R.id.splash);
        ii=(CircularFillableLoaders) findViewById(R.id.circularFillableLoaders);

        Animation animaImagen = AnimationUtils.loadAnimation(this, R.anim.tete);

        //ii.startAnimation(animaImagen);
        tt.startAnimation(animaImagen);
        animaImagen.setAnimationListener(this);





    }

    @Override
    public void onAnimationStart(Animation animation) {

    }

    @Override
    public void onAnimationEnd(Animation animation) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
    }

    @Override
    public void onAnimationRepeat(Animation animation) {

    }
}

package com.mycompany.playmakerjacob1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Created by jacob on 7/4/2015.
 */
public class MainPage extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_page);
    }


    public void BasketBall(View view) {
        Intent intent_baskekball = new Intent(this, BasketBall.class);
        startActivity(intent_baskekball);
    }

    public void FootBall(View view) {
        Intent intent_football = new Intent(this, FootBall.class);
        startActivity(intent_football);
    }


    public void Tichu(View view) {
        Intent intent_tichu = new Intent(this, Tichu.class);
        startActivity(intent_tichu);
    }

    public void Blackgammon(View view) {
        Intent intent_blackgammon = new Intent(this, Blackgammon.class);
        startActivity(intent_blackgammon);
    }

    public void LegueOfLegends(View view) {
        Intent intent_legueoflegends = new Intent(this, LegueOfLegends.class);
        startActivity(intent_legueoflegends);
    }

    public void CounterStrike(View view) {
        Intent intent_counterstrike = new Intent(this, CounterStrike.class);
        startActivity(intent_counterstrike);
    }



}

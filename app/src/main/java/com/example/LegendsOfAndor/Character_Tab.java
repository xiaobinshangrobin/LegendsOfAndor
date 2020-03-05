package com.example.LegendsOfAndor;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Character_Tab extends AppCompatActivity {

    @Override
    public void onBackPressed(){
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.character_tab);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        //warrior - invisible
        ImageView warrior = findViewById(R.id.warrior);
        warrior.setVisibility(View.INVISIBLE);
        ImageView gold_war = findViewById(R.id.gold_war);
        gold_war.setVisibility(View.INVISIBLE);
        ImageView SP_war = findViewById(R.id.SP_war);
        SP_war.setVisibility(View.INVISIBLE);
        TextView WP_war = findViewById(R.id.willpower_war);
        WP_war.setVisibility(View.INVISIBLE);
        TextView amt_SP_war = findViewById(R.id.amt_SP_war);
        amt_SP_war.setVisibility(View.INVISIBLE);
        TextView amt_gold_war = findViewById(R.id.amt_gold_war);
        amt_gold_war.setVisibility(View.INVISIBLE);
        TextView amt_WP_war = findViewById(R.id.amt_WP_war);
        amt_WP_war.setVisibility(View.INVISIBLE);

        //mage - invisible
        ImageView mage = findViewById(R.id.mage);
        mage.setVisibility(View.INVISIBLE);
        ImageView gold_mg = findViewById(R.id.gold_mg);
        gold_mg.setVisibility(View.INVISIBLE);
        ImageView SP_mg = findViewById(R.id.SP_mg);
        SP_mg.setVisibility(View.INVISIBLE);
        TextView WP_mg = findViewById(R.id.willpower_mg);
        WP_mg.setVisibility(View.INVISIBLE);
        TextView amt_SP_mg = findViewById(R.id.amt_SP_mg);
        amt_SP_mg.setVisibility(View.INVISIBLE);
        TextView amt_gold_mg = findViewById(R.id.amt_gold_mg);
        amt_gold_mg.setVisibility(View.INVISIBLE);
        TextView amt_WP_mg = findViewById(R.id.amt_WP_mg);
        amt_WP_mg.setVisibility(View.INVISIBLE);

        //dwarf - invisible
        ImageView dwarf = findViewById(R.id.dwarf);
        dwarf.setVisibility(View.INVISIBLE);
        ImageView gold_dw = findViewById(R.id.gold_dw);
        gold_dw.setVisibility(View.INVISIBLE);
        ImageView SP_dw = findViewById(R.id.SP_dw);
        SP_dw.setVisibility(View.INVISIBLE);
        TextView WP_dw = findViewById(R.id.willpower_dw);
        WP_dw.setVisibility(View.INVISIBLE);
        TextView amt_SP_dw = findViewById(R.id.amt_SP_dw);
        amt_SP_dw.setVisibility(View.INVISIBLE);
        TextView amt_gold_dw = findViewById(R.id.amt_gold_dw);
        amt_gold_dw.setVisibility(View.INVISIBLE);
        TextView amt_WP_dw = findViewById(R.id.amt_WP_dw);
        amt_WP_dw.setVisibility(View.INVISIBLE);

        //archer - invisible
        ImageView archer = findViewById(R.id.archer);
        archer.setVisibility(View.INVISIBLE);
        ImageView gold_ar = findViewById(R.id.gold_ar);
        gold_ar.setVisibility(View.INVISIBLE);
        ImageView SP_ar = findViewById(R.id.SP_ar);
        SP_ar.setVisibility(View.INVISIBLE);
        TextView WP_ar = findViewById(R.id.willpower_ar);
        WP_ar.setVisibility(View.INVISIBLE);
        TextView amt_SP_ar = findViewById(R.id.amt_SP_ar);
        amt_SP_ar.setVisibility(View.INVISIBLE);
        TextView amt_gold_ar = findViewById(R.id.amt_gold_ar);
        amt_gold_ar.setVisibility(View.INVISIBLE);
        TextView amt_WP_ar = findViewById(R.id.amt_WP_ar);
        amt_WP_ar.setVisibility(View.INVISIBLE);

        Game game  = MyPlayer.getInstance().getGame();
        Player[] players = game.getPlayers();

        for (Player p: players) {
            HeroClass hClass = p.getHero().getHeroClass();
            if (hClass == HeroClass.WARRIOR) {
                warrior.setVisibility(View.VISIBLE);
                gold_war.setVisibility(View.VISIBLE);
                SP_war.setVisibility(View.VISIBLE);
                WP_war.setVisibility(View.VISIBLE);
                amt_SP_war.setVisibility(View.VISIBLE);
                amt_gold_war.setVisibility(View.VISIBLE);
                amt_WP_war.setVisibility(View.VISIBLE);

                amt_SP_war.setText(String.valueOf(p.getHero().getStrength()));
                amt_gold_war.setText(String.valueOf(p.getHero().getGold()));
                amt_WP_war.setText(String.valueOf(p.getHero().getWillPower()));
            }
            if(hClass == HeroClass.ARCHER){
                archer.setVisibility(View.VISIBLE);
                gold_ar.setVisibility(View.VISIBLE);
                SP_ar.setVisibility(View.VISIBLE);
                WP_ar.setVisibility(View.VISIBLE);
                amt_SP_ar.setVisibility(View.VISIBLE);
                amt_gold_ar.setVisibility(View.VISIBLE);
                amt_WP_ar.setVisibility(View.VISIBLE);

                amt_SP_ar.setText(String.valueOf(p.getHero().getStrength()));
                amt_gold_ar.setText(String.valueOf(p.getHero().getGold()));
                amt_WP_ar.setText(String.valueOf(p.getHero().getWillPower()));
            }
            if(hClass == HeroClass.WIZARD){
                mage.setVisibility(View.VISIBLE);
                gold_mg.setVisibility(View.VISIBLE);
                SP_mg.setVisibility(View.VISIBLE);
                WP_mg.setVisibility(View.VISIBLE);
                amt_SP_mg.setVisibility(View.VISIBLE);
                amt_gold_mg.setVisibility(View.VISIBLE);
                amt_WP_mg.setVisibility(View.VISIBLE);

                amt_SP_mg.setText(String.valueOf(p.getHero().getStrength()));
                amt_gold_mg.setText(String.valueOf(p.getHero().getGold()));
                amt_WP_mg.setText(String.valueOf(p.getHero().getWillPower()));
            }
            if(hClass == HeroClass.DWARF){
                dwarf.setVisibility(View.VISIBLE);
                gold_dw.setVisibility(View.VISIBLE);
                SP_dw.setVisibility(View.VISIBLE);
                WP_dw.setVisibility(View.VISIBLE);
                amt_SP_dw.setVisibility(View.VISIBLE);
                amt_gold_dw.setVisibility(View.VISIBLE);
                amt_WP_dw.setVisibility(View.VISIBLE);

                amt_SP_dw.setText(String.valueOf(p.getHero().getStrength()));
                amt_gold_dw.setText(String.valueOf(p.getHero().getGold()));
                amt_WP_dw.setText(String.valueOf(p.getHero().getWillPower()));
            }
        }

        ImageButton backb = (ImageButton) findViewById(R.id.backb);
        backb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(v.getContext(), OptionsTab.class);
                startActivity(myIntent);
            }
        });

    }
}
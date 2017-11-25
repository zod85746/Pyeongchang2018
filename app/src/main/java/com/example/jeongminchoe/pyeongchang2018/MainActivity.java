package com.example.jeongminchoe.pyeongchang2018;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.game_list_activity);

        ImageButton alpine_btn = (ImageButton) findViewById(R.id.alpineSkiingImg);
        ImageButton biathlon_btn = (ImageButton) findViewById(R.id.biathlonImg);
        ImageButton cross_country_btn = (ImageButton) findViewById(R.id.crossCountrySkiingImg);
        ImageButton bobsleigh_btn = (ImageButton) findViewById(R.id.bobsleighImg);
        ImageButton curling_btn = (ImageButton) findViewById(R.id.curlingImg);
        ImageButton figure_skating_btn = (ImageButton) findViewById(R.id.figureSkatingImg);
        ImageButton free_style_skiing_btn = (ImageButton) findViewById(R.id.freeStyleSkiingImg);
        ImageButton ice_hockey_btn = (ImageButton) findViewById(R.id.iceHockeyImg);
        ImageButton luge_btn = (ImageButton) findViewById(R.id.lugeImg);
        ImageButton nordic_combined_btn = (ImageButton) findViewById(R.id.nordicCombinedImg);
        ImageButton short_track_btn = (ImageButton) findViewById(R.id.shortTrackImg);
        ImageButton skeleton_btn = (ImageButton) findViewById(R.id.skeletonImg);
        ImageButton ski_jumping_btn = (ImageButton) findViewById(R.id.skeletonImg);
        ImageButton snowboard_btn = (ImageButton) findViewById(R.id.snowboardImg);
        ImageButton speed_skating_btn = (ImageButton) findViewById(R.id.speedSkatingImg);


        alpine_btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(
                       MainActivity.this, GameListView.class);
                startActivity(intent);
            }
        });

    }
}

//git config --global user.email "zod85746@naver.com"
//git config --global user.name "zod85746"
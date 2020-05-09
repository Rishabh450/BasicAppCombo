package com.example.rishabh.shopping;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.media.MediaPlayer;
import android.net.Uri;
import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.AnimationUtils;
import android.view.animation.LayoutAnimationController;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Locale;

import static java.util.Arrays.asList;

public class Main2Activity extends AppCompatActivity {
    MediaPlayer mp;
    String e;
    String ss;
    TextToSpeech t1;

    public void user(View view) {

        t1.speak("Welcome" + ss, TextToSpeech.QUEUE_FLUSH, null);

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main2);
        Intent intent = getIntent();
        ss = intent.getStringExtra("name");
        t1 = new TextToSpeech(this, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                t1.setLanguage(Locale.ENGLISH);
                t1.setSpeechRate(0.5f);
            }


        });


        Toast.makeText(Main2Activity.this, "Welcome " + ss, Toast.LENGTH_SHORT).show();
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.list);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        String[] x = {"MULTIMEDIA", "CALCULATOR", "CAMERA", "THE GUESSING GAME", "SHOPPING ZONE", "TIC TAC TOE", "POKEMON", "MAGICAL MUSIC PLAYER"};
        int[] id = {getResources().getIdentifier(getResources().getResourceEntryName(R.drawable.multi), "drawable", getPackageName()), getResources().getIdentifier(getResources().getResourceEntryName(R.drawable.calcu), "drawable", getPackageName()), getResources().getIdentifier(getResources().getResourceEntryName(R.drawable.cam), "drawable", getPackageName()), getResources().getIdentifier(getResources().getResourceEntryName(R.drawable.guessing), "drawable", getPackageName()), getResources().getIdentifier(getResources().getResourceEntryName(R.drawable.shopping), "drawable", getPackageName()), getResources().getIdentifier(getResources().getResourceEntryName(R.drawable.tictactoeee), "drawable", getPackageName()), getResources().getIdentifier(getResources().getResourceEntryName(R.drawable.pokemonn), "drawable", getPackageName()), getResources().getIdentifier(getResources().getResourceEntryName(R.drawable.magic), "drawable", getPackageName())};
        recyclerView.setAdapter(new Adapt(x, id, getApplicationContext()));


    }
}
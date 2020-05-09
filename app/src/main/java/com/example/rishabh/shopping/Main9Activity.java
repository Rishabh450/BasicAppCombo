package com.example.rishabh.shopping;

import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;

import com.example.rishabh.shopping.Main10Activity;
import com.example.rishabh.shopping.R;

public class Main9Activity extends AppCompatActivity {

    public void play(View view)
    {
        Button b=findViewById(R.id.button);
        Intent intent = new Intent(Main9Activity.this,Main10Activity.class);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);


        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main9);
    }

}

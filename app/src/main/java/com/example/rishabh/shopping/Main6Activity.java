package com.example.rishabh.shopping;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Main6Activity extends AppCompatActivity {
    MediaPlayer xp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
    }
   public void music(View view)
   {
       Intent intent=new Intent(Main6Activity.this,Main8Activity.class);
       startActivity(intent);
   }
   public void video(View view)
   {
       Intent intenti=new Intent(Main6Activity.this,Main19Activity.class);
       startActivity(intenti);
   }

}

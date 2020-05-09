package com.example.rishabh.shopping;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SeekBar;
import android.widget.Toast;

import java.util.ArrayList;

import static java.util.Arrays.asList;

public class Main8Activity extends AppCompatActivity {
    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);





        final ListView listView=findViewById(R.id.listre);
        final ArrayList arrayList=new ArrayList(asList("Closer","Love me like you do","Tum mere ho","Vaaste","Jab bhi teri yaad","Soch na sake","Jaan nisaar","Duniya","Jab Tak","Tera hone laga hoon","Tera hua","Chura liya"));
        ArrayAdapter arrayAdapter=new ArrayAdapter(this,android.R.layout.simple_list_item_1,arrayList);
        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // Log.i("person tapped",arrayList.get(position));
               // Toast.makeText(getApplicationContext(),"Hello "+ arrayList.get(position),Toast.LENGTH_SHORT).show();
                switch (position){
                    case 0: mediaPlayer=MediaPlayer.create(Main8Activity.this,R.raw.duniya);
                          //  if(mediaPlayer.isPlaying()==false)
                            mediaPlayer.start();
                            break;
                    case 1:mediaPlayer=MediaPlayer.create(Main8Activity.this,R.raw.duniya);
                       // if(mediaPlayer.isPlaying()==false)
                        mediaPlayer.start();
                        break;
                    case 2:mediaPlayer=MediaPlayer.create(Main8Activity.this,R.raw.duniya);
                       // if(mediaPlayer.isPlaying()==false)
                        mediaPlayer.start();
                        break;
                    case 3:mediaPlayer=MediaPlayer.create(Main8Activity.this,R.raw.vaaste);
                        //if(mediaPlayer.isPlaying()==false)
                        mediaPlayer.start();
                        break;
                    case 4:mediaPlayer=MediaPlayer.create(Main8Activity.this,R.raw.vaaste);
                       // if(mediaPlayer.isPlaying()==false)
                        mediaPlayer.start();
                        break;
                    case 5:mediaPlayer=MediaPlayer.create(Main8Activity.this,R.raw.vaaste);
                       // if(mediaPlayer.isPlaying()==false)
                        mediaPlayer.start();
                        break;
                    case 6:mediaPlayer=MediaPlayer.create(Main8Activity.this,R.raw.duniya);
                      //  if(mediaPlayer.isPlaying()==false)
                        mediaPlayer.start();
                        break;
                    case 7:mediaPlayer=MediaPlayer.create(Main8Activity.this,R.raw.duniya);
                       // if(mediaPlayer.isPlaying()==false)
                        mediaPlayer.start();
                        break;
                    case 8:mediaPlayer=MediaPlayer.create(Main8Activity.this,R.raw.vaaste);
                      //  if(mediaPlayer.isPlaying()==false)
                        mediaPlayer.start();
                        break;
                    case 9:mediaPlayer=MediaPlayer.create(Main8Activity.this,R.raw.duniya);
                        //if(mediaPlayer.isPlaying()==false)
                        mediaPlayer.start();
                        break;
                    case 10:mediaPlayer=MediaPlayer.create(Main8Activity.this,R.raw.duniya);

                        mediaPlayer.start();
                        break;
                    case 11:mediaPlayer=MediaPlayer.create(Main8Activity.this,R.raw.churaliya);

                        mediaPlayer.start();
                        break;

                }

            }
        });
    }
    public void stop(View view){
        mediaPlayer.stop();
    }
    public void pause(View view){
        mediaPlayer.pause();
    }
    public void play(View view){
        mediaPlayer.start();
    }


}

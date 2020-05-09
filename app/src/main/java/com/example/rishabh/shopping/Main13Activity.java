package com.example.rishabh.shopping;

import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Main13Activity extends AppCompatActivity {


    int r; boolean tos=false;MediaPlayer mp;
    public void toss(View view)
    {  mp = MediaPlayer.create(this, R.raw.clic);
        mp.start();
        if(tos==false)
        {
            EditText e=(EditText) findViewById(R.id.editText);
            EditText e1=findViewById(R.id.editText2);
            if(e.getText().toString().compareTo("")!=0&&e1.getText().toString().compareTo("")!=0) {
                r = (int) (Math.random() * 2);
                if (r == 0)
                    Toast.makeText(Main13Activity.this, e.getText().toString() + " won the toss", Toast.LENGTH_SHORT).show();
                else if (r == 1)
                    Toast.makeText(Main13Activity.this, e1.getText().toString() + " won the toss", Toast.LENGTH_SHORT).show();
                tos=!tos;
            }
            else
                Toast.makeText(Main13Activity.this,  "Please enter the name of players", Toast.LENGTH_LONG).show();}
        else
            Toast.makeText(Main13Activity.this,  "TOSS IS ALREADY DONE", Toast.LENGTH_LONG).show();

    }
    public void play(View view )
    {
        mp = MediaPlayer.create(this, R.raw.clic);
        mp.start();
        if(tos==true) {
            EditText e = (EditText) findViewById(R.id.editText);
            EditText e1 = (EditText) findViewById(R.id.editText2);

            if (e.getText().toString().compareTo("") != 0) {
                Toast.makeText(Main13Activity.this, "Welcome to the game " + e.getText().toString() + " and "+e1.getText().toString()+ "!", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Main13Activity.this, Main14Activity.class);
                intent.putExtra("toss",r);
                intent.putExtra("congress",e.getText().toString());
                intent.putExtra("bjp",e1.getText().toString());

                startActivity(intent);

            } else {
                new AlertDialog.Builder(Main13Activity.this)
                        .setTitle("WARNING...!!!!")

                        .setMessage("Please enter username and password")
                        .setCancelable(true)
                        .setPositiveButton("ok", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                // finish();
                                //  Intent intent=new Intent(Main4Activity.this,Main2Activity.class);
                            }
                        })
                        .setNegativeButton("cancel", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                // finish();
                                //  Intent intent=new Intent(Main4Activity.this,Main2Activity.class);
                            }
                        })
                        .show();

            }
        }
        else
            Toast.makeText(Main13Activity.this,  "YOU CAN'T PROCEED WITHOUT DOING TOSS", Toast.LENGTH_LONG).show();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main13);
    }
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            exitByBackKey();



            return true;
        }
        return super.onKeyDown(keyCode, event);
    }

    protected void exitByBackKey() {

        AlertDialog alertbox = new AlertDialog.Builder(this)
                .setMessage("Do you want to exit application?")
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {

                    // do something when the button is clicked
                    public void onClick(DialogInterface arg0, int arg1) {

                        finish();
                        //close();


                    }
                })
                .setNegativeButton("No", new DialogInterface.OnClickListener() {

                    // do something when the button is clicked
                    public void onClick(DialogInterface arg0, int arg1) {
                    }
                })
                .show();

    }

}

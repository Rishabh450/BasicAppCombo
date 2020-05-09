package com.example.rishabh.shopping;

import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.media.MediaPlayer;
import android.speech.tts.TextToSpeech;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {
    MediaPlayer mp;Fragment fragment,f2;
   public void log(View view)
    {
        mp = MediaPlayer.create(this, R.raw.clic);
        mp.start();
        EditText my=(EditText) findViewById(R.id.usernamee);
        EditText m=(EditText) findViewById(R.id.passwordd) ;


        if(my.getText().toString().compareTo("")!=0&&m.getText().toString().compareTo("")!=0)
        {   // Toast.makeText(MainActivity.this,"Hi there "+my.getText().toString()+"!" , Toast.LENGTH_SHORT).show();
            SQLiteDatabase db=this.openOrCreateDatabase("netcamp",MODE_PRIVATE,null);
            db.execSQL("create table if not exists diya(name varchar, password varchar, email varchar,blog varchar)");
            String s3="select * from diya where name='"+my.getText().toString()+"' and password='"+m.getText().toString()+"' ";
            Cursor cursor=db.rawQuery(s3,null);
            if(cursor.getCount()>0)
            {
                Toast.makeText(MainActivity.this,"login successful",Toast.LENGTH_SHORT).show();


                Intent intent=new Intent(MainActivity.this,Main2Activity.class);
                intent.putExtra("name",my.getText().toString());
                startActivity(intent);
                finish();}
            else
            {
                Toast.makeText(MainActivity.this,"login unsuccessful please signup first",Toast.LENGTH_SHORT).show();
                fragment=new Signup();
                FragmentManager fragmentManager=getSupportFragmentManager();
                FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.fragment,fragment);
                fragmentTransaction.commit();
            }


        }

        else
        {
            new AlertDialog.Builder(MainActivity.this)
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
    public void sig(View view ) {
        mp = MediaPlayer.create(this, R.raw.clic);
        mp.start();
        EditText a, b, c;
        a = (EditText) findViewById(R.id.name1);
        b = (EditText) findViewById(R.id.pass1);
        c = (EditText) findViewById(R.id.email1);


        if (a.getText().toString().compareTo("") != 0 && b.getText().toString().compareTo("") != 0 && c.getText().toString().compareTo("") != 0) {
            SQLiteDatabase db = this.openOrCreateDatabase("netcamp", MODE_PRIVATE, null);
            db.execSQL("create table if not exists diya(name varchar, password varchar, email varchar)");
            String s1 = "select * from diya where name='" + a.getText().toString() + "' and email='" + c.getText().toString() + "' ";
            Cursor cursor = db.rawQuery(s1, null);
            if (cursor.getCount() > 0) {
                Toast.makeText(MainActivity.this, "user exists!!add a new user", Toast.LENGTH_SHORT).show();
                fragment = new Signup();
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.fragment, fragment);
                fragmentTransaction.commit();
            } else {
                db.execSQL("insert into diya values('" + a.getText().toString() + "','" + b.getText().toString() + "','" + c.getText().toString() + "')");
                Toast.makeText(MainActivity.this, "Database Updated", Toast.LENGTH_SHORT).show();
                fragment = new Login();
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.fragment, fragment);
                fragmentTransaction.commit();

            }
        } else {
            new AlertDialog.Builder(MainActivity.this)
                    .setTitle("warning!!!")

                    .setMessage("please enter all the fields")
                    .setCancelable(false)
                    .setPositiveButton("ok", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            //  Intent intent=new Intent(Main4Activity.this,Main2Activity.class);
                        }
                    })
                    .setNegativeButton("cancel", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                            //  Intent intent=new Intent(Main4Activity.this,Main2Activity.class);
                        }
                    })
                    .show();

        }
    }


        public void login(View view)
    {
       /* mp = MediaPlayer.create(this, R.raw.clic);
        mp.start();*/
        fragment=new Login();
        FragmentManager fragmentManager=getSupportFragmentManager();
        FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.fragment,fragment);
        fragmentTransaction.commit();
        /*EditText my=(EditText) findViewById(R.id.username);
        EditText m=(EditText) findViewById(R.id.password) ;


        if(my.getText().toString().compareTo("")!=0&&m.getText().toString().compareTo("")!=0)
        {   // Toast.makeText(MainActivity.this,"Hi there "+my.getText().toString()+"!" , Toast.LENGTH_SHORT).show();
            SQLiteDatabase db=this.openOrCreateDatabase("netcamp",MODE_PRIVATE,null);
            db.execSQL("create table if not exists diya(name varchar, password varchar, email varchar)");
            String s3="select * from diya where name='"+my.getText().toString()+"' and password='"+m.getText().toString()+"' ";
            Cursor cursor=db.rawQuery(s3,null);
            if(cursor.getCount()>0)
            {
                Toast.makeText(MainActivity.this,"login successful",Toast.LENGTH_SHORT).show();


                Intent intent=new Intent(MainActivity.this,Main2Activity.class);
                intent.putExtra("name",my.getText().toString());
                startActivity(intent);
                finish();
            }else
            {
                Toast.makeText(MainActivity.this,"login unsuccessful please signup first",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this,Main3Activity.class);
                startActivity(intent);
            }


            }

        else
        {
            new AlertDialog.Builder(MainActivity.this)
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


        /*Intent intent = new Intent(MainActivity.this,Main2Activity.class);
        startActivity(intent);*/
    }

    public void signup(View view)
    {
        fragment=new Signup();
        FragmentManager fragmentManager=getSupportFragmentManager();
        FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.fragment,fragment);
        fragmentTransaction.commit();
        /*mp = MediaPlayer.create(this, R.raw.clic);
        mp.start();
        Intent i=new Intent(MainActivity.this, Main3Activity.class);
                startActivity(i);*/
    }




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);



    }
}

package com.example.rishabh.shopping;

import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Main14Activity extends AppCompatActivity {

       int to;
    boolean b;
    TextView res;
    //int bcs=0,ccs=0;
    String con,bj;
    boolean b1=false,b2=false,b3=false,b4=false,b5=false,b6=false,b7=false,b8=false,b9=false;
    int a[]={50,24,72,16,93,91,21,128,12};
    int flag=0;
    MediaPlayer mp;
    public void fade1(View view)
    {
        mp = MediaPlayer.create(this, R.raw.click);
        mp.start();

        if(b1==false)
        {

            //Toast.makeText(Main2Activity.this,"Hi there",Toast.LENGTH_SHORT).show();
            ImageView imageView=(ImageView)view;
            imageView.setAlpha(0f);
            if(b==true){
                imageView.setImageResource(R.mipmap.bjp);a[1]=1;}
            else{
                imageView.setImageResource(R.mipmap.congresss);a[1]=0;}
            imageView.animate().alpha(1f).setDuration(500);
            if((a[0]==a[1]&&a[2]==a[1])||(a[3]==a[4]&&a[4]==a[5])||(a[6]==a[7]&&a[7]==a[8])||(a[0]==a[3]&&a[3]==a[6])||(a[1]==a[4]&&a[4]==a[7])||(a[2]==a[5]&&a[5]==a[8])||(a[0]==a[4]&&a[4]==a[8])||(a[2]==a[4]&&a[4]==a[6]))
            {
                if(b==true){
                    new AlertDialog.Builder(Main14Activity.this)
                            .setTitle("Holaaaaa..congo..!!!")

                            .setMessage(bj+" won the game")
                            .setCancelable(false)
                            .setPositiveButton("ok", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    finish();
                                    //  Intent intent=new Intent(Main4Activity.this,Main2Activity.class);
                                }
                            })
                            .setNegativeButton("cancel", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    finish();
                                    //  Intent intent=new Intent(Main4Activity.this,Main2Activity.class);
                                }
                            })
                            .show();
                    flag=1;}
                else{
                    new AlertDialog.Builder(Main14Activity.this)
                            .setTitle("Holaaaaa..congo..!!!")

                            .setMessage(con+" won the game")
                            .setCancelable(false)
                            .setPositiveButton("ok", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    finish();
                                    //  Intent intent=new Intent(Main4Activity.this,Main2Activity.class);
                                }
                            })
                            .setNegativeButton("cancel", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    finish();
                                    //  Intent intent=new Intent(Main4Activity.this,Main2Activity.class);
                                }
                            })
                            .show();flag=1;}




            }
            int i;
            for( i=0;i<9;i++)
            {
                if(a[i]!=0&&a[i]!=1)
                    break;
            }
            if(i==9&&flag==0)
                new AlertDialog.Builder(Main14Activity.this)
                        .setTitle("RESULTS:")

                        .setMessage("The game is draw..!")
                        .setCancelable(false)
                        .setPositiveButton("ok", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                finish();
                                //  Intent intent=new Intent(Main4Activity.this,Main2Activity.class);
                            }
                        })
                        .setNegativeButton("cancel", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                finish();
                                //  Intent intent=new Intent(Main4Activity.this,Main2Activity.class);
                            }
                        })
                        .show();


            b=!b;
            if(b==true)
                res.setText(bj+"'s turn");
            else
                res.setText(con+"'s turn");b1=!b1;


        }

    }
    public void fade2(View view)
    {  mp = MediaPlayer.create(this, R.raw.click);
        mp.start();
        if(b2==false){
            ImageView imageView=(ImageView)view;
            imageView.setAlpha(0f);
            //imageView.setImageResource(R.mipmap.bjp);
            if(b==true){
                imageView.setImageResource(R.mipmap.bjp);a[2]=1;}
            else{
                imageView.setImageResource(R.mipmap.congresss);a[2]=0;}
            imageView.animate().alpha(1f).setDuration(500);
            if((a[0]==a[1]&&a[2]==a[1])||(a[3]==a[4]&&a[4]==a[5])||(a[6]==a[7]&&a[7]==a[8])||(a[0]==a[3]&&a[3]==a[6])||(a[1]==a[4]&&a[4]==a[7])||(a[2]==a[5]&&a[5]==a[8])||(a[0]==a[4]&&a[4]==a[8])||(a[2]==a[4]&&a[4]==a[6]))
            {
                if(b==true){
                    new AlertDialog.Builder(Main14Activity.this)
                            .setTitle("Holaaaaa..congo..!!!")

                            .setMessage(bj+" won the game")
                            .setCancelable(false)
                            .setPositiveButton("ok", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    finish();
                                    //  Intent intent=new Intent(Main4Activity.this,Main2Activity.class);
                                }
                            })
                            .setNegativeButton("cancel", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    finish();
                                    //  Intent intent=new Intent(Main4Activity.this,Main2Activity.class);
                                }
                            })
                            .show();flag=1;}
                else{
                    new AlertDialog.Builder(Main14Activity.this)
                            .setTitle("Holaaaaa..congo..!!!")

                            .setMessage(con+" won the game")
                            .setCancelable(false)
                            .setPositiveButton("ok", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    finish();
                                    //  Intent intent=new Intent(Main4Activity.this,Main2Activity.class);
                                }
                            })
                            .setNegativeButton("cancel", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    finish();
                                    //  Intent intent=new Intent(Main4Activity.this,Main2Activity.class);
                                }
                            })
                            .show();flag=1;}


            }
            int i;
            for( i=0;i<9;i++)
            {
                if(a[i]!=0&&a[i]!=1)
                    break;
            }
            if(i==9&&flag==0)
                new AlertDialog.Builder(Main14Activity.this)
                        .setTitle("RESULTS:")

                        .setMessage("The game is draw..!")
                        .setCancelable(false)
                        .setPositiveButton("ok", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                finish();
                                //  Intent intent=new Intent(Main4Activity.this,Main2Activity.class);
                            }
                        })
                        .setNegativeButton("cancel", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                finish();
                                //  Intent intent=new Intent(Main4Activity.this,Main2Activity.class);
                            }
                        })
                        .show();
            b=!b;
            if(b==true)
                res.setText(bj+"'s turn");
            else
                res.setText(con+"'s turn");b2=!b2;}
    }
    public void fade3(View view)
    { mp = MediaPlayer.create(this, R.raw.click);
        mp.start();
        if(b3==false)
        {
            ImageView imageView=(ImageView)view;
            imageView.setAlpha(0f);
            //imageView.setImageResource(R.mipmap.bjp);
            if(b==true){
                imageView.setImageResource(R.mipmap.bjp);a[3]=1;}
            else{
                imageView.setImageResource(R.mipmap.congresss);a[3]=0;}
            imageView.animate().alpha(1f).setDuration(500);
            if((a[0]==a[1]&&a[2]==a[1])||(a[3]==a[4]&&a[4]==a[5])||(a[6]==a[7]&&a[7]==a[8])||(a[0]==a[3]&&a[3]==a[6])||(a[1]==a[4]&&a[4]==a[7])||(a[2]==a[5]&&a[5]==a[8])||(a[0]==a[4]&&a[4]==a[8])||(a[2]==a[4]&&a[4]==a[6]))
            {
                if(b==true){
                    new AlertDialog.Builder(Main14Activity.this)
                            .setTitle("Holaaaaa..congo..!!!")

                            .setMessage(bj+" won the game")
                            .setCancelable(false)
                            .setPositiveButton("ok", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    finish();
                                    //  Intent intent=new Intent(Main4Activity.this,Main2Activity.class);
                                }
                            })
                            .setNegativeButton("cancel", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    finish();
                                    //  Intent intent=new Intent(Main4Activity.this,Main2Activity.class);
                                }
                            })
                            .show();flag=1;}
                else{
                    new AlertDialog.Builder(Main14Activity.this)
                            .setTitle("Holaaaaa..congo..!!!")

                            .setMessage(con+" won the game")
                            .setCancelable(false)
                            .setPositiveButton("ok", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    finish();
                                    //  Intent intent=new Intent(Main4Activity.this,Main2Activity.class);
                                }
                            })
                            .setNegativeButton("cancel", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    finish();
                                    //  Intent intent=new Intent(Main4Activity.this,Main2Activity.class);
                                }
                            })
                            .show();flag=1;}



            }
            int i;
            for( i=0;i<9;i++)
            {
                if(a[i]!=0&&a[i]!=1)
                    break;
            }
            if(i==9&&flag==0)
                new AlertDialog.Builder(Main14Activity.this)
                        .setTitle("RESULTS:")

                        .setMessage("The game is draw..!")
                        .setCancelable(false)
                        .setPositiveButton("ok", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                finish();
                                //  Intent intent=new Intent(Main4Activity.this,Main2Activity.class);
                            }
                        })
                        .setNegativeButton("cancel", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                finish();
                                //  Intent intent=new Intent(Main4Activity.this,Main2Activity.class);
                            }
                        })
                        .show();
            b=!b;
            if(b==true)
                res.setText(bj+"'s turn");
            else
                res.setText(con+"'s turn");b3=!b3;}
    }
    public void fade4(View view)
    {
        mp = MediaPlayer.create(this, R.raw.click);
        mp.start();
        if(b4==false)
        {
            ImageView imageView=(ImageView)view;
            imageView.setAlpha(0f);
            //imageView.setImageResource(R.mipmap.bjp);
            if(b==true){
                imageView.setImageResource(R.mipmap.bjp);a[4]=1;}
            else{
                imageView.setImageResource(R.mipmap.congresss);a[4]=0;}
            imageView.animate().alpha(1f).setDuration(500);
            if((a[0]==a[1]&&a[2]==a[1])||(a[3]==a[4]&&a[4]==a[5])||(a[6]==a[7]&&a[7]==a[8])||(a[0]==a[3]&&a[3]==a[6])||(a[1]==a[4]&&a[4]==a[7])||(a[2]==a[5]&&a[5]==a[8])||(a[0]==a[4]&&a[4]==a[8])||(a[2]==a[4]&&a[4]==a[6]))
            {
                if(b==true){
                    new AlertDialog.Builder(Main14Activity.this)
                            .setTitle("Holaaaaa..congo..!!!")

                            .setMessage(bj+" won the game")
                            .setCancelable(false)
                            .setPositiveButton("ok", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    finish();
                                    //  Intent intent=new Intent(Main4Activity.this,Main2Activity.class);
                                }
                            })
                            .setNegativeButton("cancel", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    finish();
                                    //  Intent intent=new Intent(Main4Activity.this,Main2Activity.class);
                                }
                            })
                            .show();flag=1;}
                else{
                    new AlertDialog.Builder(Main14Activity.this)
                            .setTitle("Holaaaaa..congo..!!!")

                            .setMessage(con+" won the game")
                            .setCancelable(false)
                            .setPositiveButton("ok", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    finish();
                                    //  Intent intent=new Intent(Main4Activity.this,Main2Activity.class);
                                }
                            })
                            .setNegativeButton("cancel", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    finish();
                                    //  Intent intent=new Intent(Main4Activity.this,Main2Activity.class);
                                }
                            })
                            .show();flag=1;}



            }
            int i;
            for( i=0;i<9;i++)
            {
                if(a[i]!=0&&a[i]!=1)
                    break;
            }
            if(i==9&&flag==0)
                new AlertDialog.Builder(Main14Activity.this)
                        .setTitle("RESULTS:")

                        .setMessage("The game is draw..!")
                        .setCancelable(false)
                        .setPositiveButton("ok", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                finish();
                                //  Intent intent=new Intent(Main4Activity.this,Main2Activity.class);
                            }
                        })
                        .setNegativeButton("cancel", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                finish();
                                //  Intent intent=new Intent(Main4Activity.this,Main2Activity.class);
                            }
                        })
                        .show();
            b=!b;
            if(b==true)
                res.setText(bj+"'s turn");
            else
                res.setText(con+"'s turn");b4=!b4;}
    }
    public void fade5(View view)
    {
        mp = MediaPlayer.create(this, R.raw.click);
        mp.start();
        if(b5==false)
        {
            ImageView imageView=(ImageView)view;
            imageView.setAlpha(0f);
            // imageView.setImageResource(R.mipmap.bjp);
            if(b==true){
                imageView.setImageResource(R.mipmap.bjp);a[5]=1;}
            else{
                imageView.setImageResource(R.mipmap.congresss);a[5]=0;}
            imageView.animate().alpha(1f).setDuration(500);
            if((a[0]==a[1]&&a[2]==a[1])||(a[3]==a[4]&&a[4]==a[5])||(a[6]==a[7]&&a[7]==a[8])||(a[0]==a[3]&&a[3]==a[6])||(a[1]==a[4]&&a[4]==a[7])||(a[2]==a[5]&&a[5]==a[8])||(a[0]==a[4]&&a[4]==a[8])||(a[2]==a[4]&&a[4]==a[6]))
            {
                if(b==true)
                {
                    new AlertDialog.Builder(Main14Activity.this)
                            .setTitle("Holaaaaa congo..!!!!")

                            .setMessage(bj+"won the game")
                            .setCancelable(false)
                            .setPositiveButton("Play again", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    // finish();
                                    //  Intent intent=new Intent(Main4Activity.this,Main2Activity.class);

                                }
                            })
                            .setNegativeButton("EXIT", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    finish();

                                }
                            })
                            .show();flag=1;
                }
                else{
                    new AlertDialog.Builder(Main14Activity.this)
                            .setTitle("Holaaaaa..congo..!!!")

                            .setMessage(con+" won the game")
                            .setCancelable(false)
                            .setPositiveButton("ok", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    finish();
                                    //  Intent intent=new Intent(Main4Activity.this,Main2Activity.class);
                                }
                            })
                            .setNegativeButton("cancel", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    finish();
                                    //  Intent intent=new Intent(Main4Activity.this,Main2Activity.class);
                                }
                            })
                            .show();flag=1;}


            }
            int i;
            for( i=0;i<9;i++)
            {
                if(a[i]!=0&&a[i]!=1)
                    break;
            }
            if(i==9&&flag==0)
                new AlertDialog.Builder(Main14Activity.this)
                        .setTitle("RESULTS:")

                        .setMessage("The game is draw..!")
                        .setCancelable(false)
                        .setPositiveButton("ok", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                finish();
                                //  Intent intent=new Intent(Main4Activity.this,Main2Activity.class);
                            }
                        })
                        .setNegativeButton("cancel", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                finish();
                                //  Intent intent=new Intent(Main4Activity.this,Main2Activity.class);
                            }
                        })
                        .show();
            b=!b;
            if(b==true)
                res.setText(bj+"'s turn");
            else
                res.setText(con+"'s turn");b5=!b5;}
    }
    public void fade6(View view)
    {
        mp = MediaPlayer.create(this, R.raw.click);

        mp.start();



        if(b6==false)
        {
            ImageView imageView=(ImageView)view;
            imageView.setAlpha(0f);
            // imageView.setImageResource(R.mipmap.bjp);
            if(b==true){
                imageView.setImageResource(R.mipmap.bjp);a[6]=1;}
            else{
                imageView.setImageResource(R.mipmap.congresss);a[6]=0;}
            imageView.animate().alpha(1f).setDuration(500);
            if((a[0]==a[1]&&a[2]==a[1])||(a[3]==a[4]&&a[4]==a[5])||(a[6]==a[7]&&a[7]==a[8])||(a[0]==a[3]&&a[3]==a[6])||(a[1]==a[4]&&a[4]==a[7])||(a[2]==a[5]&&a[5]==a[8])||(a[0]==a[4]&&a[4]==a[8])||(a[2]==a[4]&&a[4]==a[6]))
            {
                if(b==true){
                    new AlertDialog.Builder(Main14Activity.this)
                            .setTitle("Holaaaaa..congo..!!!")

                            .setMessage(bj+" won the game")
                            .setCancelable(false)
                            .setPositiveButton("ok", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    finish();
                                    //  Intent intent=new Intent(Main4Activity.this,Main2Activity.class);
                                }
                            })
                            .setNegativeButton("cancel", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    finish();
                                    //  Intent intent=new Intent(Main4Activity.this,Main2Activity.class);
                                }
                            })
                            .show();flag=1;}
                else{
                    new AlertDialog.Builder(Main14Activity.this)
                            .setTitle("Holaaaaa..congo..!!!")

                            .setMessage(con+" won the game")
                            .setCancelable(false)
                            .setPositiveButton("ok", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    finish();
                                    //  Intent intent=new Intent(Main4Activity.this,Main2Activity.class);
                                }
                            })
                            .setNegativeButton("cancel", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    finish();
                                    //  Intent intent=new Intent(Main4Activity.this,Main2Activity.class);
                                }
                            })
                            .show();flag=1;}



            }
            int i;
            for( i=0;i<9;i++)
            {
                if(a[i]!=0&&a[i]!=1)
                    break;
            }
            if(i==9&&flag==0)
                new AlertDialog.Builder(Main14Activity.this)
                        .setTitle("RESULTS:")

                        .setMessage("The game is draw..!")
                        .setCancelable(false)
                        .setPositiveButton("ok", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                finish();
                                //  Intent intent=new Intent(Main4Activity.this,Main2Activity.class);
                            }
                        })
                        .setNegativeButton("cancel", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                finish();
                                //  Intent intent=new Intent(Main4Activity.this,Main2Activity.class);
                            }
                        })
                        .show();
            b=!b;
            if(b==true)
                res.setText(bj+"'s turn");
            else
                res.setText(con+"'s turn");b6=!b6;}
    }
    public void fade7(View view)
    {
        mp = MediaPlayer.create(this, R.raw.click);
        mp.start();
        if(b7==false){
            ImageView imageView=(ImageView)view;
            imageView.setAlpha(0f);
            //imageView.setImageResource(R.mipmap.bjp);
            if(b==true){
                imageView.setImageResource(R.mipmap.bjp);a[7]=1;}
            else{
                imageView.setImageResource(R.mipmap.congresss);a[7]=0;}
            imageView.animate().alpha(1f).setDuration(500);
            if((a[0]==a[1]&&a[2]==a[1])||(a[3]==a[4]&&a[4]==a[5])||(a[6]==a[7]&&a[7]==a[8])||(a[0]==a[3]&&a[3]==a[6])||(a[1]==a[4]&&a[4]==a[7])||(a[2]==a[5]&&a[5]==a[8])||(a[0]==a[4]&&a[4]==a[8])||(a[2]==a[4]&&a[4]==a[6]))
            {
                if(b==true){
                    new AlertDialog.Builder(Main14Activity.this)
                            .setTitle("Holaaaaa..congo..!!!")

                            .setMessage(bj+" won the game")
                            .setCancelable(false)
                            .setPositiveButton("ok", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    finish();
                                    //  Intent intent=new Intent(Main4Activity.this,Main2Activity.class);
                                }
                            })
                            .setNegativeButton("cancel", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    finish();
                                    //  Intent intent=new Intent(Main4Activity.this,Main2Activity.class);
                                }
                            })
                            .show();flag=1;}
                else{
                    new AlertDialog.Builder(Main14Activity.this)
                            .setTitle("Holaaaaa..congo..!!!")

                            .setMessage(con+" won the game")
                            .setCancelable(false)
                            .setPositiveButton("ok", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    finish();
                                    //  Intent intent=new Intent(Main4Activity.this,Main2Activity.class);
                                }
                            })
                            .setNegativeButton("cancel", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    finish();
                                    //  Intent intent=new Intent(Main4Activity.this,Main2Activity.class);
                                }
                            })
                            .show();flag=1;}



            }
            int i;
            for( i=0;i<9;i++)
            {
                if(a[i]!=0&&a[i]!=1)
                    break;
            }
            if(i==9&&flag==0)
                new AlertDialog.Builder(Main14Activity.this)
                        .setTitle("RESULTS:")

                        .setMessage("The game is draw..!")
                        .setCancelable(false)
                        .setPositiveButton("ok", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                finish();
                                //  Intent intent=new Intent(Main4Activity.this,Main2Activity.class);
                            }
                        })
                        .setNegativeButton("cancel", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                finish();
                                //  Intent intent=new Intent(Main4Activity.this,Main2Activity.class);
                            }
                        })
                        .show();
            b=!b;
            if(b==true)
                res.setText(bj+"'s turn");
            else
                res.setText(con+"'s turn");b7=!b7;}
    }
    public void fade8(View view)
    {   mp = MediaPlayer.create(this, R.raw.click);
        mp.start();
        if(b8==false)
        {
            ImageView imageView=(ImageView)view;
            imageView.setAlpha(0f);
            //imageView.setImageResource(R.mipmap.bjp);
            if(b==true){
                imageView.setImageResource(R.mipmap.bjp);a[8]=1;}
            else{
                imageView.setImageResource(R.mipmap.congresss);a[8]=0;}

            imageView.animate().alpha(1f).setDuration(500);
            if((a[0]==a[1]&&a[2]==a[1])||(a[3]==a[4]&&a[4]==a[5])||(a[6]==a[7]&&a[7]==a[8])||(a[0]==a[3]&&a[3]==a[6])||(a[1]==a[4]&&a[4]==a[7])||(a[2]==a[5]&&a[5]==a[8])||(a[0]==a[4]&&a[4]==a[8])||(a[2]==a[4]&&a[4]==a[6]))
            {
                if(b==true){
                    new AlertDialog.Builder(Main14Activity.this)
                            .setTitle("Holaaaaa..congo..!!!")

                            .setMessage(bj+" won the game")
                            .setCancelable(false)
                            .setPositiveButton("ok", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    finish();
                                    //  Intent intent=new Intent(Main4Activity.this,Main2Activity.class);
                                }
                            })
                            .setNegativeButton("cancel", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    finish();
                                    //  Intent intent=new Intent(Main4Activity.this,Main2Activity.class);
                                }
                            })
                            .show();flag=1;}
                else{
                    new AlertDialog.Builder(Main14Activity.this)
                            .setTitle("Holaaaaa..congo..!!!")

                            .setMessage(con+" won the game")
                            .setCancelable(false)
                            .setPositiveButton("ok", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    finish();
                                    //  Intent intent=new Intent(Main4Activity.this,Main2Activity.class);
                                }
                            })
                            .setNegativeButton("cancel", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    finish();
                                    //  Intent intent=new Intent(Main4Activity.this,Main2Activity.class);
                                }
                            })
                            .show();flag=1;}



            }
            int i;
            for( i=0;i<9;i++)
            {
                if(a[i]!=0&&a[i]!=1)
                    break;
            }
            if(i==9&&flag==0)
                new AlertDialog.Builder(Main14Activity.this)
                        .setTitle("RESULTS:")

                        .setMessage("The game is draw..!")
                        .setCancelable(false)
                        .setPositiveButton("ok", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                finish();
                                //  Intent intent=new Intent(Main4Activity.this,Main2Activity.class);
                            }
                        })
                        .setNegativeButton("cancel", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                finish();
                                //  Intent intent=new Intent(Main4Activity.this,Main2Activity.class);
                            }
                        })
                        .show();
            b=!b;
            if(b==true)
                res.setText(bj+"'s turn");
            else
                res.setText(con+"'s turn");b8=!b8;}
    }
    public void fade0(View view)
    {
        mp = MediaPlayer.create(this, R.raw.click);
        mp.start();
        if(b9==false){
            ImageView imageView=(ImageView)view;
            imageView.setAlpha(0f);
            // imageView.setImageResource(R.mipmap.bjp);
            if(b==true){
                imageView.setImageResource(R.mipmap.bjp);a[0]=1;}
            else{
                imageView.setImageResource(R.mipmap.congresss);a[0]=0;}
            imageView.animate().alpha(1f).setDuration(500);
            if((a[0]==a[1]&&a[2]==a[1])||(a[3]==a[4]&&a[4]==a[5])||(a[6]==a[7]&&a[7]==a[8])||(a[0]==a[3]&&a[3]==a[6])||(a[1]==a[4]&&a[4]==a[7])||(a[2]==a[5]&&a[5]==a[8])||(a[0]==a[4]&&a[4]==a[8])||(a[2]==a[4]&&a[4]==a[6]))
            {
                if(b==true){
                    new AlertDialog.Builder(Main14Activity.this)
                            .setTitle("Holaaaaa..congo..!!!")

                            .setMessage(bj+" won the game")
                            .setCancelable(false)
                            .setPositiveButton("ok", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    finish();
                                    //  Intent intent=new Intent(Main4Activity.this,Main2Activity.class);
                                }
                            })
                            .setNegativeButton("cancel", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    finish();
                                    //  Intent intent=new Intent(Main4Activity.this,Main2Activity.class);
                                }
                            })
                            .show();flag=1;}
                else{
                    new AlertDialog.Builder(Main14Activity.this)
                            .setTitle("Holaaaaa..congo..!!!")

                            .setMessage(con+" won the game")
                            .setCancelable(false)
                            .setPositiveButton("ok", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    finish();
                                    //  Intent intent=new Intent(Main4Activity.this,Main2Activity.class);
                                }
                            })
                            .setNegativeButton("cancel", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    finish();
                                    //  Intent intent=new Intent(Main4Activity.this,Main2Activity.class);
                                }
                            })
                            .show();flag=1;}



            }
            int i;
            for( i=0;i<9;i++)
            {
                if(a[i]!=0&&a[i]!=1)
                    break;
            }
            if(i==9&&flag==0)
                new AlertDialog.Builder(Main14Activity.this)
                        .setTitle("RESULTS:")

                        .setMessage("The game is draw..!")
                        .setCancelable(false)
                        .setPositiveButton("ok", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                finish();
                                //  Intent intent=new Intent(Main4Activity.this,Main2Activity.class);
                            }
                        })
                        .setNegativeButton("cancel", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                finish();
                                //  Intent intent=new Intent(Main4Activity.this,Main2Activity.class);
                            }
                        })
                        .show();

            b=!b;
            if(b==true)
                res.setText(bj+"'s turn");
            else
                res.setText(con+"'s turn");b9=!b9;}
    }




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main14);
        Intent intent=getIntent();
        to=intent.getIntExtra("toss",0);
        con=intent.getStringExtra("congress");
        bj=intent.getStringExtra("bjp");
        res=findViewById(R.id.turn);
        if(to==0) {
            b = false;
            res.setText(con+"'s turn");
        }
        else {
            b = true;
            res.setText(bj+"'s turn");
        }

    }
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            exitByBackKey();

            //moveTaskToBack(false);

            return true;
        }
        return super.onKeyDown(keyCode, event);
    }

    protected void exitByBackKey() {

        AlertDialog alertbox = new AlertDialog.Builder(this)
                .setMessage("Do you want to Quit the game?")
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

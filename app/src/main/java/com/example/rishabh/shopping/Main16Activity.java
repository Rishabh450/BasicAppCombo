package com.example.rishabh.shopping;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class Main16Activity extends AppCompatActivity {

        Button play,clr,tos;
    int i=0,j=0,tmp=0,n=0,cou=0,countturn=0;
    TextView c,d,tu;String tossing,colo; boolean bol=false;
    String turna;int t=0;Boolean one=true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main16);

        c=findViewById(R.id.asscolor);
        d=findViewById(R.id.pikacolor);
        tos=findViewById(R.id.toss);
        i=c.getCurrentTextColor();
        j=d.getCurrentTextColor();
        tu=findViewById(R.id.turned);





        play=findViewById(R.id.pla);
        clr=findViewById(R.id.changecolor);
        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                turna = tu.getText().toString();
                if (turna.equals("")) {
                    new AlertDialog.Builder(Main16Activity.this)
                            .setTitle("Alert....!!!!")
                            .setMessage("PLEASE ENTER THE NUMBER OF TURNS")
                            .setCancelable(false)
                            .setPositiveButton("ok", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    // Whatever...
                                }
                            }).show();


                }
                else {
                    t = Integer.parseInt(turna);
                }


                if (t == 0) {
                    new AlertDialog.Builder(Main16Activity.this)
                            .setTitle("Alert...!!!!")
                            .setMessage("INVALID ENTRY OF TURNS")
                            .setCancelable(false)
                            .setPositiveButton("ok", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    // Whatever...
                                }
                            }).show();


                }
                else
                {
                    tossing = Integer.toString(n);
                    colo = Boolean.toString(bol);

                    Intent intent = new Intent(Main16Activity.this, Main17Activity.class);
                    Bundle bundle = new Bundle();

                    bundle.putString("changecol", colo);
                    bundle.putString("tos", tossing);
                    intent.putExtra("noturn", t);

                    intent.putExtras(bundle);

                    startActivity(intent);


                }
            }
        });
        clr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                bol=!bol;
                tmp=i;
                i=j;
                j=tmp;
                d.setTextColor(j);
                c.setTextColor(i);

               /* Intent intent = new Intent(Main3Activity.this,Main3Activity.class);
                intent.putExtra("colswap","c,d");
                startActivity(intent);*/



            }
        });
        tos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(one==true) {


                    cou++;
                    Random rand = new Random();
                    n = rand.nextInt(2);
                    if (n == 0) {
                        one = !one;
                        new AlertDialog.Builder(Main16Activity.this)
                                .setTitle("TOSS RESULTS..!!!!")

                                .setMessage("ASH WON THE TOSS")
                                .setCancelable(false)
                                .setPositiveButton("ok", new DialogInterface.OnClickListener() {
                                    @Override
                                    public void onClick(DialogInterface dialog, int which) {
                                        // finish();
                                        //  Intent intent=new Intent(Main4Activity.this,Main2Activity.class);
                                    }
                                }).show();
                    } else {
                        one = !one;
                        new AlertDialog.Builder(Main16Activity.this)
                                .setTitle("TOSS RESULTS..!!!!")

                                .setMessage("PIKACHU WON THE TOSS")
                                .setCancelable(false)
                                .setPositiveButton("ok", new DialogInterface.OnClickListener() {
                                    @Override
                                    public void onClick(DialogInterface dialog, int which) {
                                        // finish();
                                        //  Intent intent=new Intent(Main4Activity.this,Main2Activity.class);
                                    }
                                }).show();

                    }
                }
                else
                {
                    new AlertDialog.Builder(Main16Activity.this)
                            .setTitle("SORRY...!!!")

                            .setMessage("TOSS CAN BE DONE ONLY ONCE")
                            .setCancelable(false)
                            .setPositiveButton("ok", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    // finish();
                                    //  Intent intent=new Intent(Main4Activity.this,Main2Activity.class);
                                }
                            }).show();

                }







            }

        });






    }


}

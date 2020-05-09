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

public class Main17Activity extends AppCompatActivity {


    TextView e,l,resu,score; Button a,b,c,d,r,nxt;String stufff,stuff,stufff2,stuff2,lead1,tura;
    int pik=0,as=0,ct=0,lead;int cnt=0;
    Button ash,pika;
    int turna1;
    int asc[],pic[];
    int sumpik=0,sumash=0;
    int diff=0;
    int tur=4;
    int r1=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main17);
        Bundle bundle = getIntent().getExtras();
        stuff = bundle.getString("changecol");
        stufff = bundle.getString("tos");
        Intent mIntent = getIntent();

        tur = mIntent.getIntExtra("noturn", 0);
        // turna1=Integer.parseInt(tura);
        nxt=findViewById(R.id.next);
        resu=findViewById(R.id.results);
        asc=new int[tur];
        pic=new int[tur];








        e=findViewById(R.id.turn);
        l=findViewById(R.id.leader);
        if(stufff.equals("0"))
            e.setText("ASH's turn");
        else
            e.setText("PIKACHU's turn");
        a=findViewById(R.id.but_one);
        b=findViewById(R.id.but_two);
        c=findViewById(R.id.but_three);
        score=findViewById(R.id.scores);

        d=findViewById(R.id.but_four);
        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(cnt<=2)
                    cnt++;
                if(cnt==2)
                    l.setText("Press reveal to know the scores");
                if(cnt<=2) {

                    if (stuff.equals("false")) {
                        if (stufff.equals("0")) {
                            ash = a;

                            a.setBackgroundResource(R.color.blue);

                        } else {
                            pika = a;
                            a.setBackgroundResource(R.color.yellow);
                        }
                    } else {
                        if (stufff.equals("0")) {
                            ash = a;
                            a.setBackgroundResource(R.color.yellow);
                        } else {
                            pika = a;
                            a.setBackgroundResource(R.color.blue);
                        }

                    }
                    if (stufff.equals("0")) {
                        e.setText("PIKACHU'S turn");
                        stufff = "1";
                    } else {
                        e.setText("ASH'S turn");
                        stufff = "0";
                    }
                }



            }
        });
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(cnt<=2)
                    cnt++;
                if(cnt==2)
                    l.setText("Press reveal to know the scores");
                if (cnt <= 2) {

                    if (stuff.equals("false")) {
                        if (stufff.equals("0"))
                            b.setBackgroundResource(R.color.blue);
                        else
                            b.setBackgroundResource(R.color.yellow);
                    } else {
                        if (stufff.equals("0"))
                            b.setBackgroundResource(R.color.yellow);
                        else
                            b.setBackgroundResource(R.color.blue);
                    }
                    if (stufff.equals("0")) {
                        ash = b;
                        e.setText("PIKACHU'S turn");
                        stufff = "1";
                    } else {
                        pika = b;
                        e.setText("ASH'S turn");
                        stufff = "0";
                    }
                }
            }

        });
        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(cnt<=2)
                    cnt++;
                if(cnt==2)
                    l.setText("Press reveal to know the scores");
                if (cnt <= 2) {

                    if (stuff.equals("false")) {
                        if (stufff.equals("0"))
                            c.setBackgroundResource(R.color.blue);
                        else
                            c.setBackgroundResource(R.color.yellow);
                    } else {
                        if (stufff.equals("0"))
                            c.setBackgroundResource(R.color.yellow);
                        else
                            c.setBackgroundResource(R.color.blue);
                    }
                    if (stufff.equals("0")) {
                        ash = c;
                        e.setText("PIKACHU'S turn");
                        stufff = "1";
                    } else {
                        pika = c;
                        e.setText("ASH'S turn");
                        stufff = "0";
                    }
                }
            }
        });
        d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(cnt<=2)
                    cnt++;
                if(cnt==2)
                    l.setText("Press reveal to know the scores");
                if (cnt <= 2) {

                    if (stuff.equals("false")) {
                        if (stufff.equals("0"))
                            d.setBackgroundResource(R.color.blue);
                        else
                            d.setBackgroundResource(R.color.yellow);
                    } else {
                        if (stufff.equals("0"))
                            d.setBackgroundResource(R.color.yellow);
                        else
                            d.setBackgroundResource(R.color.blue);
                    }
                    if (stufff.equals("0")) {
                        ash = d;
                        e.setText("PIKACHU'S turn");
                        stufff = "1";
                    } else {
                        pika = d;
                        e.setText("ASH'S turn");
                        stufff = "0";
                    }
                }
            }
        });
        r=findViewById(R.id.reveal);
        r.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (cnt >=2&&r1==0) {
                    Random r = new Random();
                    a.setText(Integer.toString(r.nextInt(30) + 1));
                    b.setText(Integer.toString(r.nextInt(30) + 1));
                    c.setText(Integer.toString(r.nextInt(30) + 1));
                    d.setText(Integer.toString(r.nextInt(30) + 1));
                    pik = Integer.parseInt(pika.getText().toString());
                    as = Integer.parseInt(ash.getText().toString());
                    asc[ct] = as;
                    pic[ct] = pik;
                    int sasc = 0, spik = 0;
                    for (int k = 0; k <= ct; k++) {
                        sasc = sasc + asc[k];
                        spik = spik + pic[k];
                    }
                    if (pik > as) {
                        lead = pik - as;
                        lead1 = Integer.toString(lead);
                        //l.setText("PIKACHU is leading by ".concat(lead1));
                    } else {
                        lead = as - pik;
                        lead1 = Integer.toString(lead);
                        //  l.setText("ASH is leading by ".concat(lead1));
                    }
                    l.setText("Now press NEXT to go to next turn");
                    score.setText("           ASH:" + sasc + "  ...........  " + "PIKACHU:" + spik);
                    r1++;


                }
            }
        });
        nxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cnt >=2&&r1==1) {
                    r1=0;
                    cnt=0;

                    ct++;
                    if (ct == tur) {
                        for (int i = 0; i < tur; i++) {
                            sumpik = sumpik + pic[i];
                            sumash = sumash + asc[i];


                        }
                        diff = sumpik - sumash;
                        if (diff > 0) {
                            resu.setText("PIKACHU WON.......");
                            new AlertDialog.Builder(Main17Activity.this)
                                    .setTitle(".......BATTLE RESULTS.......")
                                    .setMessage("PIKACHU WON ")
                                    .setCancelable(false)
                                    .setPositiveButton("ok", new DialogInterface.OnClickListener() {
                                        @Override
                                        public void onClick(DialogInterface dialog, int which) {
                                            finish();

                                        }
                                    }).show();


                        } else {
                            resu.setText("ASH WON........!");
                            new AlertDialog.Builder(Main17Activity.this)
                                    .setTitle(".......BATTLE RESULTS.......")
                                    .setMessage("ASH WON")
                                    .setCancelable(false)
                                    .setPositiveButton("ok", new DialogInterface.OnClickListener() {
                                        @Override
                                        public void onClick(DialogInterface dialog, int which) {

                                            finish();
                                        }
                                    }).show();


                        }
                    } else {
                        l.setText("");
                        a.setBackgroundResource(R.color.gray);
                        b.setBackgroundResource(R.color.gray);
                        c.setBackgroundResource(R.color.gray);
                        d.setBackgroundResource(R.color.gray);
                        a.setText("");
                        b.setText("");
                        c.setText("");
                        d.setText("");


                    }
                }
            }
        });
     /*   nxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ct++;
                if(ct=turna)


            }
        });*/







     /*  Intent bundle= getIntent();
        String s= bundle.getStringExtra("tossresults");
        int res=Integer.parseInt(s);
     String col=bundle.getStringExtra("ashcolor");

     /*   if (res==0)
            e.setText("ASH");
        else
            e.setText("PIKACHU");

        Log.e("yty",s);*/
    }
}

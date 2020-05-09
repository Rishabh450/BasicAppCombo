package com.example.rishabh.shopping;

import android.content.DialogInterface;
import android.speech.tts.TextToSpeech;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;

import java.util.Locale;

public class Main4Activity extends AppCompatActivity implements View.OnClickListener{


    Button plus,minus,multiply,divide,clear,equals,bc,sin,cos,tan,log,ln,power,e,pi,inverse;
    EditText editText;Double op1,op2; int pid;
    TextToSpeech t1;
    public void speak(View view)
    {

        t1.speak("the answer is "+editText.getText().toString(),TextToSpeech.QUEUE_FLUSH,null);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        init();
        plus.setOnClickListener(Main4Activity.this);
        minus.setOnClickListener(Main4Activity.this);
        multiply.setOnClickListener(Main4Activity.this);
        divide.setOnClickListener(Main4Activity.this);
        clear.setOnClickListener(Main4Activity.this);
        equals.setOnClickListener(Main4Activity.this);
        cos.setOnClickListener(Main4Activity.this);
        sin.setOnClickListener(Main4Activity.this);
        tan.setOnClickListener(Main4Activity.this);
        log.setOnClickListener(Main4Activity.this);
        ln.setOnClickListener(Main4Activity.this);
        power.setOnClickListener(Main4Activity.this);
        e.setOnClickListener(Main4Activity.this);
        inverse.setOnClickListener(Main4Activity.this);
        pi.setOnClickListener(Main4Activity.this);
        t1= new TextToSpeech(this, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                t1.setLanguage(Locale.ENGLISH);
                t1.setSpeechRate(0.5f);
            }


        });





    }

    void init()
    {
        plus=findViewById(R.id.btn_plus);
        minus=findViewById(R.id.btn_minus);
        multiply=findViewById(R.id.btn_mul);
        divide=findViewById(R.id.btn_div);
        clear=findViewById(R.id.btn_clr);
        equals=findViewById(R.id.btn_equal);
        editText=findViewById(R.id.edit_text);
        log=findViewById(R.id.log);
        ln=findViewById(R.id.ln);
        cos=findViewById(R.id.cos);
        sin=findViewById(R.id.sin);
        tan=findViewById(R.id.tan);
        power=findViewById(R.id.power);
        inverse=findViewById(R.id.inverse);
        e=findViewById(R.id.e);
        pi=findViewById(R.id.pi);



    }

    @Override
    public void onClick(View view) {
        int id=view.getId();
        Double ans=0.0;
        if(id==R.id.e)
            editText.setText(String.valueOf(Math.E));
        if(id==R.id.pi)
            editText.setText(String.valueOf(Math.PI));


        if(editText.getText().toString().compareTo("")!=0){
            if(id==R.id.sin)
            {
                op1=new Double(editText.getText().toString())*Math.PI/180;
                ans=Math.sin(op1);
                editText.setText(String.valueOf(ans));
            }
            if(id==R.id.cos)
            {
                op1=new Double(editText.getText().toString())*Math.PI/180;
                ans=Math.cos(op1);
                editText.setText(String.valueOf(ans));
            }
            if(id==R.id.tan)
            {
                op1=new Double(editText.getText().toString())*Math.PI/180;
                ans=Math.tan(op1);
                editText.setText(String.valueOf(ans));
            }
            if(id==R.id.log)
            {
                op1=new Double(editText.getText().toString());
                ans=Math.log10(op1);
                editText.setText(String.valueOf(ans));
            }
            if(id==R.id.ln)
            {
                op1=new Double(editText.getText().toString());
                ans=Math.log(op1);
                editText.setText(String.valueOf(ans));
            }
            if(id==R.id.inverse)
            {
                op1=new Double(editText.getText().toString());
                ans=1.0/op1;
                editText.setText(String.valueOf(ans));
            }





            if(id==R.id.btn_plus||id==R.id.btn_minus||id==R.id.btn_mul||id==R.id.btn_div||id==R.id.power)
            {op1=new Double(editText.getText().toString());editText.setText("");pid=id;}



            else if(id==R.id.btn_clr){ op1=null;op2=null;editText.setText("");}
            else if(id==R.id.btn_equal){ if(op1 !=null)
                op2=new Double(editText.getText().toString());


                if(pid==R.id.btn_plus)
                    ans=op1+op2;
                if(pid==R.id.btn_minus)
                    ans=op1+op2;
                if(pid==R.id.btn_mul)
                    ans=op1*op2;
                if(pid==R.id.btn_div)
                    ans=op1/op2;
                if(pid==R.id.power)
                    ans=Math.pow(op1,op2);






                editText.setText(String.valueOf(ans));

            }




        }



    }



}

package com.example.rishabh.shopping;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class Main12Activity extends AppCompatActivity {
    Random rand= new Random();
    int n=rand.nextInt(15)+1;

    static int p=100;


    public void ver1(View view) {
        EditText my = (EditText) findViewById(R.id.editText2);
        int m = Integer.parseInt(my.getText().toString());
        my.setText("");
        if (m > 15||m<1) {

            Toast.makeText(Main12Activity.this, "Please follow the given range", Toast.LENGTH_SHORT).show();
            my.setText("");
            p-=10;
        }

        else {


            if (m == n) {
                new AlertDialog.Builder(Main12Activity.this)
                        .setTitle("CORRECT GUESS...!!!!")

                        .setMessage("Your score is: " + p)
                        .setCancelable(false)
                        .setPositiveButton("ok", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                finish();
                            }
                        })


                        .show();


            } else if (m > n) {
                Toast.makeText(Main12Activity.this, "Try lower", Toast.LENGTH_SHORT).show();
                p -= 10;
            } else if (m < n) {
                Toast.makeText(Main12Activity.this, "Try higher", Toast.LENGTH_SHORT).show();
                p -= 10;
            }
        }
    }




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main12);
    }
}

package com.example.rishabh.shopping;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

public class Main10Activity extends AppCompatActivity {

    public void easy(View view)
    {

        Intent intent = new Intent(Main10Activity.this,Main11Activity.class);
        startActivity(intent);
    }
    public void medium(View view)
    {

        Intent intent = new Intent(Main10Activity.this,Main12Activity.class);
        startActivity(intent);
    }
    public void difficult(View view)
    {

        Intent intent = new Intent(Main10Activity.this,Main5Activity.class);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main10);


    }

}

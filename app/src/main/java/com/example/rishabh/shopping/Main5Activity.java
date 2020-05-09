package com.example.rishabh.shopping;

import android.content.Intent;
import android.graphics.Bitmap;
import android.media.MediaPlayer;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;

public class Main5Activity extends AppCompatActivity {
    ImageView w1;MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main5);
        w1 = findViewById(R.id.img);

    }

    public void bu(View view) {
        mp = MediaPlayer.create(this, R.raw.clic);
        mp.start();

        Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        if(intent.resolveActivity(getPackageManager())!=null)
        startActivityForResult(intent, 0);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        Bitmap b = (Bitmap) data.getExtras().get("data");
        w1.setImageBitmap(b);
    }
}

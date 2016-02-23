package com.example.solution_color;


import android.content.Intent;
import android.graphics.Bitmap;
import android.media.Image;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

import com.library.bitmap_utilities.BitMap_Helpers;
import com.library.bitmap_utilities.ManipBitmap;

public class MainActivity extends AppCompatActivity  {

    private ImageView camera, background;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        camera = (ImageView) findViewById(R.id.camera);
        background = (ImageView) findViewById(R.id.background);


        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_settings:
                Intent myIntent = new Intent(this, SettingsActivity.class);
                startActivity(myIntent);
                break;
            case R.id.action_share:
                //do share stuff
                break;
            case R.id.colorize:
                //do colorize stuff

                break;
            case R.id.black_and_white:
                Bitmap currentBg = BitMap_Helpers.copyBitmap(background.getDrawable());


                break;
            case R.id.restore:
                background.setImageResource(R.drawable.gutters);
                background.setScaleType(ImageView.ScaleType.FIT_CENTER);
                background.setScaleType(ImageView.ScaleType.FIT_XY);


                break;
            default:
                break;
        }
        return true;
    }

    public void takePhoto(View view) {

    }

    private void changePhoto(View view, Bitmap photo) {
        background.setImageBitmap(photo);
    }
}


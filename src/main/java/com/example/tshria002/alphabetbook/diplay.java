package com.example.tshria002.alphabetbook;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.io.File;

public class diplay extends AppCompatActivity {
    String arr[] = {"/Slide01.gif", "/Slide02.gif", "/Slide03.gif", "/Slide04.gif", "/Slide05.gif", "/Slide06.gif", "/Slide07.gif", "/Slide08.gif", "/Slide09.gif",
            "/Slide10.gif", "/Slide11.gif", "/Slide12.gif",
            "/Slide13.gif", "/Slide14.gif", "/Slide15.gif", "/Slide16.gif", "/Slide17.gif", "/Slide18.gif", "/Slide19.gif", "/Slide20.gif", "/Slide21.gif",
            "/Slide22.gif", "/Slide23.gif", "/Slide24.gif", "/Slide25.gif",
            "/Slide26.gif"};
    Bitmap map[] = new Bitmap[26];
    ImageView image;
    int s;
    int val;
    public static final String EXTRA_MESSAGE = "BUTTON";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diplay);
        s = getIntent().getIntExtra(EXTRA_MESSAGE, 0);
        synchronized (this) {
            val = s;
        }


        loadIamge();
        image = (ImageView) findViewById(R.id.imageView);


        image.setImageDrawable(new BitmapDrawable(getResources(), map[s]));
        button_init();
    }

    public void loadIamge() {

        File img;
        Bitmap bitmap;
        for (int i = 0; i < 26; i++) {
            img = new File(getExternalFilesDirs(Environment.DIRECTORY_DCIM)[1].getAbsolutePath() + arr[i]);

            bitmap = BitmapFactory.decodeFile(img.getAbsolutePath());
            map[i] = bitmap;

        }
    }

    public void button_init() {
        findViewById(R.id.LAST).setOnClickListener(clicked);
        findViewById(R.id.FIRST).setOnClickListener(clicked);
        findViewById(R.id.NEXT).setOnClickListener(clicked);
        findViewById(R.id.PREV).setOnClickListener(clicked);
        findViewById(R.id.Over).setOnClickListener(clicked);

    }

    private View.OnClickListener clicked = new View.OnClickListener() {

        public void onClick(View v) {


            if (v.getId() == R.id.LAST) {
                set(25);


                image.setImageDrawable(new BitmapDrawable(getResources(), map[25]));
                return;


            }

            if (v.getId() == R.id.FIRST) {
                set(0);

                image.setImageDrawable(new BitmapDrawable(getResources(), map[0]));
                return;

            }

            if (v.getId() == R.id.PREV) {
                dec();
                if (read() < 0) {
                    set(25);
                    image.setImageDrawable(new BitmapDrawable(getResources(), map[25]));
                    set(25);
                    return;
                } else {
                    image.setImageDrawable(new BitmapDrawable(getResources(), map[read()]));
                    return;
                }


            }
            if (v.getId() == R.id.NEXT) {
                inc();
                if (read() > 25) {
                    set(0);
                    image.setImageDrawable(new BitmapDrawable(getResources(), map[0]));
                    return;
                } else {
                    image.setImageDrawable(new BitmapDrawable(getResources(), map[read()]));
                    return;
                }

            }


            if (v.getId() == R.id.Over) {
                new Thread() {
                    public void run() {
                        Intent i = new Intent(diplay.this, OverviewActivity.class);
                        i.putExtra(EXTRA_MESSAGE, 0);

                        startActivity(i);
                    }
                }.start();

            }


        }
    };

    public synchronized int read() {
        return val;
    }

    public synchronized int inc() {
        return val++;
    }

    public synchronized int dec() {
        return val--;
    }

    public synchronized void set(int n) {
        val = n;
    }


    private View.OnClickListener prev = new View.OnClickListener() {

        public void onClick(View v) {
            if (read() < 0) {
                set(25);
                image.setImageDrawable(new BitmapDrawable(getResources(), map[25]));
                set(25);
                return;
            } else {
                image.setImageDrawable(new BitmapDrawable(getResources(), map[dec()]));
                return;
            }

        }
    };

}

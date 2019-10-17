package com.example.tshria002.alphabetbook;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.io.File;

import static com.example.tshria002.alphabetbook.R.id.B;


public class OverviewActivity extends AppCompatActivity {
int num= 0;
    public static final String EXTRA_MESSAGE = "BUTTON";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_overview);
        button_init();

    }

    public void button_init(){
        findViewById(R.id.A).setOnClickListener(clicked);
        findViewById(R.id.B).setOnClickListener(clicked);
        findViewById(R.id.C).setOnClickListener(clicked);
        findViewById(R.id.D).setOnClickListener(clicked);
        findViewById(R.id.E).setOnClickListener(clicked);
        findViewById(R.id.F).setOnClickListener(clicked);
        findViewById(R.id.G).setOnClickListener(clicked);
        findViewById(R.id.H).setOnClickListener(clicked);
        findViewById(R.id.I).setOnClickListener(clicked);
        findViewById(R.id.J).setOnClickListener(clicked);
        findViewById(R.id.K).setOnClickListener(clicked);
        findViewById(R.id.L).setOnClickListener(clicked);
        findViewById(R.id.M).setOnClickListener(clicked);
        findViewById(R.id.N).setOnClickListener(clicked);
        findViewById(R.id.O).setOnClickListener(clicked);
        findViewById(R.id.P).setOnClickListener(clicked);
        findViewById(R.id.Q).setOnClickListener(clicked);
        findViewById(R.id.R).setOnClickListener(clicked);
        findViewById(R.id.S).setOnClickListener(clicked);
        findViewById(R.id.T).setOnClickListener(clicked);
        findViewById(R.id.U).setOnClickListener(clicked);
        findViewById(R.id.V).setOnClickListener(clicked);
        findViewById(R.id.W).setOnClickListener(clicked);
        findViewById(R.id.X).setOnClickListener(clicked);
        findViewById(R.id.Y).setOnClickListener(clicked);
        findViewById(R.id.Z).setOnClickListener(clicked);



    }

    private View.OnClickListener clicked = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if (v.getId()== R.id.A) {
                Intent i = new Intent(OverviewActivity.this, diplay.class);
                i.putExtra(EXTRA_MESSAGE,0);

                startActivity(i);}

            if (v.getId()== R.id.B) {
                   Intent i = new Intent(OverviewActivity.this, diplay.class);
                i.putExtra(EXTRA_MESSAGE,1);
                    startActivity(i);}

            if (v.getId()== R.id.C) {
                Intent i = new Intent(OverviewActivity.this, diplay.class);
                i.putExtra(EXTRA_MESSAGE,2);
                startActivity(i);}

            if (v.getId()== R.id.D) {
                Intent i = new Intent(OverviewActivity.this, diplay.class);
                i.putExtra(EXTRA_MESSAGE,3);
                startActivity(i);}

           if (v.getId()== R.id.E) {
                Intent i = new Intent(OverviewActivity.this, diplay.class);
                i.putExtra(EXTRA_MESSAGE,4);
                startActivity(i);}

           if (v.getId()== R.id.F) {
                Intent i = new Intent(OverviewActivity.this, diplay.class);
                i.putExtra(EXTRA_MESSAGE,5);
                startActivity(i);}

            if (v.getId()== R.id.G) {
                Intent i = new Intent(OverviewActivity.this, diplay.class);
                i.putExtra(EXTRA_MESSAGE,6);
                startActivity(i);}

            if (v.getId()== R.id.H) {
                Intent i = new Intent(OverviewActivity.this, diplay.class);
                i.putExtra(EXTRA_MESSAGE,7);
                startActivity(i);}

            if (v.getId()== R.id.I) {
                Intent i = new Intent(OverviewActivity.this, diplay.class);
                i.putExtra(EXTRA_MESSAGE,8);
                startActivity(i);}

            if (v.getId()== R.id.J) {
                Intent i = new Intent(OverviewActivity.this, diplay.class);
                i.putExtra(EXTRA_MESSAGE,9);
                startActivity(i);}

            if (v.getId()== R.id.K) {
                Intent i = new Intent(OverviewActivity.this, diplay.class);
                i.putExtra(EXTRA_MESSAGE,10);
                startActivity(i);}

            if (v.getId()== R.id.L) {
                Intent i = new Intent(OverviewActivity.this, diplay.class);
                i.putExtra(EXTRA_MESSAGE,11);
                startActivity(i);}

            if (v.getId()== R.id.M) {
                Intent i = new Intent(OverviewActivity.this, diplay.class);
                i.putExtra(EXTRA_MESSAGE,12);
                startActivity(i);}

            if (v.getId()== R.id.N) {
                Intent i = new Intent(OverviewActivity.this, diplay.class);
                i.putExtra(EXTRA_MESSAGE,13);
                startActivity(i);}

            if (v.getId()== R.id.O) {
                Intent i = new Intent(OverviewActivity.this, diplay.class);
                i.putExtra(EXTRA_MESSAGE,14);
                startActivity(i);}


            if (v.getId()== R.id.P) {
                Intent i = new Intent(OverviewActivity.this, diplay.class);
                i.putExtra(EXTRA_MESSAGE,15);
                startActivity(i);}


            if (v.getId()== R.id.Q) {
                Intent i = new Intent(OverviewActivity.this, diplay.class);
                i.putExtra(EXTRA_MESSAGE,16);
                startActivity(i);}


            if (v.getId()== R.id.R) {
                Intent i = new Intent(OverviewActivity.this, diplay.class);
                i.putExtra(EXTRA_MESSAGE,17);
                startActivity(i);}


            if (v.getId()== R.id.S) {
                Intent i = new Intent(OverviewActivity.this, diplay.class);
                i.putExtra(EXTRA_MESSAGE,18);
                startActivity(i);}


            if (v.getId()== R.id.T) {
                Intent i = new Intent(OverviewActivity.this, diplay.class);
                i.putExtra(EXTRA_MESSAGE,19);
                startActivity(i);}


            if (v.getId()== R.id.U) {
                Intent i = new Intent(OverviewActivity.this, diplay.class);
                i.putExtra(EXTRA_MESSAGE,20);
                startActivity(i);}


            if (v.getId()== R.id.V) {
                Intent i = new Intent(OverviewActivity.this, diplay.class);
                i.putExtra(EXTRA_MESSAGE,21);
                startActivity(i);}


            if (v.getId()== R.id.W) {
                Intent i = new Intent(OverviewActivity.this, diplay.class);
                i.putExtra(EXTRA_MESSAGE,22);
                startActivity(i);}


            if (v.getId()== R.id.Y) {
                Intent i = new Intent(OverviewActivity.this, diplay.class);
                i.putExtra(EXTRA_MESSAGE,24);
                startActivity(i);}


            if (v.getId()== R.id.X) {
                Intent i = new Intent(OverviewActivity.this, diplay.class);
                i.putExtra(EXTRA_MESSAGE,23);
                startActivity(i);}


            if (v.getId()== R.id.Z) {
                Intent i = new Intent(OverviewActivity.this, diplay.class);
                i.putExtra(EXTRA_MESSAGE,25);
                startActivity(i);}





























        }


    };

}
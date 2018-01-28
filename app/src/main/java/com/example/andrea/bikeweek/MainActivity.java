package com.example.andrea.bikeweek;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    int scorecyclistblue = 0;
    int scorecyclistyellow = 0;
    int scorecyclistviolet = 0;
    int scorecyclistwhite = 0;

    TextView scoreViewB;
    TextView scoreViewY;
    TextView scoreViewV;
    TextView scoreViewW;

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        outState.putInt("cyclistyellow", scorecyclistyellow);

        outState.putInt("cyclistblue", scorecyclistblue);
        outState.putInt("cyclistviolet", scorecyclistviolet);
        outState.putInt("cyclistwhite", scorecyclistwhite);
        displayforcyclistwhite(scorecyclistwhite);
        displayforcyclistviolet(scorecyclistviolet);
        displayforcyclistyellow(scorecyclistyellow);
        displayforcyclistblue(scorecyclistblue);


    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        scoreViewV = findViewById(R.id.scoreviolet);
        scoreViewY = findViewById(R.id.scoreyellow);
        scoreViewB = findViewById(R.id.scoreblue);
        scoreViewW = findViewById(R.id.scorewhite);

        if (savedInstanceState != null) {


            scorecyclistyellow = savedInstanceState.getInt("cyclistyellow");

            displayforcyclistyellow(scorecyclistyellow);

            scorecyclistblue = savedInstanceState.getInt("cyclistblue");
            displayforcyclistblue(scorecyclistblue);

            scorecyclistviolet = savedInstanceState.getInt("cyclistviolet");

            displayforcyclistviolet(scorecyclistviolet);

            scorecyclistwhite = savedInstanceState.getInt("cyclistwhite");

            displayforcyclistwhite(scorecyclistwhite);

        }


    }

    public void displayforcyclistblue(int score) {


        scoreViewB.setText(String.valueOf(score));
    }

    public void displayforcyclistyellow(int score) {


        scoreViewY.setText(String.valueOf(score));
    }

    public void displayforcyclistviolet(int score) {


        scoreViewV.setText(String.valueOf(score));
    }

    public void displayforcyclistwhite(int score) {


        scoreViewW.setText(String.valueOf(score));
    }


    public void First(View V) {
        scorecyclistblue = scorecyclistblue + 5;

        displayforcyclistblue(scorecyclistblue);


    }

    public void Second(View V) {
        scorecyclistblue = scorecyclistblue + 3;
        displayforcyclistblue(scorecyclistblue);
    }

    public void third(View V) {
        scorecyclistblue = scorecyclistblue + 2;
        displayforcyclistblue(scorecyclistblue);
    }

    public void fourth(View View) {
        scorecyclistblue = scorecyclistblue + 1;
        displayforcyclistblue(scorecyclistblue);
    }


    public void Firsty(View View) {
        scorecyclistyellow = scorecyclistyellow + 5;

        displayforcyclistyellow(scorecyclistyellow);


    }

    public void Secondy(View View) {
        scorecyclistyellow = scorecyclistyellow + 3;
        displayforcyclistyellow(scorecyclistyellow);
    }

    public void thirdy(View View) {
        scorecyclistyellow = scorecyclistyellow + 2;
        displayforcyclistyellow(scorecyclistyellow);
    }

    public void fourthy(View View) {
        scorecyclistyellow = scorecyclistyellow + 1;
        displayforcyclistyellow(scorecyclistyellow);
    }


    public void Firstv(View View) {
        scorecyclistviolet = scorecyclistviolet + 5;

        displayforcyclistviolet(scorecyclistviolet);


    }

    public void Secondv(View View) {
        scorecyclistviolet = scorecyclistviolet + 3;
        displayforcyclistviolet(scorecyclistviolet);
    }

    public void thirdv(View View) {
        scorecyclistviolet = scorecyclistviolet + 2;
        displayforcyclistviolet(scorecyclistviolet);
    }

    public void fourthv(View View) {
        scorecyclistviolet = scorecyclistviolet + 1;
        displayforcyclistviolet(scorecyclistviolet);
    }

    public void Firstw(View View) {
        scorecyclistwhite = scorecyclistwhite + 5;

        displayforcyclistwhite(scorecyclistwhite);


    }

    public void Secondw(View View) {
        scorecyclistwhite = scorecyclistwhite + 3;
        displayforcyclistwhite(scorecyclistwhite);
    }

    public void thirdw(View View) {
        scorecyclistwhite = scorecyclistwhite + 2;
        displayforcyclistwhite(scorecyclistwhite);
    }

    public void fourthw(View View) {
        scorecyclistwhite = scorecyclistwhite + 1;
        displayforcyclistwhite(scorecyclistwhite);
    }

    public void newRound(View View) {
        scorecyclistwhite = 0;
        scorecyclistyellow = 0;

        scorecyclistviolet = 0;
        scorecyclistblue = 0;

        displayforcyclistwhite(scorecyclistwhite);

        displayforcyclistviolet(scorecyclistviolet);
        displayforcyclistyellow(scorecyclistyellow);

        displayforcyclistblue(scorecyclistblue);
    }

}

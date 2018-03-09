package com.example.android.uefacup;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int goalHome = 0;
    int goalAway = 0;
    int foulAway = 0;
    int foulHome = 0;
    int cornerHome = 0;
    int cornerAway = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Displays the given score for Away Team.
     */
    public void displayForAway(int goalAway) {
        TextView scoreView = (TextView) findViewById(R.id.away);
        scoreView.setText(String.valueOf(goalAway));
    }
    //this is for when goal button is pressed
    public void goalB (View view){
        goalAway=goalAway+1;
        displayForAway(goalAway);
    }

    /**
     * Displays the given score for Home Team.
     */
    public void displayForHome(int goalHome) {
        TextView scoreView = (TextView) findViewById(R.id.home);
        scoreView.setText(String.valueOf(goalHome));
    }
    // this is for when goal button is pressed
    public void goalA (View view) {
        goalHome=goalHome+1;
        displayForHome(goalHome);
    }

    /**
     * Displays the given score for Foul Away Team.
     */
    public void displayForFoulAway(int foulAway) {
        TextView scoreView = (TextView) findViewById(R.id.foulaway);
        scoreView.setText(String.valueOf(foulAway));
    }
    //for when the foul button is pressed
    public void foulB (View view) {
        foulAway=foulAway+1;
        displayForFoulAway(foulAway);
    }

    /**
     * Displays the given score for Foul Home Team.
     */
    public void displayForFoulHome(int foulHome) {
        TextView scoreView = (TextView) findViewById(R.id.foulhome);
        scoreView.setText(String.valueOf(foulHome));
    }
    //this is for when the foul button is pressed
    public void foulA (View view) {
        foulHome = foulHome + 1;
        displayForFoulHome(foulHome);
    }
    /**
     * Displays the given score for Corner Home Team.
     */
    public void displayForCornerHome(int cornerHome) {
        TextView scoreView = (TextView) findViewById(R.id.cornerhome);
        scoreView.setText(String.valueOf(cornerHome));
    }
    //this is for when the corner button is pressed
    public void cornerA (View view){
        cornerHome=cornerHome+1;
        displayForCornerHome(cornerHome);
    }
    /**
     * Displays the given score for Corner Away Team.
     */
    public void displayForCornerAway(int cornerAway) {
        TextView scoreView = (TextView) findViewById(R.id.corneraway);
        scoreView.setText(String.valueOf(cornerAway));
    }
    //this is for when the corner button is pressed
    public void cornerB (View view) {
        cornerAway=cornerAway+1;
        displayForCornerAway(cornerAway);
    }

//this is to call the rest button
    public void reset (View view) {
        goalAway=goalAway*0;
        goalHome=goalHome*0;
        foulAway=foulAway*0;
        foulHome=foulHome*0;
        cornerAway=cornerAway*0;
        cornerHome=cornerHome*0;
        displayForHome(goalHome);
        displayForAway(goalAway);
        displayForFoulHome(foulHome);
        displayForFoulAway(foulAway);
        displayForCornerHome(cornerHome);
        displayForCornerAway(cornerAway);
    }


}

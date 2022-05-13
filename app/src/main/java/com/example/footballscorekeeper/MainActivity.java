package com.example.footballscorekeeper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
 int mangoalcounter=0;
 int livgoalcounter=0;
 int manfoulcounter=0;
 int livfoulcounter=0;
 int manyellowcounter=0;
 int livyellowcounter=0;
 int manredcounter=0;
 int livredcounter=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void manGoal(View view)
    {
        mangoalcounter =mangoalcounter+1;
        displayManGoal(mangoalcounter);
    }
    public void livGoal(View view)
    {
        livgoalcounter =livgoalcounter+1;
        displaylivGoal(livgoalcounter);
    }
    public void manFoul(View view)
    {
        manfoulcounter = manfoulcounter+1;
        displayManFoul(manfoulcounter);
    }
    public void livFoul(View view)
    {
        livfoulcounter = livfoulcounter+1;
        displayLivFoul(livfoulcounter);
    }
    public void manYellow(View view)
    {
        manyellowcounter = manyellowcounter+1;
        displayManYellow(manyellowcounter);
    }
    public void livYellow(View view)
    {
        livyellowcounter = livyellowcounter+1;
        displayLivYellow(livyellowcounter);
    }
    public void manRed(View view)
    {
        manredcounter=manredcounter+1;
        displayManRed(manredcounter);
    }
    public void livRed(View view)
    {
        livredcounter=livredcounter+1;
        displayLivRed(livredcounter);
    }


    public void displayManGoal(int number)
    {
        TextView textView =(TextView) findViewById(R.id.mangoal_view);
        textView.setText(""+number);
    }
    public void displaylivGoal(int number)
    {
        TextView textView =(TextView) findViewById(R.id.livgoal_view);
        textView.setText(""+number);
    }
    public void displayManFoul(int number)
    {
        TextView textView = (TextView) findViewById(R.id.manfoul_view);
        if(number<=6)
        {
            textView.setText("" + number);
        }
        else
        {
            textView.setText("Err");
        }
    }
    public void displayLivFoul(int number)
    {
        TextView textView = (TextView) findViewById(R.id.livfoul_view);
        if(number<=6)
        {
            textView.setText("" + number);
        }
        else
        {
            textView.setText("Err");
        }
    }
    public void displayManYellow(int number)
    {
        TextView textView =(TextView) findViewById(R.id.manyellow_view);
        textView.setText(""+number);
    }
    public void displayLivYellow(int number)
    {
        TextView textView =(TextView) findViewById(R.id.livyellow_view);
        textView.setText(""+number);
    }
    public void displayManRed(int number)
    {
        TextView textView =(TextView) findViewById(R.id.manred_view);
        textView.setText(""+number);
    }
    public void displayLivRed(int number)
    {
        TextView textView =(TextView) findViewById(R.id.livred_view);
        textView.setText(""+number);
    }
    public void reset(View view)
    {
        int mangoalcounter=0;
        int livgoalcounter=0;
        int manfoulcounter=0;
        int livfoulcounter=0;
        int manyellowcounter=0;
        int livyellowcounter=0;
        int manredcounter=0;
        int livredcounter=0;
        displayManGoal(mangoalcounter);
        displaylivGoal(livgoalcounter);
        displayManFoul(manfoulcounter);
        displayLivFoul(livfoulcounter);
        displayManYellow(manyellowcounter);
        displayLivYellow(livyellowcounter);
        displayManRed(manredcounter);
        displayLivRed(livredcounter);

    }
}
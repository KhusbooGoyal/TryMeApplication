package com.example.tryme;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private View windowView;
    private int[] colors;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        colors=new int[]{Color.CYAN, Color.GREEN, Color.RED, Color.LTGRAY,
        Color.YELLOW, Color.MAGENTA, Color.BLUE, Color.DKGRAY, Color.BLACK};

        windowView= findViewById(R.id.windowViewID);


        Button btn = (Button) findViewById(R.id.trybutton);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int colorArrayLength = colors.length;

                Random ran = new Random();
                int r = ran.nextInt(colorArrayLength);
                windowView.setBackgroundColor(colors[r]);

                //Log.d("TEST","Tap");

            }
        });
    }
}

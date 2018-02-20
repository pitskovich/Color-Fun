package com.example.peteritsko.project3;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;

import static android.graphics.Color.rgb;

public class MainActivity extends AppCompatActivity {

    ImageView frame1;

    SeekBar seek1;
    SeekBar seek2;
    SeekBar seek3;
    SeekBar seek4;

    TextView label1;
    TextView label2;
    TextView label3;
    TextView label4;
    TextView label5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        frame1 = (ImageView) findViewById(R.id.imageView);

        seek1 = (SeekBar) findViewById(R.id.seekBar);
        seek2 = (SeekBar) findViewById(R.id.seekBar2);
        seek3 = (SeekBar) findViewById(R.id.seekBar3);
        seek4 = (SeekBar) findViewById(R.id.seekBar4);

        frame1.setBackgroundColor(Color.argb(0,0,0,0));

        label1 = (TextView) findViewById(R.id.textView);
        label2 = (TextView) findViewById(R.id.textView5);
        label3 = (TextView) findViewById(R.id.textView6);
        label4 = (TextView) findViewById(R.id.textView7);
        label5 = (TextView) findViewById(R.id.textView8);

        seek1.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                frame1.setBackgroundColor(Color.argb(seek4.getProgress(),seekBar.getProgress(),seek2.getProgress(),seek3.getProgress()));
                label2.setText(seekBar.getProgress() + "");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
            }
        });
        seek2.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                frame1.setBackgroundColor(Color.argb(seek4.getProgress(),seek1.getProgress(),seekBar.getProgress(),seek3.getProgress()));
                label3.setText(seekBar.getProgress() + "");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
            }
        });
        seek3.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                frame1.setBackgroundColor(Color.argb(seek4.getProgress(),seek1.getProgress(), seek2.getProgress(), seekBar.getProgress()));
                label4.setText(seekBar.getProgress() + "");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
            }
        });
        seek4.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                frame1.setBackgroundColor(Color.argb(seekBar.getProgress(),seek1.getProgress(), seek2.getProgress(), seek3.getProgress()));
                label5.setText(seekBar.getProgress() + "");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
            }
        });
    }

    public void seeker (View view) {
        label1.setText("apple");
    }

    public void seeker5 (View view) {
        frame1.setBackgroundColor(Color.argb(Color.alpha(seek4.getProgress()),Color.red(((SeekBar) view).getProgress()*(255/100)), Color.green(seek2.getProgress()), Color.blue(seek3.getProgress() * (255/100))));
        label1.setText(((SeekBar) view).getProgress());
    }

    public void seeker3 (View view) {
        int color = frame1.getSolidColor();
        int newColor = Color.rgb(Color.red(color), Color.green(((SeekBar) view).getProgress()), Color.blue(color));
        frame1.setBackgroundColor(newColor);
    }

    public void seeker2 (View view) {
        int color = frame1.getSolidColor();
        int newColor = Color.rgb(Color.red(color), Color.green(color), Color.blue(((SeekBar) view).getProgress()));
        frame1.setBackgroundColor(newColor);
    }

    public void seeker4 (View view) {
        float alpha = (float)(((SeekBar) view).getProgress());
        frame1.setAlpha(alpha);
    }
}

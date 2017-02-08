package com.killerapps.triviaapp;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button startTriviaBtn;
    private LinearLayout mainLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        startTriviaBtn = (Button) findViewById(R.id.btnStart);
        mainLayout = (LinearLayout) findViewById(R.id.layoutMain);


        setMainLayout();
    }

    private void setMainLayout() {
        ImageView imageView = new ImageView(MainActivity.this);
        imageView.setImageResource((R.drawable.trivia));
//        imageView.setLayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT));
//        imageView.setLayoutParams(mainLayout.getLayoutParams());
        TextView textView = new TextView(MainActivity.this);
        textView.setText(R.string.trivia_ready);
        
//        textView.setTextAlignment(textView.TEXT_ALIGNMENT_CENTER);
//        textView.setLayoutParams(mainLayout.getLayoutParams());

        mainLayout.addView(imageView);
        mainLayout.addView(textView);
    }


    public void exit(View view){
        finish();
    }
}

package com.sakuna63.adf2015;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class MainActivity extends ActionBarActivity {

    boolean flag = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final View container1 = findViewById(R.id.container1);
        final View container2 = findViewById(R.id.container2);
        container2.findViewById(R.id.title).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                View text1 = container2.findViewById(R.id.text1);
                View text2 = container2.findViewById(R.id.text2);
                View text3 = container2.findViewById(R.id.text3);
                View text4 = container2.findViewById(R.id.text4);

                text1.setTranslationX(-text1.getWidth());
                text2.setTranslationX(text2.getWidth());
                text3.setTranslationX(-text3.getWidth());
                text4.setTranslationX(text4.getWidth());

                text1.setVisibility(View.VISIBLE);
                text2.setVisibility(View.VISIBLE);
                text3.setVisibility(View.VISIBLE);
                text4.setVisibility(View.VISIBLE);

                int duration = 300;
                text1.animate().setStartDelay(duration * 0).setDuration(duration).translationX(0);
                text2.animate().setStartDelay(duration * 1).setDuration(duration).translationX(0);
                text3.animate().setStartDelay(duration * 2).setDuration(duration).translationX(0);
                text4.animate().setStartDelay(duration * 3).setDuration(duration).translationX(0);
            }
        });
        container1.findViewById(R.id.title).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (flag) {
                    container1.animate().alpha(0f).setListener(new AnimatorListenerAdapter() {
                        @Override
                        public void onAnimationEnd(Animator animation) {
                            super.onAnimationEnd(animation);
                            container1.setVisibility(View.GONE);
                        }
                    });

                    container2.setVisibility(View.VISIBLE);
                    container2.setAlpha(0f);
                    container2.animate().alpha(1f);
                    return;
                }

                flag = true;
                View text1 = container1.findViewById(R.id.text1);
                View text2 = container1.findViewById(R.id.text2);
                View text3 = container1.findViewById(R.id.text3);
                View text4 = container1.findViewById(R.id.text4);
                View text5 = container1.findViewById(R.id.text5);
                View text6 = container1.findViewById(R.id.text6);
                View text7 = container1.findViewById(R.id.text7);

                text1.setTranslationY(-text1.getHeight());
                text2.setTranslationY(-text2.getHeight());
                text3.setTranslationY(-text3.getHeight());
                text4.setTranslationY(text4.getHeight());
                text5.setTranslationY(text5.getHeight());
                text6.setTranslationY(text6.getHeight());
                text7.setTranslationY(text7.getHeight());

                text1.setVisibility(View.VISIBLE);
                text2.setVisibility(View.VISIBLE);
                text3.setVisibility(View.VISIBLE);
                text4.setVisibility(View.VISIBLE);
                text5.setVisibility(View.VISIBLE);
                text6.setVisibility(View.VISIBLE);
                text7.setVisibility(View.VISIBLE);
                int duration = 300;
                text1.animate().setStartDelay(0).setDuration(duration).translationY(0);
                text2.animate().setStartDelay(duration * 1).setDuration(duration).translationY(0);
                text3.animate().setStartDelay(duration * 2).setDuration(duration).translationY(0);
                text4.animate().setStartDelay(duration * 3).setDuration(duration).translationY(0);
                text5.animate().setStartDelay(duration * 4).setDuration(duration).translationY(0);
                text6.animate().setStartDelay(duration * 5).setDuration(duration).translationY(0);
                text7.animate().setStartDelay(duration * 6).setDuration(duration).translationY(0);
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}

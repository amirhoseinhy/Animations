package com.example.amirhosein.animations;

import android.animation.Animator;
import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        img = (ImageView) findViewById(R.id.img);
    }

    public void animate(View view) {

        //روش اول با استفاده از xml
      /*  Animation animation = AnimationUtils.loadAnimation(this, R.anim.grow);
        animation.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }
            @Override
            public void onAnimationEnd(Animation animation) {
                img.setScaleX(2);
                img.setScaleY(2);
            }
            @Override
            public void onAnimationRepeat(Animation animation) {
            }
        });
        img.startAnimation(animation);*/


//فقط با جاوا
        img.animate()
                .scaleX(2)
                .scaleY(2)
                .rotationX(180)
                .rotationY(180)
                .translationX(200)
                .translationY(200)
                .setDuration(1000)
                .setListener(new Animator.AnimatorListener() {
                    @Override
                    public void onAnimationStart(Animator animator) {

                    }

                    @Override
                    public void onAnimationEnd(Animator animator) {

                    }

                    @Override
                    public void onAnimationCancel(Animator animator) {

                    }

                    @Override
                    public void onAnimationRepeat(Animator animator) {

                    }
                });

    }
}

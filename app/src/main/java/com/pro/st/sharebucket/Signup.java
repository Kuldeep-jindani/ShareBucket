package com.pro.st.sharebucket;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Signup extends AppCompatActivity {

    TextView logo_share,logo_bucket;
    String gender;
ImageView signup_male,signup_female;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        logo_share=findViewById(R.id.logo_share);
        logo_bucket=findViewById(R.id.logo_bucket);
        signup_male=findViewById(R.id.signup_male);
        signup_female=findViewById(R.id.signup_female);

        logo_share.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/bauhaus.ttf"));
        logo_bucket.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/bauhaus.ttf"));



        signup_male.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gender="male";
                signup_male.setImageDrawable(getResources().getDrawable(R.drawable.male_avatar));
                signup_female.setImageDrawable(getResources().getDrawable(R.drawable.female_avataar_deselected));
            }
        });
        signup_female.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gender="female";
                signup_male.setImageDrawable(getResources().getDrawable(R.drawable.male_avatar_deselected));
                signup_female.setImageDrawable(getResources().getDrawable(R.drawable.female_avataar));
            }
        });

        signup_male.performClick();
    }
}

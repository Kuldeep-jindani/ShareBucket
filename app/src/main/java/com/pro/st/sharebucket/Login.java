package com.pro.st.sharebucket;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Login extends AppCompatActivity {

    TextView logo_share,logo_bucket;
Button login_signup;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        logo_share=findViewById(R.id.logo_share);
        logo_bucket=findViewById(R.id.logo_bucket);
        login_signup=findViewById(R.id.login_signup);

logo_share.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/bauhaus.ttf"));
logo_bucket.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/bauhaus.ttf"));

        login_signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),Signup.class);
                startActivity(i);
            }
        });

    }
}

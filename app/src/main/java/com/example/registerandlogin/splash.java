package com.example.registerandlogin;

import androidx.appcompat.app.AppCompatActivity;

        import android.content.Intent;
        import android.os.Handler;
        import android.os.Bundle;

public class splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

//starts with this screen as a splash screen, then goes to activity_login screen

        Handler handler=new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(splash.this,Login.class));
                finish();
            }
        },4000);
    }
}

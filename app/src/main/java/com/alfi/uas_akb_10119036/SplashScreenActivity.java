/*
 *   NIM : 10119036
 *   NAMA : ALFI NURIZKYA
 *   KELAS : IF-1
 */

package com.alfi.uas_akb_10119036;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

import com.alfi.uas_akb_10119036.ui.auth.RegisterActivity;

public class SplashScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(getApplicationContext(), RegisterActivity.class));
                finish();
            }
        }, 3000);
    }
}
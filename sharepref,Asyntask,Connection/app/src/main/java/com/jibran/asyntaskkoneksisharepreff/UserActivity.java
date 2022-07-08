package com.jibran.asyntaskkoneksisharepreff;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class UserActivity extends AppCompatActivity {

    TextView tvUser;
    SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);

        tvUser = findViewById(R.id.tv_user);

             sharedPreferences = getSharedPreferences("data_sharedpreff_kita", MODE_PRIVATE);

        tvUser.setText(sharedPreferences.getString("NAMA", "-"));

    }
}
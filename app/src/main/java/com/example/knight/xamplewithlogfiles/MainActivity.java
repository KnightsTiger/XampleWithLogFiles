package com.example.knight.xamplewithlogfiles;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    String Tag = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(Tag,"Sample Message");
    }

    public void goToNextPage(View view) {
        startActivity(new Intent(this,Main2Activity.class));
        Log.d("onClick","move to next page");
    }
}

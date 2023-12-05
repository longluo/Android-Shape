package me.longluo.shape;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;


public class RelativeLayoutActivity extends AppCompatActivity {

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relative);
    }

    public static void callMe(Context context) {
        context.startActivity(new Intent(context, RelativeLayoutActivity.class));
    }
}
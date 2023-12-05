package me.longluo.shape;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;


public class Corners extends AppCompatActivity {

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_corners);
    }

    public static void callMe(Context context) {
        context.startActivity(new Intent(context, Corners.class));
    }
}
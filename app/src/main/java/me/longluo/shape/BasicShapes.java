package me.longluo.shape;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;


public class BasicShapes extends AppCompatActivity {

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic_shapes);
    }

    public static void callMe(Context context) {
        context.startActivity(new Intent(context, BasicShapes.class));
    }
}
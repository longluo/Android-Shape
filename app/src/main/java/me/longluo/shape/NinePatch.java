package me.longluo.shape;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

public class NinePatch extends Activity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nine_patch);
    }

    public static void callMe(Context context) {
        context.startActivity(new Intent(context, NinePatch.class));
    }
}
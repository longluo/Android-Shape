package me.longluo.shape;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Drawables extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_drawables);

        findViewById(R.id.btn_basic_shapes).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                BasicShapes.callMe(Drawables.this);
            }
        });

        findViewById(R.id.btn_corners).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Corners.callMe(Drawables.this);
            }
        });

        findViewById(R.id.btn_gradient).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Gradients.callMe(Drawables.this);
            }
        });

        findViewById(R.id.btn_state_lists).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                StateLists.callMe(Drawables.this);
            }
        });

        findViewById(R.id.btn_nine_patch).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                NinePatch.callMe(Drawables.this);
            }
        });

        findViewById(R.id.btn_relative_layout).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                RelativeLayoutActivity.callMe(Drawables.this);
            }
        });

        findViewById(R.id.btn_shadow).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                ShadowActivity.callMe(Drawables.this);
            }
        });
    }
}

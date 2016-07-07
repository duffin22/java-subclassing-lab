package com.hfad.javasubclass;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    Button vultureButton;
    ImageView picture;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        vultureButton=(Button) findViewById(R.id.vultureBut);
        picture=(ImageView) findViewById(R.id.imageView);

        vultureButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                picture.setImageResource(R.drawable.vulture);
            }
        });
    }


}

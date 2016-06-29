package com.zeljkopratezina.myfirstapp_images;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private static ImageView imgView;
    private static Button button_sbm;

    private int current_image_index;

    int [] images = {R.mipmap.android_image_01,R.mipmap.android_image_02,R.mipmap.ic_launcher};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonClick();
    }

    public void buttonClick(){

        imgView = (ImageView)findViewById(R.id.imageView);
        button_sbm = (Button)findViewById(R.id.button);
        button_sbm.setOnClickListener(

                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        current_image_index++; //index will indicate images one by one
                        current_image_index = current_image_index%images.length;
                        imgView.setImageResource(images[current_image_index]);


                    }
                }
        );


    }
}

package com.example.myapplication_heartsdesire;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.ViewSwitcher;

public class MainActivity_imageViewer1 extends AppCompatActivity {

    ImageSwitcher imgSwitcher;
    Button btn_nxt,btn_bck;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_image_viewer1);

        //image switcher
        imgSwitcher= findViewById(R.id.image_switcher);

        imgSwitcher.setFactory(new ViewSwitcher.ViewFactory() {
            @Override
            public View makeView() {
                ImageView image_View = new ImageView(getApplicationContext());
                image_View.setScaleType(ImageView.ScaleType.FIT_CENTER);
                return image_View;
            }
        });

        //button next
        btn_nxt= findViewById(R.id.button_next);

        btn_nxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imgSwitcher.setImageResource(R.drawable.cutegirl1);
            }
        });

        //button back
        btn_bck= findViewById(R.id.button_back);

        btn_bck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imgSwitcher.setImageResource(R.drawable.cutegirl2);
            }
        });
    }
}
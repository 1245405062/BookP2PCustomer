package com.example.zjr.bookp2pcustomer;

import android.app.Activity;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.renderscript.ScriptGroup;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.io.InputStream;

/**
 * Created by zjr on 2017/2/8.
 */

public class PhotoActivity extends Activity {
    Button btn_photo;
    ImageView img_photo;
    public static final String IMAGE_UNSPECIFIED = "image/*";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.photo);
        btn_photo= (Button) findViewById(R.id.btn_photo);
        img_photo= (ImageView) findViewById(R.id.img_photo);
        btn_photo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                InputStream input=getResources().openRawResource(R.raw.photo);

            }
        });
    }

}

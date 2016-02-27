package com.mobileappscompany.training.saveandrestoreinstancestate;

import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ImageView;

/**
 * Created by admin on 2/25/2016.
 */
public class DailyPhotoActivity extends AppCompatActivity {

    private ImageView imgvDailyPhoto;
    private final static String TAG_DEBUG = "debugueando...";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daily_photo);
        imgvDailyPhoto = (ImageView)findViewById(R.id.imgv_daily_photo);
        Intent intent = new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
        startActivityForResult(intent, 0);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        Log.d(TAG_DEBUG, " -> " + this.getLocalClassName() + " : onActivityResult");
        if (resultCode == RESULT_OK) {

        }
    }
}

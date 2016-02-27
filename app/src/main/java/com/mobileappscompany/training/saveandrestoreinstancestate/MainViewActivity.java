package com.mobileappscompany.training.saveandrestoreinstancestate;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

/**
 * Created by admin on 2/25/2016.
 */
public class MainViewActivity extends AppCompatActivity {

    private final static String TAG_DEBUG = "debugueando...";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_view);
        Log.d(TAG_DEBUG, " -> " + this.getLocalClassName() + " : onCreate");
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        Log.d(TAG_DEBUG, " -> " + this.getLocalClassName() + " : onActivityResult");
    }

    public void findPicture(View view) {
        Intent intent = new Intent(this, DailyPhotoActivity.class);
        startActivity(intent);
    }
}

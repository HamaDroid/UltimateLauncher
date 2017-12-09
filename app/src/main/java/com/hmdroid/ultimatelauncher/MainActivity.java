package com.hmdroid.ultimatelauncher;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void dialer(View v){
        PackageManager pm = getPackageManager();
        Intent intent = pm.getLaunchIntentForPackage("com.android.dialer");
        startActivity(intent);
    }
    public void contacts(View v){
        PackageManager pm = getPackageManager();
        Intent intent = pm.getLaunchIntentForPackage("com.android.contacts");
        startActivity(intent);
    }
    public void mms(View v){
        PackageManager pm = getPackageManager();
        Intent intent = pm.getLaunchIntentForPackage("com.android.mms");
        startActivity(intent);
    }
    public void gallery(View v) {
        PackageManager pm = getPackageManager();
        Intent intent = pm.getLaunchIntentForPackage("com.android.gallery3d");
        startActivity(intent);
    }
    public void camera(View v) {
        PackageManager pm = getPackageManager();
        Intent intent = pm.getLaunchIntentForPackage("com.mediatek.camera");
        startActivity(intent);
    }
    public void settings(View v){
        PackageManager pm = getPackageManager();
        Intent intent = pm.getLaunchIntentForPackage("com.android.settings");
        startActivity(intent);
    }
}

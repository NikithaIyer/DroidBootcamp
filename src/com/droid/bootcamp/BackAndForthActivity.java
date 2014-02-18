package com.droid.bootcamp;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

/**
 * Created by nikitha on 18/02/14.
 */
public class BackAndForthActivity extends Activity {
    private static final String TAG = "BackAndForthActivity";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.backandforth);
        Log.v(TAG, "OnCreate called of " + TAG);

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.v(TAG, "On Start called of " + TAG);
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.v(TAG, "On Resume called of " + TAG);
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.v(TAG, "On Pause called of " + TAG);
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.v(TAG, "On Stop called of " + TAG);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.v(TAG, "On Destroy called of " + TAG);
    }

}
package com.droid.bootcamp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MyActivity extends Activity {
    private static final String TAG = "MyActivity";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        Log.v(TAG,"OnCreate called of "+ TAG);
    }
    public void add(View view){
        EditText op1 = (EditText) findViewById(R.id.first_operand);
        EditText op2 = (EditText) findViewById(R.id.second_operand);

        int firstOperand = Integer.parseInt(op1.getText().toString());
        int secondOperand = Integer.parseInt(op2.getText().toString());


    }

    public void launchResult(View view){
        EditText op1 = (EditText) findViewById(R.id.first_operand);
        EditText op2 = (EditText) findViewById(R.id.second_operand);

        int firstOperand = Integer.parseInt(op1.getText().toString());
        int secondOperand = Integer.parseInt(op2.getText().toString());

        Intent intent = new Intent(getApplicationContext(), ResultActivity.class);
        intent.putExtra("result",String.valueOf(firstOperand + secondOperand));
        startActivityForResult(intent, Constants.BACK_RESULT);

    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode,
                                    Intent data) {
        if (requestCode == Constants.BACK_RESULT) {

                // A contact was picked.  Here we will just display it
                // to the user.
            ((TextView) findViewById(R.id.result)).setText(data.getStringExtra("back_result"));


        }
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

    public void launchBackAndForth(View view) {
        Intent intent = new Intent(getApplicationContext(), BackAndForthActivity.class);
        startActivity(intent);
    }
}

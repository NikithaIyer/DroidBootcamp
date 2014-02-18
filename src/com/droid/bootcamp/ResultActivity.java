package com.droid.bootcamp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by nikitha on 18/02/14.
 */
public class ResultActivity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.resultmain);
        Intent intent = getIntent();
        String resultValue = intent.getStringExtra("result");

        TextView resultView = (TextView) findViewById(R.id.result);
        resultView.setText(resultValue);

        intent.putExtra("back_result",String.valueOf(Integer.parseInt(resultValue) - 10));
        setResult(RESULT_OK,intent);


    }


}
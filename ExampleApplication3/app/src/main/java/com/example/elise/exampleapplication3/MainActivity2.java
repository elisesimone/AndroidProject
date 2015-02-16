package com.example.elise.exampleapplication3;

import android.app.Activity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;


public class MainActivity2 extends Activity {

    TextView tvResponse;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity2);

        tvResponse = (TextView) findViewById(R.id.tv_result);
        tvResponse.setText(getIntent().getStringExtra("key"));
    }

}

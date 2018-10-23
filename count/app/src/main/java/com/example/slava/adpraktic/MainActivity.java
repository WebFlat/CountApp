package com.example.slava.adpraktic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import static android.widget.Toast.*;

public class MainActivity extends AppCompatActivity {

    private int mCount=0;
    private TextView mCountShow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mCountShow= (TextView)findViewById(R.id.count_show);
    }

    public void showToast(View view) {
        Toast toast = makeText(this,R.string.toast_msg,LENGTH_SHORT);
        toast.show();
    }

    public void countUp(View view) {
        mCount++;
        mCountShow.setText(Integer.toString(mCount));
        Toast toast=makeText(this,Integer.toString(mCount)+" count up",LENGTH_SHORT);
        toast.show();

    }
}

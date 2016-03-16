package com.example.zhangyipeng.graduallyshowtext;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        intent = new Intent(this, TargetActivity.class);
    }

    public void normalClick(View v){
        intent.putExtra("alignment","normal");
        startActivity(intent);
    }

    public void centerClick(View v){
        intent.putExtra("alignment","center");
        startActivity(intent);


    }

    public void oppositeClick(View v){
        intent.putExtra("alignment","opposite");
        startActivity(intent);


    }


}

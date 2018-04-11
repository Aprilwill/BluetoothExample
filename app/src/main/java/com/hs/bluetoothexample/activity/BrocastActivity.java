package com.hs.bluetoothexample.activity;

import android.os.Bundle;
import android.util.Log;

import com.hs.bluetoothexample.MainActivity;
import com.hs.bluetoothexample.R;

/**
 * Created by Administrator on 2018/4/10.
 */

public class BrocastActivity extends MainActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.v("1","---------BonCreate");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_brocast);
    }

    @Override
    protected void onStart() {
        Log.v("1","---------BonStart");
        super.onStart();
    }

    @Override
    protected void onRestart() {
        Log.v("1","---------BonReStart");
        super.onRestart();
    }

    @Override
    protected void onResume() {
        Log.v("1","---------BonResume");
        super.onResume();
    }

    @Override
    protected void onStop() {
        Log.v("1","---------BonStop");
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        Log.v("1","---------BonDestroy");
        super.onDestroy();
    }
    @Override
    protected void onPause() {
        Log.v("1","---------BonPause");
        super.onPause();
    }
}

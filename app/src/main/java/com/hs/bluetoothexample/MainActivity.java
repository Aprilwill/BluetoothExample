package com.hs.bluetoothexample;

import android.content.Intent;
import android.content.IntentFilter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.hs.bluetoothexample.activity.BrocastActivity;
import com.hs.bluetoothexample.brocast.MyBroadcastReceiver;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.v("1","---------onCreate");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        Log.v("1","---------onStart");
        super.onStart();
    }

    @Override
    protected void onRestart() {
        Log.v("1","---------onReStart");
        super.onRestart();
    }

    @Override
    protected void onResume() {
        Log.v("1","---------onResume");
        super.onResume();
    }

    @Override
    protected void onStop() {
        Log.v("1","---------onStop");
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        Log.v("1","---------onDestroy");
        super.onDestroy();
        unregisterReceiver(receiver);
    }

    @Override
    protected void onPause() {
        Log.v("1","---------onPause");
        super.onPause();
    }

    public void openClick(View view){
   /*     Intent intent=new Intent(MainActivity.this, BrocastActivity.class);
        startActivity(intent);*/

    }

    MyBroadcastReceiver receiver;
    public void CloseClick(View view){
 /*       Intent intent=new Intent();
        intent.setAction("com.hs.example.brocast");
        intent.putExtra("content","我是张三");
        sendBroadcast(intent);*/

      /*   receiver=new MyBroadcastReceiver();
        IntentFilter filter=new IntentFilter();
        filter.addAction("android.intent.action.BATTERY_CHANGED");
        registerReceiver(receiver,filter);*/
    }


}

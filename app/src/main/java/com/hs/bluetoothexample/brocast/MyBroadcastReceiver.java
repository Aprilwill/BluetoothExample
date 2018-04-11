package com.hs.bluetoothexample.brocast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

/**
 * Created by yqy on 2018/4/10.
 * 自定义广播接受者
 */

public class MyBroadcastReceiver extends BroadcastReceiver{

    @Override
    public void onReceive(Context context, Intent intent) {
/**
 * 自定义广播的接收处理
 * 自定义广播通过跳转时设置action即可
        if(intent.getAction().equals("com.hs.example.brocast")){
            Log.v("reveiver","title:"+intent.getStringExtra("content"));
 // abortBroadcast();//终止广播
        }
 **/
        /**
         * 系统广播的接收
         * **/


        if(intent.getAction().equals("android.intent.action.BATTERY_CHANGED")){
            Bundle bundle=intent.getExtras();
            Log.v("2","level:"+bundle.getInt("level")+"total"+bundle.getInt("scale"));

        }

    }
}


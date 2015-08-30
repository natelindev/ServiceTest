package com.example.lll.servicetest;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;

/**
 * Created by LLL on 15/8/30.
 */
public class MyService extends Service {

    @Override
    public IBinder onBind(Intent intent){
        return null;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Log.d("MyService","Service Created");
    }

    @Override
    public int onStartCommand(Intent intent,int flags,int startId){
        Log.d("MyService","Service Started");
        return super.onStartCommand(intent,flags,startId);
    }

    @Override
    public void onDestroy() {
        Log.d("MyService","Service Stopped");
        super.onDestroy();
    }
}

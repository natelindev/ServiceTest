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
    private DownloadBinder mBinder = new DownloadBinder();

    class DownloadBinder extends Binder {
        public void startDownload(){//Stimulating function
            Log.d("MyService","Download Started");
        }

        public int getProgress() {
            Log.d("MyService","Progress Gotten");
            return 0;
        }
    }

    @Override
    public IBinder onBind(Intent intent){
        return mBinder;
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

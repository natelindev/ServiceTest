package com.example.lll.servicetest;

import android.app.IntentService;
import android.content.Intent;
import android.util.Log;

/**
 * Created by LLL on 15/8/31.
 */
public class MyIntentService extends IntentService{

    public MyIntentService(){
        super("MyIntentService");
    }

    @Override
    protected void onHandleIntent(Intent intent){
        Log.d("MyIntentService","Thread is "+Thread.currentThread().getId());
    }

    @Override
    public void onDestroy(){
        super.onDestroy();
        Log.d("MyIntentService","IntentService Destroyed");
    }
}

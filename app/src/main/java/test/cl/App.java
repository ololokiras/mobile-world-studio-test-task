package test.cl;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

import java.lang.reflect.InvocationTargetException;

import dalvik.system.DexClassLoader;

public class App extends Application {
    DexClassLoader dexClassLoader;
    @Override
    public void onCreate() {
        super.onCreate();
        try {
            Dexter.loadFromAssets(this,"activity.dex");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
    }
}

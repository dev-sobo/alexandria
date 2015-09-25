package it.jaschke.alexandria;

import android.app.Application;
import android.content.Context;

/**
 * Created by ian on 9/25/2015.
 */
public class App extends Application {
    private static Context mContext;

    @Override
    public void onCreate() {
        super.onCreate();
        mContext = this;
    }

    public static Context getContext() {
        return mContext.getApplicationContext();
    }
}

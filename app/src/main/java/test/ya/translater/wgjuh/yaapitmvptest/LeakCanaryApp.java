package test.ya.translater.wgjuh.yaapitmvptest;

import android.app.Application;
import android.content.Context;

public class LeakCanaryApp extends Application {
    private static Context context;
    @Override public void onCreate() {
        super.onCreate();
        context = getApplicationContext();
    }
    public static Context getAppContext() {
        return LeakCanaryApp.context;
    }
}

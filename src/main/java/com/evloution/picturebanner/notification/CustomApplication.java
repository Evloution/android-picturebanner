package com.evloution.picturebanner.notification;

import android.app.Application;
import android.os.Build;

/**
 * Created by  peter on 2018/7/11.
 */

public class CustomApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            NotificationChannels.createAllNotificationChannels(this);
        }
    }
}

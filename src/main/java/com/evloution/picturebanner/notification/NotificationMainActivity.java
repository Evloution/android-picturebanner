package com.evloution.picturebanner.notification;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v4.app.NotificationCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.evloution.picturebanner.R;

import static com.evloution.picturebanner.notification.NotificationService.ACTION_SEND_PROGRESS_NOTIFICATION;


/**
 * @author peter
 */
public class NotificationMainActivity extends AppCompatActivity implements View.OnClickListener{

    private final static String TAG = "NotificationDemo";

    private Context mContext;
    private Button mSimple;
    private Button mAction;
    private Button mRemoteInput;
    private Button mBigPictureStyle;
    private Button mBigTextStyle;
    private Button mInboxStyle;
    private Button mMediaStyle;
    private Button mMessagingStyle;
    private Button mProgress;
    private Button mCustomHeadsUp;
    private Button mCustom;
    private Button mClearAll;

    private NotificationManager mNM;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification);

        mContext = this;

        mNM = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);

        mSimple = findViewById(R.id.btn_simple);
        mAction = findViewById(R.id.btn_action);
        mRemoteInput = findViewById(R.id.btn_remote_input);
        mBigPictureStyle = findViewById(R.id.btn_big_picture_style);
        mBigTextStyle = findViewById(R.id.btn_big_text_style);
        mInboxStyle = findViewById(R.id.btn_inbox_style);
        mMediaStyle = findViewById(R.id.btn_media_style);
        mMessagingStyle = findViewById(R.id.btn_messaging_style);
        mProgress = findViewById(R.id.btn_progress);
        mCustomHeadsUp = findViewById(R.id.btn_custom_heads_up);
        mCustom = findViewById(R.id.btn_custom);
        mClearAll = findViewById(R.id.btn_clear_all);

        mSimple.setOnClickListener(this);
        mAction.setOnClickListener(this);
        mRemoteInput.setOnClickListener(this);
        mBigPictureStyle.setOnClickListener(this);
        mBigTextStyle.setOnClickListener(this);
        mInboxStyle.setOnClickListener(this);
        mMediaStyle.setOnClickListener(this);
        mMessagingStyle.setOnClickListener(this);
        mProgress.setOnClickListener(this);
        mCustomHeadsUp.setOnClickListener(this);
        mCustom.setOnClickListener(this);
        mClearAll.setOnClickListener(this);
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_simple:
                //Notificaitons.getInstance().sendSimpleNotification(mContext,mNM);
                NotificationManager manager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
                NotificationCompat.Builder builder = new NotificationCompat.Builder(this);
                Notification notification = builder
                        .setContentTitle("这是通知标题")
                        .setContentText("这是通知内容")
                        .setWhen(System.currentTimeMillis())
                        .setSmallIcon(R.mipmap.ic_laun)
                        .setLargeIcon(BitmapFactory.decodeResource(getResources(), R.mipmap.ic_laun))
                        .setColor(Color.parseColor("#EAA935"))
                        .build();
                manager.notify(1, notification);
                break;
            case R.id.btn_action:
                Notificaitons.getInstance().sendActionNotification(mContext,mNM);
                break;
            case R.id.btn_remote_input:
                Notificaitons.getInstance().sendRemoteInputNotification(mContext,mNM);
                break;
            case R.id.btn_big_picture_style:
                Notificaitons.getInstance().sendBigPictureStyleNotification(mContext,mNM);
                break;
            case R.id.btn_big_text_style:
                Notificaitons.getInstance().sendBigTextStyleNotification(mContext,mNM);
                break;
            case R.id.btn_inbox_style:
                Notificaitons.getInstance().sendInboxStyleNotification(mContext,mNM);
                break;
            case R.id.btn_media_style:
                Notificaitons.getInstance().sendMediaStyleNotification(mContext,mNM,false);
                break;
            case R.id.btn_messaging_style:
                Notificaitons.getInstance().sendMessagingStyleNotification(mContext,mNM);
                break;
            case R.id.btn_progress:
                Intent intent = new Intent(this,NotificationService.class);
                intent.setAction(ACTION_SEND_PROGRESS_NOTIFICATION);
                startService(intent);
                break;
            case R.id.btn_custom_heads_up:
                Notificaitons.getInstance().sendCustomHeadsUpViewNotification(mContext,mNM);
                break;
            case R.id.btn_custom:
                Notificaitons.getInstance().sendCustomViewNotification(
                        mContext,
                        mNM,
                        new NotificationContentWrapper(
                                BitmapFactory.decodeResource(mContext.getResources(),
                                        R.mipmap.custom_view_picture_current),
                                "最美的期待",
                                "周笔畅 - 最美的期待"),
                        false,
                        true);
                break;
            case R.id.btn_clear_all:
                Notificaitons.getInstance().clearAllNotification(mNM);
                break;
            default:
                break;
                //do nothing
        }
    }
}

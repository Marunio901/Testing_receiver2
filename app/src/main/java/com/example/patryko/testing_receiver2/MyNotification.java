package com.example.patryko.testing_receiver2;

import android.app.NotificationManager;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by Patryko on 12/8/2017.
 */

public class MyNotification extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_notification);
        NotificationManager notman = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        notman.cancel(0);

        Intent i = getIntent();
        String title = i.getStringExtra("title");
        TextView tvt = (TextView)findViewById(R.id.activity_title);
        tvt.setText(title);

    }


}

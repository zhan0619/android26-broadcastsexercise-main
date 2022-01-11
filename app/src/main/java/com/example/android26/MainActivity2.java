package com.example.android26;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;

public class MainActivity2 extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        AlertDialog.Builder alertDialog = new AlertDialog.Builder(context);
        alertDialog.setTitle("Broadcast");
        alertDialog.setMessage("我收到了");
        alertDialog.setPositiveButton("關閉視窗", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
            }
        });
        alertDialog.setCancelable(false);
        alertDialog.show();
    }
}
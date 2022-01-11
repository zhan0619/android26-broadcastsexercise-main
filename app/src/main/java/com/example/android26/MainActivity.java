package com.example.android26;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private static final String FILTER_ACTION="123";
    MainActivity2 reciever=new MainActivity2();
    Intent intent =new Intent(FILTER_ACTION);
    private Button btnBroadcast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnBroadcast = (Button)findViewById(R.id.btnBroadcast);

        IntentFilter filter=new IntentFilter();
        filter.addAction(FILTER_ACTION);
        registerReceiver(reciever,filter);
        btnBroadcast.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View view) {
                sendBroadcast(intent);
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
        unregisterReceiver(reciever);
    }


}
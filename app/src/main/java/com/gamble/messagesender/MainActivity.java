package com.gamble.messagesender;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;

import java.time.LocalDateTime;

public class MainActivity extends AppCompatActivity {

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        for(;;){
//            try {
//                Thread.sleep(5000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            sendMsg();
//        }

    }

    private void sendMsg(){
        String msgContent  = "短信內容";
        System.out.println(msgContent);
        SmsManager.getDefault().sendTextMessage("5554",
                null, msgContent, null, null);
    }

//    @Override
//    protected void onResume() {
//        super.onResume();
//        this.finish();
//    }
}

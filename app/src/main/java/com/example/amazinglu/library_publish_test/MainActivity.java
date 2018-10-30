package com.example.amazinglu.library_publish_test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.example.amazinglu.my_library.SuccedUpload;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Message message = new Message();
//        String tmp = message.getMessage();

        String tmp = new SuccedUpload().toString();
        Toast.makeText(this, tmp, Toast.LENGTH_LONG).show();
        System.out.println(new SuccedUpload());
    }
}

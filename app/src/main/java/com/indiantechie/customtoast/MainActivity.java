package com.indiantechie.customtoast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private ToastMessage toastMessage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toastMessage=new ToastMessage(this);
        toastMessage.show(this,"ashin");
    }
}
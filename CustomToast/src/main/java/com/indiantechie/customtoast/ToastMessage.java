package com.indiantechie.customtoast;

import android.content.Context;
import android.widget.Toast;

public class ToastMessage {
    private Context context;
    public ToastMessage(Context context) {
        this.context=context;
    }

    public  void show(Context c, String message){

        Toast.makeText(c,message, Toast.LENGTH_SHORT).show();

    }
}

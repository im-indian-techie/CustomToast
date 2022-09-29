package com.indiantechie.customtoast;

import android.content.Context;
import android.widget.Toast;

public class ToastMessage {

    public static void show(Context c, String message){

        Toast.makeText(c,message, Toast.LENGTH_SHORT).show();

    }
}

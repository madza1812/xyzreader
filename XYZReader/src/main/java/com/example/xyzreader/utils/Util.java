package com.example.xyzreader.utils;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.Gravity;
import android.widget.Toast;

/**
 * Created by An on 1/4/2016.
 */
public class Util {
    private static Util util;
    private static final String LOG_TAG = "UTIL CLASS";
    public static synchronized Util instatnce() {
        if (util == null)
            util = new Util();
        return util;
    }

    public static void displayToast (Context context, CharSequence msg) {
        Toast noConToast = Toast.makeText(context, msg, Toast.LENGTH_SHORT);
        noConToast.setGravity(Gravity.TOP | Gravity.CENTER, 0, 0);
        noConToast.show();
    }
}

package com.android.contacts.test;

import android.util.Log;

public class Logger {

    private static final String TAG = "INSTRUMENTATION_TEST";
    private static final String SPACE = ": ";

    public static void v(String tag, String msg) {
        Log.v(TAG, tag + SPACE + msg);
    }

    public static void d(String tag, String msg) {
        if (Log.isLoggable(TAG, Log.DEBUG)) {
            Log.d(TAG, tag + SPACE + msg);
        }
    }

    public static void i(String tag, String msg) {
        Log.i(TAG, tag + SPACE + msg);
    }

    public static void w(String tag, String msg) {
        Log.w(TAG, tag + SPACE + msg);
    }

    public static void e(String tag, String msg) {
        Log.e(TAG, tag + SPACE + msg);
    }
}

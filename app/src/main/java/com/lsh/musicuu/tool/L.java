package com.lsh.musicuu.tool;

import android.util.Log;

import com.lsh.musicuu.BuildConfig;

/**
 * Created by "小灰灰"
 * on 22/2/2017 13:44
 * 邮箱：www.adonis_lsh.com
 */

public class L {
    public static void e(String... msg) {
        if (BuildConfig.DEBUG) {
            if (msg.length > 2) {
                Log.e(msg[0], msg[1]);
            } else {
                Log.e("L.print", msg[0]);
            }
        }
    }
}

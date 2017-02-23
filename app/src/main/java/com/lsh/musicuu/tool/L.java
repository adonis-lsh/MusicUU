package com.lsh.musicuu.tool;

import android.util.Log;

/**
 * Created by Android on 2016/7/28.
 */
public class L {
    public static void e(String ...msg){
        if(msg.length>=2){
            Log.e(msg[0],msg[1].length()+" "+msg[1]);
        }else{
            Log.e("L.java print",msg[0]);
        }

    }
}

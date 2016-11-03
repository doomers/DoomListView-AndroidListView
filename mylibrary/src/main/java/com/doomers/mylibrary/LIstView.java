package com.doomers.mylibrary;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by doomers on 3/11/16.
 */
public class LIstView {
    private static LIstView ourInstance = new LIstView();

    public static LIstView getInstance() {
        return ourInstance;
    }

    private LIstView() {
    }


    public void showToast(Context context,String str){
        Toast.makeText(context,str,Toast.LENGTH_LONG);

    }
}

package com.example.lab06;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;

public class MySharedPreference {
    SharedPreferences settings;
    Editor editor;

    public MySharedPreference (Context context) {
        settings = context.getSharedPreferences("MyPref", 0); // 0 - for private mode
        editor = settings.edit();

    }

    public void save(String text){
        editor.putString("str1", text);
        editor.commit();
    }

    public String getValue(){
        return settings.getString("str1", null);
    }

    public void clearSharedPreferences(){
        editor.clear();
        editor.commit();
    }
}
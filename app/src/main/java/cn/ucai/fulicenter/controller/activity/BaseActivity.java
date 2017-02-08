package cn.ucai.fulicenter.controller.activity;

import android.support.v7.app.AppCompatActivity;

public class BaseActivity extends AppCompatActivity {
    public <T> T getViewById(int resId){
        return (T) findViewById(resId);
    }
}

package cn.ucai.fulicenter.controller.activity;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.View;

import cn.ucai.fulicenter.R;
import cn.ucai.fulicenter.controller.fragment.BoutiqueFragment;
import cn.ucai.fulicenter.controller.fragment.CategoryFragment;
import cn.ucai.fulicenter.controller.fragment.NewGoodsFragment;

public class MainActivity extends BaseActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setListener();

    }

    private void setListener() {
        findViewById(R.id.rb_new_good).setOnClickListener(this);
        findViewById(R.id.rb_boutique).setOnClickListener(this);
        findViewById(R.id.rb_category).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction ft = manager.beginTransaction();
        switch (v.getId()){
            case R.id.rb_new_good:
                ft.replace(R.id.layout_main_fragment,new NewGoodsFragment()).commit();
                break;
            case R.id.rb_boutique:
                ft.replace(R.id.layout_main_fragment,new BoutiqueFragment()).commit();
                break;
            case R.id.rb_category:
                ft.replace(R.id.layout_main_fragment,new CategoryFragment()).commit();
                break;
        }
    }
}

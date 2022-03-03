package com.example.scooperdemo;


import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTabHost;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.TabHost;
import android.widget.TextView;

import cn.scooper.sc_uni_app.view.base.BaseActivity;
import cn.scooper.sc_uni_app.view.contact.ContactFragment;
import cn.scooper.sc_uni_app.view.main.MoreFragment;
import cn.scooper.sc_uni_app.view.main.MsgFragment;
import cn.scooper.sc_uni_app.view.recent.RecentCallFragment;

public class SecondActivity2 extends BaseActivity {

    private FragmentTabHost fragmentTabHost;
    private String texts[] = {"消息", "拨号", "通讯录", "应急事件", "应急通讯", "更多"};
    private int imageButton[] = {
            R.drawable.e,
            R.drawable.f,
            R.drawable.b,
            R.drawable.c,
            R.drawable.d,
            R.drawable.a
    };

    private Class fragmentArray[] = {
            MsgFragment.class,
            RecentCallFragment.class,
            ContactFragment.class,
            FragmentEvent.class,
            FragmentContact.class,
            MoreFragment.class,
    };


    @Override
    public int getLayoutId() {
        return R.layout.activity_second2;
    }

    @Override
    public void initView() {
        RadioGroup mRadioGroup = findViewById(R.id.radio_group);
        final FragmentManager fragmentManager = getSupportFragmentManager();
        final FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.maincontent, MsgFragment.newInstance());
        transaction.commit();

        //RadioGroup的check事件，来实现Fragment的切换
        mRadioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                FragmentTransaction transaction = fragmentManager.beginTransaction();
                //根据RadioButton不同的Id来选中不同的Fragment。
                if (checkedId == R.id.btn_product_barcode) {
                    transaction.replace(R.id.maincontent, MsgFragment.newInstance());
                } else if (checkedId == R.id.btn_box) {
                    transaction.replace(R.id.maincontent,  RecentCallFragment.newInstance());
                } else if (checkedId == R.id.btn_tray) {
                    transaction.replace(R.id.maincontent, ContactFragment.newInstance());
                }
                transaction.commit();
            }
        });
    }

}
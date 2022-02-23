package com.example.scooperdemo;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;

import cn.scooper.sc_uni_app.view.base.BaseActivity;
import cn.scooper.sc_uni_app.view.contact.ContactFragment;
import cn.scooper.sc_uni_app.view.main.MoreFragment;
import cn.scooper.sc_uni_app.view.main.MsgFragment;
import cn.scooper.sc_uni_app.view.recent.RecentCallFragment;

/**
 * @author wuxingqi created on 2021/3/15
 */
public class TestActivity extends BaseActivity {
    private static final String TAG = TestActivity.class.getCanonicalName();

    public static final String EXTRA_FRAGMENT = TAG + ".EXTRA_FRAGMENT";
    public static final int FRAGMENT_MSG = 0;
    public static final int FRAGMENT_SIP = 1;
    public static final int FRAGMENT_CONTACT = 2;
    public static final int FRAGMENT_MORE = 3;

    @Override
    public int getLayoutId() {
        return R.layout.activity_test;
    }

    @Override
    public void initView() {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();

        Intent intent = getIntent();
        Fragment fragment = RecentCallFragment.newInstance();
        if (intent != null){
            int type = intent.getIntExtra(EXTRA_FRAGMENT,FRAGMENT_MSG);
            switch (type){
                case FRAGMENT_MSG:
                    fragment = MsgFragment.newInstance();
                    break;
                case FRAGMENT_SIP:
                    fragment = RecentCallFragment.newInstance();
                    break;
                case FRAGMENT_CONTACT:
                    fragment = ContactFragment.newInstance();
                    break;
                case FRAGMENT_MORE:
                    fragment = MoreFragment.newInstance();
                    break;
                default:
                    break;
            }
        }
        transaction.add(R.id.fl_test,fragment);
        transaction.show(fragment).commit();
    }
}

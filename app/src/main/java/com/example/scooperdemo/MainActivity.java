package com.example.scooperdemo;


import android.support.v4.app.FragmentTabHost;
import android.view.View;
import android.widget.ImageView;
import android.widget.TabHost;
import android.widget.TextView;

import cn.scooper.sc_uni_app.view.base.BaseActivity;
import cn.scooper.sc_uni_app.view.contact.ContactFragment;
import cn.scooper.sc_uni_app.view.main.MoreFragment;
import cn.scooper.sc_uni_app.view.main.MsgFragment;
import cn.scooper.sc_uni_app.view.recent.RecentCallFragment;

public class MainActivity extends BaseActivity {

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
        return R.layout.activity_main;
    }

    @Override
    public void initView() {
        // 实例化tabhost
        fragmentTabHost = (FragmentTabHost) findViewById(android.R.id.tabhost);
        fragmentTabHost.setup(this, getSupportFragmentManager(),
                R.id.maincontent);

        for (int i = 0; i < texts.length; i++) {
            TabHost.TabSpec spec = fragmentTabHost.newTabSpec(texts[i]).setIndicator(getView(i));

            fragmentTabHost.addTab(spec, fragmentArray[i], null);

            //设置背景(必须在addTab之后，由于需要子节点（底部菜单按钮）否则会出现空指针异常)
            fragmentTabHost.getTabWidget().getChildAt(i).setBackgroundResource(R.drawable.bt_selector);
        }
    }

    private View getView(int i) {
        //取得布局实例
        View view = View.inflate(MainActivity.this, R.layout.tabcontent, null);

        //取得布局对象
        ImageView imageView = (ImageView) view.findViewById(R.id.image);
        TextView textView = (TextView) view.findViewById(R.id.text);

        //设置图标
        imageView.setImageResource(imageButton[i]);
//        imageView.setImageResource(R.drawable.ic_launcher);
        //设置标题
        textView.setText(texts[i]);
        return view;
    }


}
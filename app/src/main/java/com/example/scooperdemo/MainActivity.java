package com.example.scooperdemo;


import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import cn.scooper.sc_uni_app.SipManager;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getCanonicalName();

    private EditText et_user,et_pwd;
    private Button btnLogin,btnGoMsg,btnGoSip,btnGoContact,btnGoMore,btn_logout;
    private Button btnGoTest;

    Handler mHandler = new Handler(Looper.getMainLooper());

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SipManager.getInstance().checkPermission(this);

        et_user=findViewById(R.id.et_user);
        et_pwd=findViewById(R.id.et_pwd);

        //登录
        btnLogin = findViewById(R.id.btn_login);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username=et_user.getText().toString();
                String pwd=et_pwd.getText().toString();
                Log.d("btnLogin","username="+username+","+pwd);
//                SipManager.getInstance().login(MainActivity.this,"122.224.180.122", "18020",username,"1234abcd");
//                SipManager.getInstance().login(MainActivity.this,"192.168.107.168", "8080","jx1","qwe123456");
                //192.168.107.168  8080  jx1/qwe123456
//                SipManager.getInstance().login(MainActivity.this, "124.161.95.203", "18080", "8506", "12345abc");//abc123123  Ncyjj@123!@##@!*

//                SipManager.getInstance().login(MainActivity.this, "39.107.94.125", "8080", "app3", "abc123");

                SipManager.getInstance().login(MainActivity.this, "219.150.33.166", "18080", "7003", "sstpc.2022");

                mHandler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Intent intent = new Intent(MainActivity.this,SecondActivity.class);
                        startActivity(intent);
                        finish();
                    }
                },2000);

            }
        });

        btn_logout = findViewById(R.id.btn_logout);
        btn_logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("btnLogin","btn_logout btn_logout=");
                SipManager.getInstance().logout();//destroyScSip();
                //Process.killProcess(Process.myPid());
                //finish();
            }
        });

        btnGoTest = findViewById(R.id.btn_goTest);
        btnGoTest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.e(TAG,"------跳转界面------");

                Intent intent = new Intent(MainActivity.this,SecondActivity.class);
                startActivity(intent);
            }
        });

        //跳转消息界面
        btnGoMsg = findViewById(R.id.btn_goMsg);
        btnGoMsg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.e(TAG,"------跳转消息界面------");

                Intent intent = new Intent(MainActivity.this,TestActivity.class);
                intent.putExtra(TestActivity.EXTRA_FRAGMENT,TestActivity.FRAGMENT_MSG);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
            }
        });

        //跳转电话界面
        btnGoSip = findViewById(R.id.btn_goSip);
        btnGoSip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.e(TAG,"------跳转电话界面------");

                Intent intent = new Intent(MainActivity.this,TestActivity.class);
                intent.putExtra(TestActivity.EXTRA_FRAGMENT,TestActivity.FRAGMENT_SIP);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
            }
        });

        //跳转通讯录界面
        btnGoContact = findViewById(R.id.btn_goContact);
        btnGoContact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.e(TAG,"------跳转通讯录界面------");

                SipManager.getInstance().updateContact();//通讯录更新，前提是已经登录了

                //跳转通讯录界面
                Intent intent = new Intent(MainActivity.this,TestActivity.class);
                intent.putExtra(TestActivity.EXTRA_FRAGMENT,TestActivity.FRAGMENT_CONTACT);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
            }
        });

        //跳转更多界面
        btnGoMore = findViewById(R.id.btn_goMore);
        btnGoMore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.e(TAG,"------跳转更多界面------");

                Intent intent = new Intent(MainActivity.this,TestActivity.class);
                intent.putExtra(TestActivity.EXTRA_FRAGMENT,TestActivity.FRAGMENT_MORE);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
            }
        });

        receiver = new BroadcastReceiver() {
            @Override
            public void onReceive(Context context, Intent intent) {
                if (intent.getAction().equals(SipManager.SC_UPDATE_MSG)) {

                    int cout = intent.getIntExtra(SipManager.SC_UPDATE_MSG_COUNT,0);
                    //cout即为未读消息数量
                }else if (intent.getAction().equals(SipManager.SC_LOGIN_OTHER)) {
                    Log.d(TAG,"SC_LOGIN_OTHER");//在别处登录的广播
                    SipManager.getInstance().logout();
                    //Process.killProcess(Process.myPid());
                }
            }
        };
        IntentFilter filter = new IntentFilter(SipManager.SC_UPDATE_MSG);
        filter.addAction(SipManager.SC_UPDATE_MSG);
        filter.addAction(SipManager.SC_LOGIN_OTHER);
        registerReceiver(receiver,filter);



        //初始化通讯录完成进入主页面
//        Intent intent = new Intent(sipManagerContext, SipMainActivity.class);
//        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK );
//        sipManagerContext.startActivity(intent);

    }

    BroadcastReceiver receiver;

    @Override
    protected void onDestroy() {
//        SipManager.getInstance().onDestroy();

        if(receiver!=null){
            unregisterReceiver(receiver);
        }

        super.onDestroy();
    }

    @Override
    protected void onResume() {
        super.onResume();
        SipManager.getInstance().loadMsg();
    }
}
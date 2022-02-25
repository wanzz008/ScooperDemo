package com.example.scooperdemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import cn.scooper.sc_uni_app.view.base.BaseActivity;
import cn.scooper.sc_uni_app.view.contact.ContactFragment;
import cn.scooper.sc_uni_app.view.main.MoreFragment;
import cn.scooper.sc_uni_app.view.main.MsgFragment;
import cn.scooper.sc_uni_app.view.recent.RecentCallFragment;

public class FragmentPage1 extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater,
                             @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment, null);
    }

}
package com.example.scooperdemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;

import com.example.scooperdemo.adapter.MSDSAdapter;
import com.example.scooperdemo.bean.EventResponse;

import java.util.ArrayList;

/**
 * MSDS
 */
public class ActivityMSDS extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_msds);
        findViewById(R.id.iv_back).setOnClickListener(view -> finish());
        RecyclerView rvMSDS = (RecyclerView) findViewById(R.id.rv_msds);

        ArrayList<EventResponse.ContentBean.MsdsListBean> msdsList =
                (ArrayList<EventResponse.ContentBean.MsdsListBean>) getIntent().getSerializableExtra("msdsList");

        MSDSAdapter adapter = new MSDSAdapter(this, R.layout.item_msds,
                msdsList == null ? new ArrayList<>() : msdsList);
        rvMSDS.setAdapter(adapter);

    }
}

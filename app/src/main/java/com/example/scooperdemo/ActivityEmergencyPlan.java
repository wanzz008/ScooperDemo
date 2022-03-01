package com.example.scooperdemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;

import com.example.scooperdemo.adapter.PlanAdapter;
import com.example.scooperdemo.bean.EventResponse;

import java.util.ArrayList;

/**
 * 应急预案
 */
public class ActivityEmergencyPlan extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emergency_plan);
        findViewById(R.id.iv_back).setOnClickListener(view -> finish());
        ArrayList<EventResponse.ContentBean.TypicalCasesListBean> list =
                (ArrayList<EventResponse.ContentBean.TypicalCasesListBean>) getIntent().getSerializableExtra("typicalCasesList");
        RecyclerView rvPlan = (RecyclerView) findViewById(R.id.rv_plan);
        PlanAdapter adapter = new PlanAdapter(this, R.layout.item_emergency_plan,
                list == null ? new ArrayList<>() : list);
        rvPlan.setAdapter(adapter);
    }
}

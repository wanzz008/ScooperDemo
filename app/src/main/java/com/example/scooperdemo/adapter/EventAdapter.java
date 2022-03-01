package com.example.scooperdemo.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.View;

import com.example.scooperdemo.ActivityEmergencyPlan;
import com.example.scooperdemo.ActivityMSDS;
import com.example.scooperdemo.R;
import com.example.scooperdemo.bean.EventResponse;
import com.zhy.adapter.recyclerview.CommonAdapter;
import com.zhy.adapter.recyclerview.base.ViewHolder;

import java.text.SimpleDateFormat;
import java.util.List;

public class EventAdapter extends CommonAdapter<EventResponse.ContentBean> {
    private Context context;
    private SimpleDateFormat sdf;

    public EventAdapter(Context context, int layoutId, List<EventResponse.ContentBean> datas) {
        super(context, layoutId, datas);
        this.context = context;
        sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    }

    @Override
    protected void convert(ViewHolder holder, EventResponse.ContentBean bean, int position) {
        holder.setText(R.id.tvTime, sdf.format(bean.getDateCreated()))
                .setText(R.id.tvAddress, bean.getArea())
                .setText(R.id.tvType, bean.getMonitoringType())
                .setText(R.id.tvDesc, bean.getValue())
                .setText(R.id.tvStatus, bean.getState())
                .setOnClickListener(R.id.tvMSDS, view -> {
                    Intent intent = new Intent(context, ActivityMSDS.class);
                    intent.putExtra("msdsList", bean.getMsdsList());
                    context.startActivity(intent);
                })
                .setOnClickListener(R.id.tvPlan, view -> {
                    Intent intent = new Intent(context, ActivityEmergencyPlan.class);
                    intent.putExtra("typicalCasesList", bean.getTypicalCasesList() );
                    context.startActivity(intent);
                });
    }
}

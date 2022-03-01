package com.example.scooperdemo.adapter;

import android.content.Context;

import com.example.scooperdemo.R;
import com.example.scooperdemo.bean.EventResponse;
import com.zhy.adapter.recyclerview.CommonAdapter;
import com.zhy.adapter.recyclerview.base.ViewHolder;

import java.util.ArrayList;
import java.util.List;

public class PlanAdapter extends CommonAdapter<EventResponse.ContentBean.TypicalCasesListBean> {

    public PlanAdapter(Context context, int layoutId, ArrayList<EventResponse.ContentBean.TypicalCasesListBean> datas) {
        super(context, layoutId, datas);
    }

    @Override
    protected void convert(ViewHolder holder, EventResponse.ContentBean.TypicalCasesListBean bean, int position) {
        holder.setText(R.id.tvPlanName, bean.getCaseName())
                .setText(R.id.tvKeyword, bean.getKeywords())
                .setText(R.id.tvKeytype, bean.getType());
    }
}

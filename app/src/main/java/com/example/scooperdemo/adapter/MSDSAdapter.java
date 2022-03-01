package com.example.scooperdemo.adapter;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;

import com.example.scooperdemo.R;
import com.example.scooperdemo.bean.EventResponse;
import com.zhy.adapter.recyclerview.CommonAdapter;
import com.zhy.adapter.recyclerview.base.ViewHolder;

import java.util.List;

public class MSDSAdapter extends CommonAdapter<EventResponse.ContentBean.MsdsListBean> {

    public MSDSAdapter(Context context, int layoutId, List<EventResponse.ContentBean.MsdsListBean> datas) {
        super(context, layoutId, datas);
    }

    @Override
    protected void convert(ViewHolder holder, EventResponse.ContentBean.MsdsListBean msdsListBean, int position) {
        View llMore = holder.getView(R.id.ll_more);
        ImageView arrow = holder.getView(R.id.ivArrow);
        holder.setText(R.id.tvChemicalName, msdsListBean.getChemistryTagTitileCn()) // 化学品
                .setText(R.id.tvCAS, msdsListBean.getCasNumber()) // CAS
                .setText(R.id.mainApplication, msdsListBean.getMainApplication()) // 主要用途
                .setText(R.id.healthRisk, msdsListBean.getHealthRisk()) // 健康危害
                .setText(R.id.healthRisk2, msdsListBean.getHealthRisk()) // 特别提示
                .setText(R.id.physicochemicalProperty, msdsListBean.getPhysicochemicalProperty()) // 理化特性
                .setText(R.id.riskCodes, msdsListBean.getRiskCodes()) // 危险性描述
                .setOnClickListener(R.id.llTitle, view -> {
                    boolean expand = msdsListBean.isExpand();
                    llMore.setVisibility(expand ? View.GONE : View.VISIBLE);
                    arrow.setImageResource(expand ? R.mipmap.ic_sanjiao_bottom : R.mipmap.ic_sanjiao_top);
                    msdsListBean.setExpand(!expand);
                });
    }
}

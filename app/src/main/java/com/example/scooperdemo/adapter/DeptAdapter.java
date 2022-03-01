package com.example.scooperdemo.adapter;

import android.content.Context;
import android.graphics.Color;

import com.example.scooperdemo.R;
import com.zhy.adapter.recyclerview.CommonAdapter;
import com.zhy.adapter.recyclerview.base.ViewHolder;

import java.util.List;

public class DeptAdapter extends CommonAdapter<String> {
    private int selectIndex = 0;

    public DeptAdapter(Context context, int layoutId, List<String> datas) {
        super(context, layoutId, datas);
    }

    @Override
    protected void convert(ViewHolder holder, String s, int position) {
        holder.setText(R.id.tvDeptName, s)
                .setTextColor(R.id.tvDeptName,
                        selectIndex == position ? Color.parseColor("#0169EA") :
                                Color.parseColor("#333333"));
    }


    public void setSelectIndex(int selectIndex) {
        this.selectIndex = selectIndex;
        notifyDataSetChanged();
    }
}

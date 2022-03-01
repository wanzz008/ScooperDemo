package com.example.scooperdemo.adapter;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;

import com.example.scooperdemo.R;
import com.example.scooperdemo.bean.ContactResponse;
import com.zhy.adapter.recyclerview.CommonAdapter;
import com.zhy.adapter.recyclerview.base.ViewHolder;

import java.util.List;

public class ContactAdapter extends CommonAdapter<ContactResponse.ContentBean> {
    private Context context;

    public ContactAdapter(Context context, int layoutId, List<ContactResponse.ContentBean> datas) {
        super(context, layoutId, datas);
        this.context = context;
    }

    @Override
    protected void convert(ViewHolder holder, ContactResponse.ContentBean contentBean, int position) {
        String phone = contentBean.getPhone();
        holder.setText(R.id.tvUserName, contentBean.getUserName())
                .setText(R.id.tvPhone, phone)
                .setOnClickListener(R.id.ivCall, view -> {
                    if (phone != null && !phone.isEmpty()) {
                        Intent intent = new Intent(Intent.ACTION_CALL,
                                Uri.parse("tel:" + phone));
                        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        context.startActivity(intent);
                    }
                });

    }
}

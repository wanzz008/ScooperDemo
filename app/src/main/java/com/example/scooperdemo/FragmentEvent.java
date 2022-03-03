package com.example.scooperdemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.scooperdemo.adapter.EventAdapter;
import com.example.scooperdemo.bean.EventResponse;
import com.example.scooperdemo.http.RequestUtils;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * 应急事件
 */
public class FragmentEvent extends Fragment {

    private View view;
    private EventAdapter eventAdapter;
    private ArrayList<EventResponse.ContentBean> datas;

    @Override
    public View onCreateView(LayoutInflater inflater,
                             @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_event, null);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        RecyclerView rvEvent = view.findViewById(R.id.rv_event);
        datas = new ArrayList<>();
        eventAdapter = new EventAdapter(getContext(), R.layout.item_emergency_event, datas);
        rvEvent.setAdapter(eventAdapter);
        initData();
    }

    private void initData() {
        RequestUtils.getAlarmInfo(new Callback<EventResponse>() {
            @Override
            public void onResponse(Call<EventResponse> call, Response<EventResponse> response) {
                EventResponse body = response.body();
                if (body != null ){
                    List<EventResponse.ContentBean> content = body.getContent();
                    if (content != null) {
                        datas.addAll(content);
                        eventAdapter.notifyDataSetChanged();
                    }
                }else {
                    Toast.makeText(getContext(), "数据返回有误 code:" + response.code(), Toast.LENGTH_SHORT).show();
                }

            }

            @Override
            public void onFailure(Call<EventResponse> call, Throwable t) {

            }
        });
    }
}

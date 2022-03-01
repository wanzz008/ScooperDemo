package com.example.scooperdemo.http;

import com.example.scooperdemo.bean.ContactResponse;
import com.example.scooperdemo.bean.EventResponse;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface RequestService {

    @POST("sstpc/alarmInfo/searchDto")
    Call<EventResponse> getAlarmInfo(@Body Object jsonBody);

    @POST("sstpc/ertBook/searchDto")
    Call<ContactResponse> getBook(@Body Object jsonBody);

}

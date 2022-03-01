package com.example.scooperdemo.http;

import com.example.scooperdemo.bean.ContactResponse;
import com.example.scooperdemo.bean.EventResponse;

import retrofit2.Call;
import retrofit2.Callback;

public class RequestUtils {

    public static void getAlarmInfo(Callback<EventResponse> callBack) {
        RequestService service = BaseRequestService.getRequestService().create(RequestService.class);
        Call<EventResponse> call = service.getAlarmInfo(new Object());
        call.enqueue(callBack);
    }

    public static void getBook(Callback<ContactResponse> callBack) {
        RequestService service = BaseRequestService.getRequestService().create(RequestService.class);
        Call<ContactResponse> call = service.getBook(new Object());
        call.enqueue(callBack);
    }
}

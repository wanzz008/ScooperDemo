package com.example.scooperdemo.http;

import java.io.IOException;
import java.util.Date;

import okhttp3.Interceptor;
import okhttp3.Request;

public class MyInterceptor implements Interceptor {
    private static final String TAG = MyInterceptor.class.getSimpleName();

    private MyInterceptor() {
    }

    private static MyInterceptor instance;

    public static MyInterceptor getInstance() {
        if (instance == null) {
            synchronized (MyInterceptor.class) {
                instance = new MyInterceptor();
            }
        }
        return instance;
    }

    private String auth;

    public void setAuth(String auth) {
        this.auth = auth;
    }

    @Override
    public okhttp3.Response intercept(Chain chain) throws IOException {
        long timeMillis = System.currentTimeMillis();
        Request originalRequest = chain.request();
        Request.Builder builder = originalRequest.newBuilder();
        builder.addHeader("Content-Type", "application/json;charset=UTF-8")
//                .addHeader("Authorization", TextUtils.isEmpty(auth) ? AppMgr.getRequestAuth(timeMillis) : auth)
                .addHeader("Date", new Date(timeMillis).toGMTString())
                .addHeader("Connection", "close");

        return chain.proceed(builder.build());
    }
}
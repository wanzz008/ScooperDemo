package com.example.scooperdemo.http;

import android.text.TextUtils;
import android.util.Log;

import java.util.concurrent.TimeUnit;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class BaseRequestService {
    private static final String TAG = BaseRequestService.class.getSimpleName();
    private static HttpLoggingInterceptor httpLoggingInterceptor = null;

    private static Retrofit mRetrofit;

    static {
        httpLoggingInterceptor = new HttpLoggingInterceptor(new HttpLoggingInterceptor.Logger() {
            @Override
            public void log(String message) {
                Log.d(TAG, "[getRequestService][log] message " + message);
            }
        });
        httpLoggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
    }

    public static Retrofit getRequestService() {
        if (TextUtils.isEmpty(BaseConfig.BASE_URL)) return null;
        if (mRetrofit == null) {
            OkHttpClient.Builder builder = new OkHttpClient.Builder();
            builder.addInterceptor(MyInterceptor.getInstance());
            builder.addInterceptor(httpLoggingInterceptor);
            builder.connectTimeout(60, TimeUnit.SECONDS);

            mRetrofit = new Retrofit.Builder().client(builder.build())
                    .baseUrl(BaseConfig.BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                    .build();
        }
        return mRetrofit;
    }
}

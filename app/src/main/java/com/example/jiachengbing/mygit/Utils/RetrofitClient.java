package com.example.jiachengbing.mygit.Utils;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by jiachengbing on 2017/12/26.
 */

public class RetrofitClient {
    private static RetrofitClient retrofitClient;
    private final OkHttpClient client;
    private RetrofitClient(){
        client=new OkHttpClient.Builder()
                .readTimeout(5, TimeUnit.SECONDS)
                .connectTimeout(5,TimeUnit.SECONDS)
                .build();
    }
    public static RetrofitClient getInstance(){
        if (retrofitClient==null){
            synchronized (RetrofitClient.class){
                if (retrofitClient==null){
                    retrofitClient=new RetrofitClient();
                }

            }


        }
        return  retrofitClient;
    }
    public ApiSerVice getData(){
        Retrofit retrofit=new Retrofit.Builder()
                .client(client)
                .baseUrl(ApiSerVice.BASEUAL)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();


        return null;
    }

}

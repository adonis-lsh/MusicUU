package com.lsh.musicuu.mvp.data.net.interceptor;

import java.io.IOException;

import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Created by "小灰灰"
 * on 15/2/2017 14:19
 * 邮箱：www.adonis_lsh.com
 */

public class CommonInterceptor implements Interceptor {
    private final String TOKENKEY = "2A4FD6DD-873F-4C4D-8FFF-A972D6683D97";

    @Override
    public Response intercept(Chain chain) throws IOException {
//        Request request = chain.request();
//        request.newBuilder().addHeader("tokenkey", "2A4FD6DD-873F-4C4D-8FFF-A972D6683D97").build();
        Request oldRequest = chain.request();

        // 添加新的参数
        HttpUrl.Builder authorizedUrlBuilder = oldRequest.url()
                .newBuilder()
                .host(oldRequest.url().host())
                .addQueryParameter("tokenkey", "2A4FD6DD-873F-4C4D-8FFF-A972D6683D97");

        // 新的请求
        Request newRequest = oldRequest.newBuilder()
                .method(oldRequest.method(), oldRequest.body())
                .url(authorizedUrlBuilder.build())
                .build();

        return chain.proceed(newRequest);
    }
}

package com.lsh.musicuu.di.modules;

import com.lsh.musicuu.mvp.data.net.interceptor.CommonInterceptor;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;

/**
 * Created by "小灰灰"
 * on 22/2/2017 14:30
 * 邮箱：www.adonis_lsh.com
 */
@Module
public class GlobeParameterModule {
    @Singleton
    @Provides
    public HttpUrl provideBaseUrl() {
        return HttpUrl.parse("http://openapi.financeun.com/");
    }

    @Singleton
    @Provides
    public List<Interceptor> provideInterceptor() {
        List<Interceptor> interceptors = new ArrayList<>();
        interceptors.add(new CommonInterceptor());
        return interceptors;
    }
}

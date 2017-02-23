package com.lsh.musicuu.mvp.data.net;

import com.lsh.musicuu.mvp.data.net.model.RegisterBean;

import javax.inject.Inject;

import io.reactivex.Observable;
import retrofit2.Retrofit;
import retrofit2.http.Query;

/**
 * Created by "小灰灰"
 * on 22/2/2017 16:37
 * 邮箱：www.adonis_lsh.com
 */

public class ApiHelper implements IApiHelper {
    private Retrofit mRetrofit;

    @Inject
    public ApiHelper(Retrofit retrofit) {
        mRetrofit = retrofit;
    }

    @Override
    public Observable<RegisterBean> register(@Query("userName") String name, @Query("passWord") String passWord) {
        return mRetrofit.create(IApiHelper.class).register(name,passWord);
    }
}

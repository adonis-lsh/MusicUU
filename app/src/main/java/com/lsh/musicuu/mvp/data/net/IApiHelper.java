package com.lsh.musicuu.mvp.data.net;

import com.lsh.musicuu.mvp.data.net.model.RegisterBean;

import io.reactivex.Observable;
import retrofit2.http.POST;
import retrofit2.http.Query;

/**
 * Created by "小灰灰"
 * on 21/2/2017 17:12
 * 邮箱：www.adonis_lsh.com
 */

public interface IApiHelper {
    @POST("User/Regist")
    Observable<RegisterBean> register(@Query("userName") String name,@Query("passWord") String passWord);
}

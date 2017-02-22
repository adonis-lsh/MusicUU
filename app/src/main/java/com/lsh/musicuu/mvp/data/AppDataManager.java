package com.lsh.musicuu.mvp.data;

import android.content.Context;

import com.lsh.musicuu.di.scopes.ApplicationContext;
import com.lsh.musicuu.mvp.data.db.IDbHelper;
import com.lsh.musicuu.mvp.data.file.IFileHelper;
import com.lsh.musicuu.mvp.data.net.IApiHelper;
import com.lsh.musicuu.mvp.data.net.model.RegisterBean;

import javax.inject.Inject;
import javax.inject.Singleton;

import io.reactivex.Observable;
import retrofit2.Retrofit;
import retrofit2.http.Query;

/**
 * Created by "小灰灰"
 * on 22/2/2017 16:27
 * 邮箱：www.adonis_lsh.com
 */

@Singleton
public class AppDataManager implements DataManager {
    private final Context mContext;
    private Retrofit mRetrofit;
    private final IDbHelper mIDbHelper;
    private final IFileHelper mIFileHelper;
    private final IApiHelper mIApiHelper;

    @Inject
    public AppDataManager(@ApplicationContext Context context, Retrofit retrofit,IDbHelper IDbHelper, IFileHelper IFileHelper, IApiHelper IApiHelper) {
        mContext = context;
        mRetrofit = retrofit;
        mIDbHelper = IDbHelper;
        mIFileHelper = IFileHelper;
        mIApiHelper = IApiHelper;
    }


    @Override
    public Observable<RegisterBean> register(@Query("userName") String name, @Query("passWord") String passWord) {
        return mIApiHelper.register(name,passWord);
    }
}

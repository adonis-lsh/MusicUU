package com.lsh.musicuu.di.modules;

import android.app.Application;
import android.content.Context;

import com.lsh.musicuu.di.scopes.ApplicationContext;
import com.lsh.musicuu.mvp.data.AppDataManager;
import com.lsh.musicuu.mvp.data.DataManager;
import com.lsh.musicuu.mvp.data.db.DbHelper;
import com.lsh.musicuu.mvp.data.db.IDbHelper;
import com.lsh.musicuu.mvp.data.file.FileHelper;
import com.lsh.musicuu.mvp.data.file.IFileHelper;
import com.lsh.musicuu.mvp.data.net.ApiHelper;
import com.lsh.musicuu.mvp.data.net.IApiHelper;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by "小灰灰"
 * on 21/2/2017 17:30
 * 邮箱：www.adonis_lsh.com
 */
@Module
public class AppModule {
    private Application mApplication;

    public AppModule(Application application) {
        mApplication = application;
    }


    @Provides
    @ApplicationContext
    public Context provideContext() {
        return mApplication;
    }

    @Provides
    public Application provideApplication() {
        return mApplication;
    }


    @Provides
    @Singleton
    public DataManager provideDataManager(AppDataManager appDataManager) {
        return appDataManager;
    }

    @Provides
    @Singleton
    public IDbHelper provideIDbHelper(DbHelper dbHelper) {
        return dbHelper;
    }

    @Provides
    @Singleton
    public IFileHelper provideIFileHelper(FileHelper fileHelper) {
        return fileHelper;
    }

    @Singleton
    @Provides
    public IApiHelper provideIApiHelper(ApiHelper apiHelper) {
        return apiHelper;
    }
}

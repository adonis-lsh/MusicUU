package com.lsh.musicuu.di.modules;

import android.app.Application;
import android.content.Context;

import com.lsh.musicuu.di.scopes.ApplicationContext;
import com.lsh.musicuu.mvp.data.AppDataManager;
import com.lsh.musicuu.mvp.data.DataManager;

import dagger.Module;
import dagger.Provides;
import io.reactivex.disposables.CompositeDisposable;

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
    public CompositeDisposable provideCompositeDisposable() {
        return new CompositeDisposable();
    }

    @Provides
    public DataManager provideDataManager(AppDataManager appDataManager) {
        return appDataManager;
    }
}

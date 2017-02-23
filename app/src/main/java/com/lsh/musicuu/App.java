package com.lsh.musicuu;

import android.app.Application;

import com.facebook.drawee.backends.pipeline.Fresco;
import com.lsh.musicuu.di.components.AppComponent;
import com.lsh.musicuu.di.components.DaggerAppComponent;
import com.lsh.musicuu.di.modules.AppModule;
import com.lsh.musicuu.mvp.data.DataManager;

import javax.inject.Inject;

/**
 * Created by "小灰灰"
 * on 21/2/2017 17:18
 * 邮箱：www.adonis_lsh.com
 */

public class App extends Application {

    @Inject
    DataManager mDataManager;

    private AppComponent mAppComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        mAppComponent = DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .build();

        mAppComponent.inject(this);

        Fresco.initialize(this);
    }

    public AppComponent getAppComponent() {
        return mAppComponent;
    }
}

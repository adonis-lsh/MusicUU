package com.lsh.musicuu.mvp.base;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.lsh.musicuu.App;
import com.lsh.musicuu.di.components.ActivityComponent;
import com.lsh.musicuu.di.components.DaggerActivityComponent;
import com.lsh.musicuu.di.modules.ActivityModule;
import com.zhy.autolayout.AutoLayoutActivity;

/**
 * Created by "小灰灰"
 * on 22/2/2017 15:16
 * 邮箱：www.adonis_lsh.com
 */

public abstract class BaseActivity extends AutoLayoutActivity implements IBaseView{

    private ActivityComponent mActivityComponent;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mActivityComponent = DaggerActivityComponent.builder()
                .activityModule(new ActivityModule(this))
                .appComponent(((App) getApplication()).getAppComponent())
                .build();
    }

    public ActivityComponent getActivityComponent() {
        return mActivityComponent;
    }
}

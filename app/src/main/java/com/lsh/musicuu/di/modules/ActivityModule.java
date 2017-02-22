package com.lsh.musicuu.di.modules;

import android.app.Activity;
import android.content.Context;

import com.lsh.musicuu.di.scopes.PerActivity;
import com.lsh.musicuu.mvp.ui.login.LoginContract;
import com.lsh.musicuu.mvp.ui.login.LoginPresenter;

import dagger.Module;
import dagger.Provides;

/**
 * Created by "小灰灰"
 * on 22/2/2017 14:48
 * 邮箱：www.adonis_lsh.com
 */
@Module
public class ActivityModule {
    private Activity mActivity;

    public ActivityModule(Activity activity) {
        mActivity = activity;
    }

    @Provides
    @PerActivity
    public Context provideContext() {
        return mActivity;
    }

    @Provides
    @PerActivity
    public Activity provideActivity() {
        return mActivity;
    }

    @PerActivity
    @Provides
    public LoginContract.ILoginPresenter<LoginContract.IView> provideLoginPresenter(LoginPresenter<LoginContract
            .IView> loginPresenter) {
        return loginPresenter;
    }

}

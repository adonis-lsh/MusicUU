package com.lsh.musicuu.di.components;

import com.lsh.musicuu.di.modules.ActivityModule;
import com.lsh.musicuu.di.scopes.PerActivity;
import com.lsh.musicuu.mvp.ui.login.LoginActivity;

import dagger.Component;

/**
 * Created by "小灰灰"
 * on 22/2/2017 14:48
 * 邮箱：www.adonis_lsh.com
 */
@PerActivity
@Component(modules = ActivityModule.class,dependencies = AppComponent.class)
public interface ActivityComponent {
    void inject(LoginActivity loginActivity);
}

package com.lsh.musicuu.di.components;

import android.app.Application;
import android.content.Context;

import com.lsh.musicuu.App;
import com.lsh.musicuu.di.modules.AppModule;
import com.lsh.musicuu.di.modules.ClientModule;
import com.lsh.musicuu.di.modules.GlobeParameterModule;
import com.lsh.musicuu.di.scopes.ApplicationContext;

import javax.inject.Singleton;

import dagger.Component;


/**
 * Created by "小灰灰"
 * on 21/2/2017 17:19
 * 邮箱：www.adonis_lsh.com
 */

@Singleton
@Component(modules = {AppModule.class, ClientModule.class, GlobeParameterModule.class})
public interface AppComponent {
    void inject(App app);

    @ApplicationContext
    Context context();

    Application application();
}

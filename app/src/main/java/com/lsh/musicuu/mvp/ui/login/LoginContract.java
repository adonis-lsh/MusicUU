package com.lsh.musicuu.mvp.ui.login;

import com.lsh.musicuu.di.scopes.PerActivity;
import com.lsh.musicuu.mvp.base.IBasePresenter;
import com.lsh.musicuu.mvp.base.IBaseView;

/**
 * Created by "小灰灰"
 * on 22/2/2017 15:15
 * 邮箱：www.adonis_lsh.com
 */

public interface LoginContract {
    @PerActivity
    interface ILoginPresenter<V extends IView> extends IBasePresenter<V> {

    }

    interface IView extends IBaseView {
    }
}

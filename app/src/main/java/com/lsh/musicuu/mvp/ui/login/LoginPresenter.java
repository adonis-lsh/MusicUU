package com.lsh.musicuu.mvp.ui.login;

import com.lsh.musicuu.mvp.base.BasePresenter;
import com.lsh.musicuu.mvp.data.DataManager;

import javax.inject.Inject;

import io.reactivex.disposables.CompositeDisposable;

/**
 * Created by "小灰灰"
 * on 22/2/2017 14:56
 * 邮箱：www.adonis_lsh.com
 */

public class LoginPresenter<V extends LoginContract.IView> extends BasePresenter<V> implements LoginContract
        .ILoginPresenter<V> {

    @Inject
    public LoginPresenter(DataManager dataManager, CompositeDisposable compositeDisposable) {
        super(dataManager, compositeDisposable);
    }
}

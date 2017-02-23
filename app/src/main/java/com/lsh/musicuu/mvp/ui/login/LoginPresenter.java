package com.lsh.musicuu.mvp.ui.login;

import android.util.Log;

import com.lsh.musicuu.mvp.base.BasePresenter;
import com.lsh.musicuu.mvp.data.DataManager;
import com.lsh.musicuu.mvp.data.net.model.RegisterBean;
import com.lsh.musicuu.mvp.data.net.model.User;

import javax.inject.Inject;

import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

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

    @Override
    public void doRegisterUser(User user) {
        getDataManager().register(user.name.get(), user.passWord.get())
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<RegisterBean>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(RegisterBean value) {
                        Log.e("111111111", value.data.toString());
                        V view = getView();


                        getView().showToast();
                    }

                    @Override
                    public void onError(Throwable e) {
                        Log.e("111111111", "哈哈哈哈哈哈");
                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }
}

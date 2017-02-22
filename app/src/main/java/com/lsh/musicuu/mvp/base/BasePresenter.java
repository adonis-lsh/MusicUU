package com.lsh.musicuu.mvp.base;

import com.lsh.musicuu.mvp.data.DataManager;

import javax.inject.Inject;

import io.reactivex.disposables.CompositeDisposable;

/**
 * Created by "小灰灰"
 * on 22/2/2017 15:29
 * 邮箱：www.adonis_lsh.com
 */

public class BasePresenter<T extends IBaseView> implements IBasePresenter<T> {

    private final DataManager mDataManager;
    private final CompositeDisposable mCompositeDisposable;
    private T mView;

    @Inject
    public BasePresenter(DataManager dataManager,CompositeDisposable compositeDisposable) {
        mDataManager = dataManager;
        mCompositeDisposable = compositeDisposable;
    }

    @Override
    public void onAttach(T view) {
        mView = view;
    }

    @Override
    public void deAttach() {

    }

    public T getView() {
        return mView;
    }

    public DataManager getDataManager() {
        return mDataManager;
    }

    public CompositeDisposable getCompositeDisposable() {
        return mCompositeDisposable;
    }
}

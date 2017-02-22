package com.lsh.musicuu.mvp.ui.login;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.lsh.musicuu.mvp.base.BaseActivity;

import javax.inject.Inject;

public class LoginActivity extends BaseActivity implements LoginContract.IView {

    @Inject
    LoginPresenter<LoginContract.IView> mPresenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getActivityComponent().inject(this);
    }
}

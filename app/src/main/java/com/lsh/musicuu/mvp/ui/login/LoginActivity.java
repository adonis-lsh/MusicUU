package com.lsh.musicuu.mvp.ui.login;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.Toast;

import com.lsh.musicuu.R;
import com.lsh.musicuu.databinding.ActivityLoginBinding;
import com.lsh.musicuu.mvp.base.BaseActivity;
import com.lsh.musicuu.mvp.data.net.model.User;

import javax.inject.Inject;

public class LoginActivity extends BaseActivity implements LoginContract.IView {

    @Inject
    LoginContract.ILoginPresenter<LoginContract.IView> mPresenter;
    private ActivityLoginBinding mBinding;
    private User mUser;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_login);
        mBinding.setIView(this);
        mUser = new User();
        mBinding.setUser(mUser);
        getActivityComponent().inject(this);
        mPresenter.onAttach(this);
    }

    @Override
    public void registerUser() {
        mPresenter.doRegisterUser(mUser);
    }

    @Override
    public void showToast() {
        Toast.makeText(this, "登录成功", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mPresenter.deAttach();
    }
}

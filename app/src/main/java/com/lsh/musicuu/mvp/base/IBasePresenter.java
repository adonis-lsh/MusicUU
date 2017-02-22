package com.lsh.musicuu.mvp.base;

/**
 * Created by "小灰灰"
 * on 22/2/2017 15:17
 * 邮箱：www.adonis_lsh.com
 */

public interface IBasePresenter<T extends IBaseView> {
    void onAttach(T view);

    void deAttach();
}

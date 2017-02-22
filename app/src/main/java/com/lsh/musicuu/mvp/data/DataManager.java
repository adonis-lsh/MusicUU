package com.lsh.musicuu.mvp.data;

import com.lsh.musicuu.mvp.data.db.IDbHelper;
import com.lsh.musicuu.mvp.data.file.IFileHelper;
import com.lsh.musicuu.mvp.data.net.IApiHelper;

/**
 * Created by "小灰灰"
 * on 21/2/2017 17:13
 * 邮箱：www.adonis_lsh.com
 */

public interface DataManager extends IDbHelper,IFileHelper,IApiHelper {
}

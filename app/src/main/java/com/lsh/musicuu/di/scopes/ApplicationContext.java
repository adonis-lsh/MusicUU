package com.lsh.musicuu.di.scopes;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Qualifier;

/**
 * Created by "小灰灰"
 * on 22/2/2017 10:58
 * 邮箱：www.adonis_lsh.com
 */
//限定符就是一个标记,用来做标记的而已
@Qualifier
@Retention(RetentionPolicy.RUNTIME)
public @interface ApplicationContext {

}

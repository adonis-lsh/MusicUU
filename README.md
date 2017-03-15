# MusicUU
这是一款可以免费听音乐,下载音乐和MV的开源软件,本软件所有的数据均来自网络,本软件仅供交流


## 注意
在最新的AS2.3版本中,默认使用的是classpath 'com.android.tools.build:gradle:2.2.3'和apt1.8有冲突,Dragger2将报错,所以请降级到2.2.0一下,有人已经向谷歌提交bug,估计很快就会解决.

## 采用主流的MVP+Dragger2+retrofit+Rxjava+Databing的主流框架
- 每天我都会抽出一些时间来完善这个项目,把主流的一些东西都给加入进入,预计两个月时间完成
- [http://www.bendaidai.top](http://www.bendaidai.top)  本人的博客,欢迎骚扰

## 配置gradle
1. 为统一管理现在版本库中的各种依赖的第三方版本,所以我们应该学谷歌官方给我们的[例子](https://github.com/googlesamples/android-architecture)那样,统一管理
2. 在project的gradle中我们这样写![](http://img.blog.csdn.net/20170222110057058?watermark/2/text/aHR0cDovL2Jsb2cuY3Nkbi5uZXQvdTAxMDQwNzIyMA==/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70/gravity/SouthEast)
3. 然后再app的gradle中我们就可以引用工程里面的版本号,并且这还有一个好处就是,在我们项目中引入其他库的时候,我们可以很方便的统一版本![](http://img.blog.csdn.net/20170222110209989?watermark/2/text/aHR0cDovL2Jsb2cuY3Nkbi5uZXQvdTAxMDQwNzIyMA==/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70/gravity/SouthEast)
4. 需要注意的是,dependencies这里面引用的内容需要用""双引号
5. 有可能出现的问题: ![](http://img.blog.csdn.net/20170223113225950?watermark/2/text/aHR0cDovL2Jsb2cuY3Nkbi5uZXQvdTAxMDQwNzIyMA==/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70/gravity/SouthEast)


	解决方法如下:![](http://img.blog.csdn.net/20170223113922553?watermark/2/text/aHR0cDovL2Jsb2cuY3Nkbi5uZXQvdTAxMDQwNzIyMA==/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70/gravity/SouthEast)

	上面是一比较正规的解决方案,我直接把他们给注释了,因为我不经常用单元测试,出问题的话我就直接debug调试


## 搭框架
1. 先来一个框架图:说明数据的流向![](http://img.blog.csdn.net/20170224101642925?watermark/2/text/aHR0cDovL2Jsb2cuY3Nkbi5uZXQvdTAxMDQwNzIyMA==/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70/gravity/SouthEast)
2. UML类图展示:![](http://img.blog.csdn.net/20170224141003201?watermark/2/text/aHR0cDovL2Jsb2cuY3Nkbi5uZXQvdTAxMDQwNzIyMA==/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70/gravity/SouthEast)






## 建包
![](http://i.imgur.com/zSGYaZC.png)



## 颜色处理
 1. 4.4以上,我们可以使用沉浸试状态栏了,可以对状态栏设置透明或者半透明,5.0以上我们可以对状态栏直接设置颜色,但是不幸的是4.4之前就没有有关状态栏操作的有关的api,有关于内容可以看[官网介绍][1],以及[官网的demo][2],[视频介绍][3].
 2. 由于4.4版本的设备现在仍然占了将近20%,所以你在开发的时候,可以上面设置一个同大小的View进行覆盖的这么一个方法,具体的介绍以及思路可以参照这篇博客,由于我的设计稿上没有特殊的颜色处理,不是透明就是半透明,所以这里不再适配.



## 设计稿
 - 设计稿来自互联网,非本人作品,我只是有的地方自己加了一些东西.



## 联系我
![](http://p1.bqimg.com/567571/3cc855762ffbfd5a.jpg)



## 小建议
 1. 对于我们不了解的内容,我建议去官网上直接看官网文档,毕竟那才是正宗的说明书,其他的都是山寨货
 2. 没事说看看基础,以及底层实现,如Activity的生命周期,Handler机制等,这些不是为了在项目中用,而是将来的面试
 3. github不支持[TOC]这个MD的标签,建议大家去下载[Github Toc][4]的插件,这样可以直接看到文章的目录


### License
```
   Copyright (C) 2017 MINDORKS NEXTGEN PRIVATE LIMITED

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
```


  [1]: https://developer.android.com/training/system-ui/immersive.html
  [2]: https://commondatastorage.googleapis.com/androiddevelopers/samples/ImmersiveMode.zip
  [3]: https://www.youtube.com/watch?v=cBi8fjv90E4
  [4]: https://github.com/summerblue/github-toc

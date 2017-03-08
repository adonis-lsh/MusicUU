# MusicUU
这是一款可以免费听音乐,下载音乐和MV的开源软件,本软件所有的数据均来自网络,本软件仅供交流

##注意
在最新的AS2.3版本中,默认使用的是classpath 'com.android.tools.build:gradle:2.2.3'和apt1.8有冲突,Dragger2将报错,所以请降级到2.2.0一下,有人已经向谷歌提交bug,估计很快就会解决.

## 采用主流的MVP+Dragger2+retrofit+Rxjava+Databing的主流框架
- 每天我都会抽出一些时间来完善这个项目,把主流的一些东西都给加入进入,预计两个月时间完成
- [http://www.bendaidai.top](http://www.bendaidai.top)  本人的博客,欢迎骚扰

##配置gradle
1. 为统一管理现在版本库中的各种依赖的第三方版本,所以我们应该学谷歌官方给我们的[例子](https://github.com/googlesamples/android-architecture)那样,统一管理
2. 在project的gradle中我们这样写![](http://img.blog.csdn.net/20170222110057058?watermark/2/text/aHR0cDovL2Jsb2cuY3Nkbi5uZXQvdTAxMDQwNzIyMA==/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70/gravity/SouthEast)
3. 然后再app的gradle中我们就可以引用工程里面的版本号,并且这还有一个好处就是,在我们项目中引入其他库的时候,我们可以很方便的统一版本![](http://img.blog.csdn.net/20170222110209989?watermark/2/text/aHR0cDovL2Jsb2cuY3Nkbi5uZXQvdTAxMDQwNzIyMA==/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70/gravity/SouthEast)
4. 需要注意的是,dependencies这里面引用的内容需要用""双引号
5. 有可能出现的问题:![](http://img.blog.csdn.net/20170223113225950?watermark/2/text/aHR0cDovL2Jsb2cuY3Nkbi5uZXQvdTAxMDQwNzIyMA==/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70/gravity/SouthEast)
</br>
	解决方法如下:![](http://img.blog.csdn.net/20170223113922553?watermark/2/text/aHR0cDovL2Jsb2cuY3Nkbi5uZXQvdTAxMDQwNzIyMA==/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70/gravity/SouthEast)
</br>
	上面是一比较正规的解决方案,我直接把他们给注释了,因为我不经常用单元测试,出问题的话我就直接debug调试


##搭框架
1. 先来一个框架图:说明数据的流向![](http://img.blog.csdn.net/20170224101642925?watermark/2/text/aHR0cDovL2Jsb2cuY3Nkbi5uZXQvdTAxMDQwNzIyMA==/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70/gravity/SouthEast)
2. UML类图展示:![](http://img.blog.csdn.net/20170224141003201?watermark/2/text/aHR0cDovL2Jsb2cuY3Nkbi5uZXQvdTAxMDQwNzIyMA==/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70/gravity/SouthEast)


##建包
![](http://i.imgur.com/zSGYaZC.png)

##联系我
![](http://p1.bqimg.com/567571/3cc855762ffbfd5a.jpg)

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

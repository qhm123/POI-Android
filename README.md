# POI Android

A project that port Apache POI to Android. Apache POI is the Java API for Microsoft Documents.

[http://poi.apache.org/](http://poi.apache.org/)

## 现状

目前只移植了ppt/pptx两种格式。每个格式在单独的子工程目录下。实现了ppt/pptx格式文件的查看。

* 文档元素过多时，会出现oom
* pptx解析、渲染效率问题
* 一些Shape不能正确绘制（POI）
* 不支持wmf格式图片
* bullet没有显示
* text layout多行缩进问题


## Build

ppt：导入Eclipse，Build，Run。

pptx：必须采用Ant编译打包，使用了自定义打包过程，使用jarjar加入了repackage过程。参考：[http://code.google.com/p/dalvik/wiki/JavaxPackages](http://code.google.com/p/dalvik/wiki/JavaxPackages)

## 截图

![image](http://ww2.sinaimg.cn/large/6d40c5e1jw1dz8edkv62lj.jpg)

![image](http://ww4.sinaimg.cn/large/6d40c5e1jw1dz8edpwf8jj.jpg)
# DesignModel 结构型模式1
## 适配器模式
### objectmode
1. 在这个模式中，因为当前框架中已经有TextView类可以直接得到Text,<br>
但是它又不是Shape(没有实现Shape接口),所以Shape不能直接使用TextView<br>

解决办法就是实现一个TextShape类，继承Share,<br>
其中包含TextView, 然后实现Share中的接口。<br>
实现时可以直接使用TextView对象来调用其接口。<br>

同时对于TextView中没有的接口则需要TextShare自己实现(CreateManipulator)<br>


### Dual adapter mode
TextShape 既是TextView也是Shape.

## 装饰模式
ref:https://www.jianshu.com/p/d80b6b4b76fc <br>
个人的想法是 装饰模式：通过传入有同一个有相同父类或实现了同一个接口的对象，生成一个新的对象。<br>
不就是个套娃模式么。。。
![avatar](https://upload-images.jianshu.io/upload_images/5408072-c93e14780f30af12.png?imageMogr2/auto-orient/strip|imageView2/2/w/628)

### 简化后的模型
![avatar](https://upload-images.jianshu.io/upload_images/5408072-75c32134d005d28c.png?imageMogr2/auto-orient/strip|imageView2/2/w/724)

### 常规一点的例子
![avatar](https://www.runoob.com/wp-content/uploads/2014/08/decorator_pattern_uml_diagram.jpg)



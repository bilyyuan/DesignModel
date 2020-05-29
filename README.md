# DesignModel

## 简单工厂
![avatar](https://pic1.zhimg.com/80/69ab924585b751cb9e7bc7b7f9f2179b_720w.jpg)

## 工厂方法
简单工厂模式有一个问题，如果类需要增加新的功能如xxxSender(eg: InstantSender即时消息或 MMSSender)，
则需要
1. 增加一个InstantSender类实现ISender
2. 在SendFactory中增加 public static ISender produceInstant() {
		return new InstantSender();
	}
3. 这种对工厂类直接修改是违背了设计模式的闭包原则，所以有了工厂方法。
其原因就是类的创建依赖工厂类

工厂方法的创建
每个类的创建都有一个单独的工厂类，工厂类实现同一个接口。
还是Sender的例子原来的
1. ISender MailSender SMSSender都不用变，
2. SendFactory需要修改
i. 定义一个新的接口IProvider, 该接口有一个方法用于产生具体的类(产品）
ii. 创建MailSenderFactory 实现这个接口。
iii. 创建 SMSSenderFactory 实现这个接口。

3. 这样我们如果要增加InstantSender，只需要
i. 增加一个InstantSender类，
ii. 增加一个实现IProvider的类，用于返回InstantSender

4. 这样原有的代码就不用修改，只是增加新的代码
5. 注意这里为了 演示增加了新的包，实际情况是不用新加这个包的，直接用原来的包就好了。

抽象工厂
![avatar](https://pic4.zhimg.com/80/ab2a90cfcc7a971b1e3127d1f531a486_720w.jpg)

### 增加一个新的产品线
(产品类型不变）
![avatar](https://pic1.zhimg.com/80/e8184a3c6b3463338d85c329004d7c64_720w.jpg)
这是符合开闭原则的。

### 图片引用
作者：名姓
链接：https://www.zhihu.com/question/20367734/answer/115807228
来源：知乎
著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。

### 增加一个新的子产品
 如果在原来鼠标，键盘的基本上增加耳麦
![avatar](https://pic4.zhimg.com/80/0f20f50524336fa9634e19237ce0ec7e_720w.jpg)
这个修改了原来的工厂内部，不符合开闭原则。

简单工厂，工厂方法 一个工厂都只能生产一个产品，
而抽象工厂，一个工厂可以生产一类产品(也就是产品线)。

所以如果后期需要增加新的产品线，用抽象工厂比较好。
而如果是增加一个产品，那么用抽象工厂的话就需要每个工厂都做修改。

### 引用：
One uses inheritance and one uses composition.One
creates only one product and the other creates a family of products.One makes
use of the concrete types the subclasses create and the other's methods are
purely implemented to create products.

作者：洛希亚
链接：https://www.zhihu.com/question/20367734/answer/127069084
来源：知乎
著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。


## 单例模式
### 单例模式的method 3有何问题<br>
#### 1. 先看可见性
可见性，是指线程之间的可见性，一个线程修改的状态对另一个线程是可见的。<br>
也就是一个线程修改的结果。另一个线程马上就能看到。 <br>
当一个共享变量被volatile修饰时，它会保证修改的值会立即被更新到主存，<br>所以对其他线程是可见的，当有其他线程需要读取时，它会去内存中读取新值。 <br><br>
而普通的共享变量不能保证可见性，因为普通共享变量被修改之后，<br>什么时候被写入主存是不确定的，当其他线程去读取时，<br>此时内存中可能还是原来的旧值，因此无法保证可见性。<br>


#### 2. 问题
因为在method 3 <br>

```java
	public SingletonInstance getInstance() {
		if (instance == null) {
			synchronized (this) {
			if (instance == null) {
				instance = new SingletonInstance();
			}
			}
		}
		return instance;
	}
```

如果两个线程A,B同时执行getInstance，执行到if(instance == null). A&B都会申请锁， 如果A拿到，则B会等待，<br>
A执行然后 instance = new SingletonInstance();<br>
然后B开始执行，因为 通的共享变量不能保证可见性，所以A执行后对instance 的赋值可能没有更新到主存。<br>
于是，B在执行synchronized中的代码时。instance 可能还是null.

#### 3. solution
使用volatile, instance 定义为volatile, 则线程A对instance的修改在退出 synchorized 前就会写入主存，
这样在线程B执行 synchorized 中的内容时，if (instance == null) 就会用最新的值来比较。

————————————————<br>
版权声明：本文为CSDN博主「刘望舒」的原创文章，遵循CC 4.0 BY-SA版权协议，转载请附上原文出处链接及本声明。<br>
原文链接：https://blog.csdn.net/itachi85/java/article/details/50274169<br>


ref:<br>
https://blog.csdn.net/itachi85/article/details/50510124<br>
for volatile<br>
https://blog.csdn.net/itachi85/article/details/50274169<br>


## builders 模式
### GOF builder
![Avatar](https://upload-images.jianshu.io/upload_images/3057657-0f6f6993abfb4283.png?imageMogr2/auto-orient/strip|imageView2/2/w/637)

1. 每套新的配置，就是增加一个新的ConcreteBuilder.
适用于，配置方式固定(电脑的配件类型固定）
2. 如果要增加新的配件，则所有的ConcreteBuilder 都需要修改，如果有这样的需求，则这种模式不合适

#### 自己的理解
可以理解为 导演拍戏。<br>
Director类就是导演 ConcreteBuilder是剧本 Computer类就是 拍出来的戏。<br>
Director类中setBuilder就是设置剧本， createComputer 就是拍戏这个过程。 getComputer就是得到最后拍好的戏。<br>
而IVirtualBuilder 确定的是剧中的要素， ConcreteBuilder 是明确要素的本身。<br>
如IVirtualBuilder 确定有 男主，女主，男配，女配，剧情，等。<br>
ConcreteBuilder 明确是谁来担任这些角色，以及剧情走向等。(我觉得)也可以不设置某些要素。<br>

所以Director这里成了一个工具人，要素都由ConcreteBuilder决定了，他只需要按特定的顺序组合各个要素。<br>
当要拍一部新的戏时，只需要增加一个新的 ConcreteBuilder 就好了。<br>
如果哪一个要素不需要，则可以在ConcreteBuilder中不设置这个变量即可。<br>
见ConcreteBuilder的AddSpeaker内容就是空的。

### 书中摘抄
1. 意图<br>
将一个复杂对象的构建与它的表示分离，使得同样的构建过程可以创建不同的表示。

Builder normal2 是我们常见的builder，其 builder类中，<br>
将必要要定义的参数设置为final， 来保证其一定被设置。



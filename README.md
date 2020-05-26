# DesignModel

# 工厂方法
工厂模式有一个总是，如果类需要增加新的功能如xxxSender(eg: InstantSender即时消息或 MMSSender)，
则需要
1. 增加一个InstantSender类实现ISender
2. 在SendFactory中增加 public static ISender produceInstant() {
		return new InstantSender();
	}
3. 这种对工厂类直接修改是违背了设计模式的闭包原则，所以有了工厂方法。
其原因就是类的创建依赖工厂类

工厂方法
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


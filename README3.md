# DesignModel 行为模式
## 命令模式

![AVAATAR](https://img-blog.csdnimg.cn/20190606104432132.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L0NtZFNtaXRo,size_16,color_FFFFFF,t_70)

这个图对应的demo是command.basic 调用的时候

<font color=#A52A2A size=5 >Command会包含Reciver.</font>

Invoker的时候会自动调用Command中的Reciver对应的action函数。

### AudioPlayer 系统

小女孩朱莉（Julia）有一个盒式录音机，此录音机有播音（Play）、倒带（Rewind）和停止（Stop）功能，<br>
1. 录音机的键盘便是请求者（Invoker)角色；
2. 朱莉是客户端角色，
3. 而录音机便是接收者角色。
4. Command类扮演抽象命令角色，
5. 而PlayCommand、StopCommand和RewindCommand便是具体命令类。

朱莉（Julia）不需要知道播音（Play）、倒带（rewind）和停止（stop）功能是怎么具体执行的，<br>
这些命令执行的细节全都由键盘（Keypad）具体实施。<br>
朱莉只需要在键盘上按下相应的键便是了。<br>

录音机是典型的命令模式。录音机按键把客户端与录音机的操作细节分割开来.<br>

————————————————
版权声明：本文为CSDN博主「CmdSmith」的原创文章，遵循CC 4.0 BY-SA版权协议，转载请附上原文出处链接及本声明。
原文链接：https://blog.csdn.net/CmdSmith/java/article/details/91345775



## 观察者模式
这个见过很多的模式，在实际书写中其实还有遇到一些问题。<br>
1. 在状态改变和通知的时候，如果按照书中的实现，status放在ConcreteSubject中，<br>
则setStatus函数只能写在ConcreteSubject中，无法通过Subject对象来调用。<br>
2. 按书中的写法update没有参数(这个也需要将getStatus放在Subject类中才能用Subject对象来访问)<br>
当然也可能书的是类图没有表示参数而已。

### 注意
1. 发出通知前确保目标的状态自身是一致的

## Chain of responsibility(责任链模式）
### 意图

使多个对象都有机会处理请求，将对象连成一条链传递该请求，直到有一个对象处理它为止。<br>
Me: 想不想系统事件的传递，Touch事件从button到activity的传递。 这个和广播的区别很明显，
广播所有的接收对象会去处理这个广播事件<br>

### 适用性

* 多个对象可以处理一个请求时，需要运行时候确认哪个对象来处理。<br>
* 不指定接收者的情况下，向多个对象中的一个提交一个请求<br>
* 可处理一个请求的对象集合 应被动态指定。(没理解到位)<br>

### 效果
1. 降低耦合度
接收者和发送者都没有对方的明确的信息，接收链中的对象不知道链的结构。
2. 可以灵活的指派责任链，可以在运行时，对链进行动态的增加或修改，来增加或修改处理一个请求的那些职责。
3. 一个请求不保证被接受，（责任链的的对象没有处理它）。

Demo是我自己想的。





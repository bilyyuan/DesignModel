# DesignModel 
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




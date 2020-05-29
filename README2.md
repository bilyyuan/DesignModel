# DesignModel 结构型模式
## objectmode
1. 在这个模式中，因为当前框架中已经有TextView类可以直接得到Text,<br>
但是它又不是Shape(没有实现Shape接口),所以Shape不能直接使用TextView<br>

解决办法就是实现一个TextShape类，继承Share,<br>
其中包含TextView, 然后实现Share中的接口。<br>
实现时可以直接使用TextView对象来调用其接口。<br>

同时对于TextView中没有的接口则需要TextShare自己实现(CreateManipulator)<br>


## Dual adapter mode
TextShape 既是TextView也是Shape.

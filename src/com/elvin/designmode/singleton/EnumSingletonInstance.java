package com.elvin.designmode.singleton;

public class EnumSingletonInstance {
    
    /**
     * 注意这是饿汉式，不是lazy的，
     * SingletonDemo 的构造函数会先调用。然后才会调用otherMethods
     * @author spring
     *
     */
    enum SingletonDemo{
        INSTANCE;
        public void otherMethods(){
            System.out.println("Something");
        }
    }
}

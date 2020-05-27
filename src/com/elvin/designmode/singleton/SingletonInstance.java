package com.elvin.designmode.singleton;

public class SingletonInstance {

    // volatile solution for method 3.
    private static volatile SingletonInstance instance = null;

    private SingletonInstance() {

    }

    /**
     * This is not thread safety.
     * 懒汉模式 Lazy: Lazy load.
     * @return
     */
//    public SingletonInstance getInstance() {
//          if (instance == null) {
//              instance =  new SingletonInstance();
//          }
//          return instance    
//    }

    /**
     * This is ok for thread. But, there is not need to lock, after instance is
     * created. This has a bad performance. That's why singleton instance has so
     * much discuss.
     * 
     * @return
     */
//    public synchronized SingletonInstance getInstance() {
//        if (instance == null) {
//            instance = new SingletonInstance();
//        }
//        return instance;
//    }

    
    /**
     * DCL
     * Method 3. README.md
     * solution set instance as volatile
     * @return
     */
//    public SingletonInstance getInstance() {
//        if (instance == null) {
//            synchronized (this) {
//                if (instance == null) {
//                    instance = new SingletonInstance();
//                }
//            }
//        }
//        return instance;
//    }
    
}

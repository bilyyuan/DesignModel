package com.elvin.designmode.singleton;

public class StaticInnerSingletonInstance {

    private StaticInnerSingletonInstance() {
        
    }
    
    public static StaticInnerSingletonInstance getInstance() {
        return SingleInstanceHolder.instance;
    }
    
    private static class SingleInstanceHolder {
        private static final StaticInnerSingletonInstance instance = new StaticInnerSingletonInstance();
    }
}

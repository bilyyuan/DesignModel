package com.elvin.designmode.singleton;

import java.util.HashMap;
import java.util.Map;

/**
 * This should be not thread safe.
 * @author spring
 *
 */
public class CollectionSingletonInstance {

    private static Map<String, Object> map = new HashMap<>();
    
    public static void register(String key, Object value) {
        if (!map.containsKey(key)) {
            map.put(key, value);
        }
    }
    
    public static Object get(String key) {
        return map.get(key);
    }
}

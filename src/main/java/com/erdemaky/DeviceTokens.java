package com.erdemaky;

import java.util.HashMap;

/**
 * @author Erdem Akyıldız
 * @param <K>
 * @param <V>
 */
public class DeviceTokens<K , V> {
    
    HashMap<K, V> tokens = new HashMap<>();
    
    public void add(K k,V v){
        tokens.put(k, v);
    }
    
    public V get(K k){
        return tokens.get(k);
    }
    
    public void delete(K k){
        tokens.remove(k);
    }
    
    
}

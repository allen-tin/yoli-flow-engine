package com.yoli.workflow.context;


import com.yoli.workflow.util.Convert;

import java.math.BigDecimal;
import java.util.HashMap;

public class NodeMessage<K,V> extends HashMap<K,V> {

    public String getStr(K key){
        V v = get(key);
        if(null!=key){
            return Convert.toStr(v);
        }
        return null;
    }

    public Integer getIntger(K key){
        V v = get(key);
        if(null!=key){
            return Convert.toInt(v);
        }
        return null;
    }

    public Long getLong(K key){
        V v = get(key);
        if(null!=key){
            return Convert.toLong(v);
        }
        return null;
    }

    public BigDecimal getBigDecimal(K key){
        V v = get(key);
        if(null!=key){
            return Convert.toBigDecimal(v);
        }
        return null;
    }
}

package com.yoli.workflow.util;

import org.apache.commons.lang3.StringUtils;

public class Assert {

    public static void isNotEmpty(String value,String errorMsg){
        if(StringUtils.isEmpty(value)){
            throw new IllegalArgumentException(errorMsg);
        }
    }

    public static void isNotNull(Object value,String errorMsg){
        if(null == value){
            throw new IllegalArgumentException(errorMsg);
        }
    }
}

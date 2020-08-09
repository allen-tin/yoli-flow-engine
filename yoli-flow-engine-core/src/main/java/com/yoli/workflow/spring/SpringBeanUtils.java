package com.yoli.workflow.spring;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;

/**
 * spring 对象获取工具
 * */
public class SpringBeanUtils {


    private static class SpringApp{
        private static SpringBeanUtils instance=new SpringBeanUtils();
        private static ApplicationContext applicationContext;
    }


    private SpringBeanUtils(){}

    public static SpringBeanUtils getInstance(){
        return SpringApp.instance;
    }

    public void setApplicationContext(ApplicationContext context) throws BeansException {
        SpringApp.applicationContext = context;
    }

    public Object getBean(String name){
       return SpringApp.applicationContext.getBean(name);
    }

    public <T> T getBean(Class<T> tClass){
        return SpringApp.applicationContext.getBean(tClass);
    }
}

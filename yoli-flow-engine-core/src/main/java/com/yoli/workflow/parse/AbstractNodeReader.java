package com.yoli.workflow.parse;


import com.yoli.workflow.factory.ServiceRegistry;
import com.yoli.workflow.io.Resource;

/**
 * 节点读取抽象实现
 * 调用构造方法
 * */
public abstract class AbstractNodeReader implements NodeReader {

    private ServiceRegistry serviceRegistry;

    public AbstractNodeReader(ServiceRegistry serviceRegistry){
        this.serviceRegistry = serviceRegistry;
    }

    @Override
    public ServiceRegistry getServiceRegistry() {
        return serviceRegistry;
    }

    @Override
    public void loadNode(Resource... resources) {
        for (Resource resource:resources){
            loadNode(resource);
        }
    }
}

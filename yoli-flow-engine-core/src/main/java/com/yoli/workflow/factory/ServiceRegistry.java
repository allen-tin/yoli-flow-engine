package com.yoli.workflow.factory;


import com.yoli.workflow.node.Node;

/**
 * 注册服务到工厂
 * */
public interface ServiceRegistry {

    /**
     * 服务流程注册
     * */
    void registry(String name, Node node);

    /**
     * 服务都注册完成 打包成一个完成的服务
     * */
    void servicePackage();

}

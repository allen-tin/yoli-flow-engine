package com.yoli.workflow.factory;


import com.yoli.workflow.node.Node;

/**
 * 服务工厂
 * 所有的额流程服务都在这个里面获取
 * */
public interface ServiceFactory {

    /**
     * 根据名称获取
     * */
    Node getNode(String name);
}

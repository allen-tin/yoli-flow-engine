package com.yoli.workflow.context;


import com.yoli.workflow.factory.ServiceFactory;

/**
 * service上下文
 * */
public interface ServiceContext extends ServiceFactory {


    /**
     * 根据名称输入参数执行节点
     * */
    NodeMessage action(String name, NodeMessage<String, Object> nodeMessage);
}

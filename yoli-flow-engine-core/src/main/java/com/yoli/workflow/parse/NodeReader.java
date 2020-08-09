package com.yoli.workflow.parse;


import com.yoli.workflow.factory.ServiceRegistry;
import com.yoli.workflow.io.Resource;

/**
 * 读取节点
 * */
public interface NodeReader {


    /**
     * 返回 服务注册
     * */
    ServiceRegistry getServiceRegistry();

    /**
     * 加载配置文件并注册
     * */
    void loadNode(Resource resource);


    void loadNode(Resource... resources);

}

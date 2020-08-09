package com.yoli.workflow.util;


import com.yoli.workflow.action.NodeAction;
import com.yoli.workflow.exception.NodeException;
import com.yoli.workflow.spring.SpringBeanUtils;

/**
 * 获取nodeAction执行类
 * */
public class NodeActionUtil {


    public static NodeAction getNodeActionByClass(String className){
        NodeAction action = null;
        try {
            Class c = Class.forName(className);
            action = (NodeAction) c.newInstance();
        } catch (ClassNotFoundException e) {
            throw new NodeException("service node clessname create object fail", e);
        } catch (IllegalAccessException e) {
            throw new NodeException("service node clessname create object fail", e);
        } catch (InstantiationException e) {
            throw new NodeException("service node clessname create object fail", e);
        }
        return action;
    }

    public static NodeAction getNodeActionBySpring(String springBeanName){
        NodeAction nodeAction = (NodeAction) SpringBeanUtils.getInstance().getBean(springBeanName);
        Assert.isNotNull(nodeAction,"service node spring-bean-name get null");
        return nodeAction;
    }




}

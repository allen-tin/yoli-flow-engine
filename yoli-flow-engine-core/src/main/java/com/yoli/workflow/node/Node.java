package com.yoli.workflow.node;


import com.yoli.workflow.action.NodeAction;
import com.yoli.workflow.context.NodeContext;

/**
 *  节点抽象接口
 * */
public interface Node extends NodeAction {

    /**
     * 获取节点名称
     * */
    String getName();


    /**
     * 是否存在下一个节点
     * */
    boolean hasNext();

    /**
     * 执行下一个节点
     * */
    void nextNodeAction(NodeContext nodeContext);

    /**
     * 添加下一个节点
     * */
    void setNextNode(Node node);

    /**
     * 添加内部节点
     * */
    void setInnerNode(Node innerNode);

    /**
     * 获取下一个节点
     * */
    Node getNextNode();

    /**
     * 获取内部节点;
     * */
    Node getInnerNode();



}

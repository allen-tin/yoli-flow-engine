package com.yoli.workflow.action;


import com.yoli.workflow.context.NodeContext;

/**
 * 节点执行
 * */
public interface NodeAction {


    void action(NodeContext nodeContext);

}

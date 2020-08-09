package com.yoli.workflow.action;

import com.yoli.workflow.context.NodeContext;
import com.yoli.workflow.node.Node;

/**
 * 多分支判断执行
 * */
public class SwitchNodeAction implements NodeAction {

    private Node innerNode;


    public SwitchNodeAction(Node innerNode){
        this.innerNode = innerNode;
    }

    @Override
    public void action(NodeContext nodeContext) {
        if(null == innerNode){
            return;
        }
        innerNode.action(nodeContext);
    }
}

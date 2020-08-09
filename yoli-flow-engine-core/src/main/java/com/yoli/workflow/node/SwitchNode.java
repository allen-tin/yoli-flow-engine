package com.yoli.workflow.node;


import com.yoli.workflow.action.SwitchNodeAction;

/**
 * 多分支判断
 * */
public class SwitchNode extends AbstractNode{


    public SwitchNode(){
        super();
    }

    public SwitchNode(String name, String desc, Node innerNode){
        super(name,desc);
        this.innerNode = innerNode;
        this.nodeAction = new SwitchNodeAction(this.innerNode);
    }

}

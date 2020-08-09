package com.yoli.workflow.context;


/**
 * 节点上下文
 * */
public class NodeContext {

    /**
     * 输入
     * */
    private NodeMessage in = new NodeMessage();

    /**
     * 输出
     * */
    private NodeMessage out = new NodeMessage();


    public NodeContext(){

    }

    public NodeContext(NodeMessage in){
        this.in = in;
    }

    public NodeMessage getIn() {
        return in;
    }

    public NodeMessage getOut() {
        return out;
    }
}

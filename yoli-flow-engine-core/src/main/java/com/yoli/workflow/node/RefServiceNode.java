package com.yoli.workflow.node;




/**
 * 依赖节点 摸个流程
 * */
public class RefServiceNode extends AbstractNode {

    /**
     * 监听类
     * */
    private String refName;


    public RefServiceNode(String name, String desc, String refName){
        super(name,desc);
        this.refName = refName;
    }

    @Override
    public void setInnerNode(Node innerNode) {
        super.setInnerNode(innerNode);
//        nodeAction = new RefServiceNodeAction(innerNode);
    }

    public String getRefName() {
        return refName;
    }
}

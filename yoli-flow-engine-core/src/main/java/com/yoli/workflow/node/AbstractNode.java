package com.yoli.workflow.node;



import com.yoli.workflow.action.NodeAction;
import com.yoli.workflow.context.NodeContext;
import com.yoli.workflow.util.Assert;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * 抽象节点类
 * */
public abstract class AbstractNode implements Node {

    private static final Log log = LogFactory.getLog(AbstractNode.class);

    public AbstractNode(){

    }

    public AbstractNode(String name, String desc){
        Assert.isNotEmpty(name,"node name not null");
        this.name = name;
        this.desc = desc;
    }

    /**
     * 节点名称
     * */
    protected String name;

    /**
     * 节点描述
     * */
    protected String desc;

    /**
     * 节点下一个节点
     * */
    protected Node nextNode;

    /**
     * 标签内部节点
     * */
    protected Node innerNode;

    /**
     * 节点执行器
     * */
    protected NodeAction nodeAction;


    public String getDesc(){
        return desc;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean hasNext() {
        return nextNode == null?false:true;
    }

    @Override
    public void action(NodeContext nodeContext) {
        log.info(String.format("执行-%s",this.name));
        /**
         * 执行当前节点
         * */
        nodeAction.action(nodeContext);

        /**
         * 转到下一个节点
         * */
        nextNodeAction(nodeContext);
    }

    @Override
    public void nextNodeAction(NodeContext nodeContext) {
        if(hasNext()){
            nextNode.action(nodeContext);
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public Node getNextNode() {
        return nextNode;
    }

    @Override
    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }

    public NodeAction getNodeAction() {
        return nodeAction;
    }

    public void setNodeAction(NodeAction nodeAction) {
        this.nodeAction = nodeAction;
    }

    @Override
    public Node getInnerNode() {
        return innerNode;
    }

    @Override
    public void setInnerNode(Node innerNode) {
        this.innerNode = innerNode;
    }
}

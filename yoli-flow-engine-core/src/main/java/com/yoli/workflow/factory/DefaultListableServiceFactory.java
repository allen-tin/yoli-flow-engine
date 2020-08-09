package com.yoli.workflow.factory;



import com.yoli.workflow.exception.NotNodeException;
import com.yoli.workflow.node.Node;
import com.yoli.workflow.node.RefServiceNode;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;


/**
 *  service工厂的默认实现，  工厂注册到这个里面
 * */
public class DefaultListableServiceFactory implements ServiceRegistry,ServiceFactory {

    /**
     * key nodename value  node
     * */
    private final Map<String, Node> serviceMap = new ConcurrentHashMap();

    @Override
    public Node getNode(String name) {
        Node node = serviceMap.get(name);
        if(null == node){
            throw new NotNodeException("流程节点不存在，请核对流程节点名称");
        }
        return node;
    }

    @Override
    public void registry(String name, Node node) {
        if(null == node){
            throw new NotNodeException("注册节点不能为空，请检查配置");
        }
        serviceMap.put(name,node);
    }

    @Override
    public void servicePackage() {
        for (String key:serviceMap.keySet()) {
            Node node = serviceMap.get(key);
            innerNodePackage(node.getInnerNode());
        }
    }



    private void innerNodePackage(Node node){
        nodePackage(node);
        if(null != node.getInnerNode()){
            innerNodePackage(node.getInnerNode());
        }
        nextNodePackage(node);
    }

    private void nextNodePackage(Node node){
        if(node.hasNext()){
            node = node.getNextNode();
            nodePackage(node);
            if(null != node.getInnerNode()){
                innerNodePackage(node.getInnerNode());
            }
            nextNodePackage(node);
        }
    }

    private void nodePackage(Node node){
        if(node instanceof RefServiceNode){
            RefServiceNode refServiceNode = (RefServiceNode) node;
            refServiceNode.setInnerNode(serviceMap.get(refServiceNode.getRefName()));
        }
    }


}

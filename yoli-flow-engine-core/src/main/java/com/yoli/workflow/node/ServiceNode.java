package com.yoli.workflow.node;


import com.yoli.workflow.util.Assert;
import com.yoli.workflow.util.NodeActionUtil;
import org.apache.commons.lang3.StringUtils;


/**
 * 服务节点
 * */
public class ServiceNode extends AbstractNode{

    private String springBeanName;

    private String className;

    public ServiceNode(){
        super();
    }

    public ServiceNode(String name, String desc, String className, String springBeanName){
        super(name,desc);
        this.springBeanName = springBeanName;
        this.className = className;
        if(StringUtils.isNotEmpty(this.className)){
            this.nodeAction = NodeActionUtil.getNodeActionByClass(this.className);
        }
        if(StringUtils.isNotEmpty(this.springBeanName)){
            this.nodeAction = NodeActionUtil.getNodeActionBySpring(this.springBeanName);
        }
        Assert.isNotNull(this.nodeAction,"service node Action not null");
    }



    public String getSpringBeanName() {
        return springBeanName;
    }

    public void setSpringBeanName(String springBeanName) {
        this.springBeanName = springBeanName;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }
}

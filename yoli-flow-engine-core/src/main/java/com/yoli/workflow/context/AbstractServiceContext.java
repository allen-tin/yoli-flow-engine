package com.yoli.workflow.context;

import com.yoli.workflow.factory.ServiceFactory;
import com.yoli.workflow.node.Node;
import com.yoli.workflow.spring.SpringBeanUtils;
import org.springframework.context.ApplicationContext;

public abstract class AbstractServiceContext implements ServiceContext{

    public AbstractServiceContext(){

    }

    /**
     * XmlClasspathServiceFactory 继承于AbstractServiceContext，
     * 所以执行ServiceContext serviceContext = new XmlClasspathServiceFactory(applicationContext,"services.xml")
     * 时要先执行它（调用父类的构造方法）
     * @param applicationContext
     */
    public AbstractServiceContext(ApplicationContext applicationContext){
        System.out.println("XmlClasspathServiceFactory父类AbstractServiceContext的构造方法执行");
        SpringBeanUtils.getInstance().setApplicationContext(applicationContext);
    }


    @Override
    public NodeMessage action(String name, NodeMessage<String, Object> nodeMessage) {
        NodeContext nodeContext = new NodeContext(nodeMessage);
        this.getNode(name).action(nodeContext);
        return nodeContext.getOut();
    }

    @Override
    public Node getNode(String name) {
        return getServiceFactory().getNode(name);
    }

    public abstract ServiceFactory getServiceFactory();
}

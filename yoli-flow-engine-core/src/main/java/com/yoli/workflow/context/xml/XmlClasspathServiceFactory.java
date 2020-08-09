package com.yoli.workflow.context.xml;


import com.yoli.workflow.context.AbstractServiceContext;
import com.yoli.workflow.factory.DefaultListableServiceFactory;
import com.yoli.workflow.factory.ServiceFactory;
import com.yoli.workflow.io.ClassPathXmlResoutce;
import com.yoli.workflow.io.Resource;
import com.yoli.workflow.parse.xml.XmlClassPathNodeReader;
import org.springframework.context.ApplicationContext;

public class XmlClasspathServiceFactory extends AbstractServiceContext {

    private String [] classPaths;
    private XmlClassPathNodeReader reader;

    public XmlClasspathServiceFactory(String ... classPaths){
        System.out.println("进入XmlClasspathServiceFactory一个参数的构造方法");
    }

    public XmlClasspathServiceFactory(ApplicationContext applicationContext, String ... classPaths){
        super(applicationContext);
        System.out.println("进入XmlClasspathServiceFactory两个参数的构造方法");
        this.classPaths = classPaths;
        init();
    }

    private DefaultListableServiceFactory serviceFactory;


    private void init() {
        synchronized (this){
            if (null == serviceFactory){
                serviceFactory = new DefaultListableServiceFactory();
                reader = new XmlClassPathNodeReader(serviceFactory);
            }
        }
        reader.loadNode(getResources());

    }


    @Override
    public ServiceFactory getServiceFactory() {
        System.out.println("执行getServiceFactory方法");
        return serviceFactory;
    }

    /**
     * 获取所有资源
     * */
    public Resource[] getResources(){
        Resource [] resources = new Resource[classPaths.length];
        for (int i=0;i<classPaths.length;i++){
            resources[i] = new ClassPathXmlResoutce(classPaths[i]);
        }
        return resources;
    }
}

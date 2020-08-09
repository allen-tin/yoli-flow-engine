package com.yoli.workflow;

import com.yoli.workflow.context.ServiceContext;
import com.yoli.workflow.context.xml.XmlClasspathServiceFactory;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppliactionTest {
    @Test
    public void testOne(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application.xml");
        ServiceContext serviceContext = new XmlClasspathServiceFactory(applicationContext,"services.xml");

    }
}

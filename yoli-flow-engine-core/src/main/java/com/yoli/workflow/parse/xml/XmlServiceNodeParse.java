package com.yoli.workflow.parse.xml;


import com.yoli.workflow.constant.Constant;
import com.yoli.workflow.node.Node;
import com.yoli.workflow.node.ServiceNode;
import org.dom4j.Element;

/**
 * 解析服务节点标签
 * */
public class XmlServiceNodeParse extends AbstractXmlNodeParse {


    private static XmlServiceNodeParse nodeParse = null;

    private XmlServiceNodeParse(){}


    public static XmlServiceNodeParse getInstance(){
        if(null == nodeParse){
            nodeParse = new XmlServiceNodeParse();
        }
        return nodeParse;
    }

    @Override
    public Node parseToNode(Element element) {
        String name = element.attributeValue(Constant.NAME_ATT);
        String desc = element.attributeValue(Constant.DESC_ATT);
        String className = element.attributeValue(Constant.CLASS_NAME_ATT);
        String springBeanName = element.attributeValue(Constant.SPRING_BEAN_NAME_ATT);
        return new ServiceNode(name,desc,className,springBeanName);
    }
}

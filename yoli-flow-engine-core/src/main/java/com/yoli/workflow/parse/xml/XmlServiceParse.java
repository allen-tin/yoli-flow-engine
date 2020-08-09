package com.yoli.workflow.parse.xml;


import com.yoli.workflow.constant.Constant;
import com.yoli.workflow.node.Node;
import org.dom4j.Element;


/**
 * 解析服务标签
 * */
public class XmlServiceParse extends AbstractXmlNodeParse {


    private static XmlServiceParse nodeParse = null;

    private XmlServiceParse(){}


    public static XmlServiceParse getInstance(){
        if(null == nodeParse){
            nodeParse = new XmlServiceParse();
        }
        return nodeParse;
    }

    @Override
    public Node parseToNode(Element element) {
//        String name = element.attributeValue(Constant.NAME_ATT);
//        String desc = element.attributeValue(Constant.DESC_ATT);
//        Node innerNode = innerNodeParse(element);
//        Node node = new Service(name,desc,innerNode);
//        return node;
        return null;
    }


}

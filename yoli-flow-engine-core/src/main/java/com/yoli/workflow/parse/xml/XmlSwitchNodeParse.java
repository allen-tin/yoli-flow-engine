package com.yoli.workflow.parse.xml;


import com.yoli.workflow.constant.Constant;
import com.yoli.workflow.node.Node;
import com.yoli.workflow.node.SwitchNode;
import org.dom4j.Element;


/**
 * 解析多分支判断标签
 * */
public class XmlSwitchNodeParse extends AbstractXmlNodeParse {


    private static XmlSwitchNodeParse nodeParse = null;

    private XmlSwitchNodeParse(){}


    public static XmlSwitchNodeParse getInstance(){
        if(null == nodeParse){
            nodeParse = new XmlSwitchNodeParse();
        }
        return nodeParse;
    }

    @Override
    public Node parseToNode(Element element) {

        String name = element.attributeValue(Constant.NAME_ATT);
        String desc = element.attributeValue(Constant.DESC_ATT);
        Node innerNode = innerNodeParse(element);
        SwitchNode switchNode = new SwitchNode(name,desc,innerNode);
        return switchNode;
    }
}

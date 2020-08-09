package com.yoli.workflow.parse.xml;


import com.yoli.workflow.node.Node;
import org.dom4j.Element;

/**
 * 解析事务标签
 * */
public class XmlTransactionNodeParse extends AbstractXmlNodeParse{


    private static XmlTransactionNodeParse nodeParse = null;

    private XmlTransactionNodeParse(){}


    public static XmlTransactionNodeParse getInstance(){
        if(null == nodeParse){
            nodeParse = new XmlTransactionNodeParse();
        }
        return nodeParse;
    }

    @Override
    public Node parseToNode(Element element) {

        return null;
    }
}

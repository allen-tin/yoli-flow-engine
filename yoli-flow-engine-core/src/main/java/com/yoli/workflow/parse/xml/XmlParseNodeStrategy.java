package com.yoli.workflow.parse.xml;


import com.yoli.workflow.constant.Constant;
import com.yoli.workflow.exception.NodeException;
import com.yoli.workflow.parse.NodeParse;

public class XmlParseNodeStrategy {

    private static XmlParseNodeStrategy xmlParseNode = null;

    private XmlParseNodeStrategy(){}


    public static XmlParseNodeStrategy getInstance(){
        if(null == xmlParseNode){
            xmlParseNode = new XmlParseNodeStrategy();
        }
        return xmlParseNode;
    }

    public NodeParse getNodeParse(String xmlTag){

        switch (xmlTag){
            case Constant.SERVICE_TAG:
                return XmlServiceParse.getInstance();
            case Constant.SERVICE_NODE_TAG:
                return XmlServiceNodeParse.getInstance();
            case Constant.CONDITION_TAG:
                return  null;
//                return XmlConditionNodeParse.getInstance();
            case Constant.SWITCH_TAG:
                return XmlSwitchNodeParse.getInstance();
            case Constant.CASE_TAG:
                return  null;
//                return XmlCaseNodeParse.getInstance();
            case Constant.ASYC_TAG:
                return  null;
//                return XmlAsycNodeParse.getInstance();
            case Constant.TRANSACTION_TAG:
                return XmlTransactionNodeParse.getInstance();
            case Constant.REF_SERVICE_TAG:
                return  null;
//                return XmlRefServiceNodeParse.getInstance();
        }

        throw new NodeException(xmlTag + " no node");
    }

}

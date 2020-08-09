package com.yoli.workflow.parse.xml;


import com.yoli.workflow.node.Node;
import com.yoli.workflow.parse.NodeParse;
import org.dom4j.Element;

import java.util.List;

/**
 * 解析并转换成 Node 抽象类
 * */
public abstract class AbstractXmlNodeParse implements NodeParse {

    /**
     * 如果有内部几点的调用次方法解析
     * */
    protected Node innerNodeParse(Element element){
        List<Element> nodeList = element.elements();
        /* 开始节点返回 */
        Node startnode = null;
        /* 记录最后一个节点 逐个追加 */
        Node lastNode = null;
        for (int i = 0; i < nodeList.size(); i++) {
            Element subElement = nodeList.get(i);
            NodeParse nodeParse = XmlParseNodeStrategy.getInstance().getNodeParse(subElement.getName());
            Node subnode = nodeParse.parseToNode(subElement);
            if(null == lastNode) {
                startnode = subnode;
                lastNode = subnode;
            }else{
                lastNode.setNextNode(subnode);
                lastNode = subnode;
            }
        }
        return startnode;
    }

}

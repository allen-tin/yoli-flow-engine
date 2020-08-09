package com.yoli.workflow.parse;

import com.yoli.workflow.node.Node;
import org.dom4j.Element;


/**
 * 解析并转换成 Node
 * */
public interface NodeParse {

    Node parseToNode(Element element);

}

package com.yoli.workflow.parse.xml;


import com.yoli.workflow.exception.PaserException;
import com.yoli.workflow.factory.ServiceRegistry;
import com.yoli.workflow.io.Resource;
import com.yoli.workflow.node.Node;
import com.yoli.workflow.parse.AbstractNodeReader;
import com.yoli.workflow.parse.NodeParse;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.InputStream;
import java.util.List;


/**
 * 调用XmlClassPathNodeReader构造方法的时候，首先要执行
 * AbstractNodeReader 的构造方法
 */
public class XmlClassPathNodeReader extends AbstractNodeReader {



    public XmlClassPathNodeReader(ServiceRegistry serviceRegistry) {
        super(serviceRegistry);
    }

    @Override
    public void loadNode(Resource resource) {

        try {
            Document document = getDocument(resource.getInputStream());
            Element element = document.getRootElement();
            /* 解析并注册服务 */
            registryRootNode(element);
            /* 服务组装 解决那种有引用关系的服务 */
            getServiceRegistry().servicePackage();
        } catch (DocumentException e) {
            throw new PaserException("parse xml error",e);
        }

    }

    private void registryRootNode(Element rootElement){
        List<Element> list = rootElement.elements();
        for (int i = 0; i < list.size(); i++) {
            Element element =  list.get(i);
            NodeParse nodeParse = XmlParseNodeStrategy.getInstance().getNodeParse(element.getName());
            Node node = nodeParse.parseToNode(element);
            getServiceRegistry().registry(node.getName(),node);
        }
    }



    private Document getDocument(InputStream inputStream) throws DocumentException {
        Document document = new SAXReader().read(inputStream);
        return document;
    }

}

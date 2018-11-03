package XML;


import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.util.List;

//获取xml文件中的内容
public class demo {
    public static void main(String[] args) throws Exception {
        //1.获得document
        SAXReader saxReader = new SAXReader();
        Document document = saxReader.read(new File("src\\XML\\xml.xml"));
        //2.获得根元素
        Element rootElement = document.getRootElement();
        System.out.println(rootElement);
        //3.打印version属性值
        System.out.println(rootElement.attributeValue("version"));
        //4.获取所有子元素并打印其名称
        System.out.println("获取所有子元素并打印其名称");
        List<Element> elements = rootElement.elements();
        for (Element element : elements) {
            String name = element.getName();
            System.out.println(name);
            System.out.println(element.getText());


        }

    }
}

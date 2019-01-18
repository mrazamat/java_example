package uz.coder.xml;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;

public class ReadXMLFile {
    public static void main(String[] args) {
        SAXBuilder builder = new SAXBuilder();
        File xmlFile = new File("departament-data.xml");

        System.out.println("Parsing FILE: " + xmlFile.getAbsolutePath());

        try {
            Document document = (Document) builder.build(xmlFile);
            Element rootNode = document.getRootElement();
            List<Element> list = rootNode.getChildren("employee");

            for (int i = 0; i < list.size(); i++) {
                Element node = (Element) list.get(i);
                System.out.println("-------");
                System.out.println("Emp No: " + node.getChildText("empNo"));
                System.out.println("emp Name: " + node.getChildText("empName"));
                System.out.println("HireDate: " + node.getChildText("hireDate"));
                System.out.println("Salary: " + node.getChildText("salary"));
            }
        } catch (JDOMException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

package uz.coder.xml;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class MySaxHandler extends DefaultHandler {
    private boolean foundEmpNo = false;
    private boolean foundEmpName = false;
    private boolean foundHireDate = false;
    private boolean foundSalary = false;

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        System.out.println("---------------------");
        System.out.println("Start Element");

        if (qName.equals("empNo")) {
            foundEmpNo = true;
        }
        if (qName.equals("empName")) {
            foundEmpName = true;
        }
        if (qName.equals("hireDate")) {
            foundHireDate = true;
        }
        if (qName.equals("salary")) {
            foundSalary = true;
        }
    }

    @Override
    public void endElement(String uri, String localName, String qName) {
        System.out.println("End Element:" + qName);
    }

    public void characters(char ch[], int start, int length) throws SAXException {
        System.out.println("characters:");

        if (foundEmpNo) {
            System.out.println("Emp No: " + new String(ch, start, length));
            foundEmpNo = false;
        }
        if (foundEmpName) {
            System.out.println("Emp Name: " + new String(ch, start, length));
            foundEmpName = false;
        }
        if (foundHireDate) {
            System.out.println("Hire Date: " + new String(ch, start, length));
            foundHireDate = false;
        }
        if (foundSalary) {
            System.out.println("Salary: " + new String(ch, start, length));
            foundSalary = false;
        }
    }


}

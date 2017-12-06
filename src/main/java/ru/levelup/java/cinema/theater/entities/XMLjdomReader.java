package ru.levelup.java.cinema.theater.entities;
import com.sun.org.apache.xerces.internal.parsers.DOMParser;
//import ru.levelup.java.cinema.theater.entities;

import org.jdom2.Element;
//import org.jdom2.JDOMException;
//import org.jdom2.input.DOMBuilder;
//import org.jdom2.input.SAXBuilder;
//import org.jdom2.input.StAXEventBuilder;
//import org.jdom2.input.StAXStreamBuilder;
//import org.w3c.dom.Document;
//import org.xml.sax.SAXException;
////import ua.com.prologistic.Student;
//
//import javax.xml.parsers.DocumentBuilder;
//import javax.xml.parsers.DocumentBuilderFactory;
//import javax.xml.parsers.ParserConfigurationException;
//import javax.xml.stream.XMLEventReader;
//import javax.xml.stream.XMLInputFactory;
//import javax.xml.stream.XMLStreamException;
//import javax.xml.stream.XMLStreamReader;
//import java.io.File;
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.IOException;
//import java.util.ArrayList;
//import java.util.List;
//import java.lang.String;
//
//
//public class XMLjdomReader {
//
//    public static void main(String[] args) {
//        String fileName = "/Users/nikitaorunov/Google Drive/LevelUP/cinemaTheater_mac/cinemaTheater/src/main/java/ru/levelup/java/cinema/theater/entities/hall.xml";
//
//        try {
//            // мы можем создать экземпляр JDOM Document из классов DOM, SAX и STAX Builder
//
//            org.jdom2.Document jdomDocument = new DOMParser(fileName);
//            Element root = jdomDocument.getRootElement();
//            // получаем список всех элементов Student
//            List<Element> studListElements = root.getChildren("Hall");
//            // список объектов Student, в которых будем хранить
//            // считанные данные по каждому элементу
//            List<Hall> students = new ArrayList<>();
//            for (Element studentEl : studListElements) {
//                Hall student = new Hall();
//                student.setName(studentEl.getChildText("name"));
//                student.setAmountOfPlace(Integer.parseInt(studentEl.getAttributeValue("setAmountOfPlace")));
//                //student.setAge(Integer.parseInt(studentEl.getChildText("age")));
//                //student.setLanguage(studentEl.getChildText("language"));
//
//                students.add(student);
//            }
//            // печатаем полученный список объектов Student
//            for (Hall student : students) {
//                System.out.println(student.toString());
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//    }
//}
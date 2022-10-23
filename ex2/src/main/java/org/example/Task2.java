package org.example;


import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class Task2 {
    public static void writeJson(String filename) throws Exception {
        JSONObject student1 = new JSONObject();
        student1.put("фамилия", "Иванов");
        student1.put("оценка", "5");
        student1.put("предмет", "Математика");
        JSONObject student2 = new JSONObject();
        student2.put("фамилия", "Петрова");
        student2.put("оценка", "4");
        student2.put("предмет", "Информатика");
        JSONObject student3 = new JSONObject();
        student3.put("фамилия", "Краснов");
        student3.put("оценка", "5");
        student3.put("предмет", "Физика");
        JSONArray students = new JSONArray();
        students.add(student1);
        students.add(student2);
        students.add(student3);

        Path path = Paths.get(filename);
        Files.write(path, students.toJSONString().getBytes());
    }
    public static void readJson(String filename) throws Exception {
        FileReader reader = new FileReader(filename);
        JSONParser jsonParser = new JSONParser();
        JSONArray ja = (JSONArray)jsonParser.parse(reader);
        for (int i = 0; i < ja.size(); i++) {
            String str = ja.get(i).toString();
            System.out.println(parseString(str));
            }
    }
    public static String parseString(String str){
        str = str.substring(1,str.length()-2);
        String[] subStr;
        String delimeter = ",";
        subStr = str.split(delimeter);
        String temp = "";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < subStr.length; i++) {
            int index = subStr[i].indexOf(":");
            subStr[i] = subStr[i].substring(index).replaceAll("\"", "").replaceAll(":","");;
        }
        sb.append("Студент ").append(subStr[2]).append(" получил ").append(subStr[0]).append(" по предмету ").append(subStr[1]);
        return sb.toString();
    }

    public static void main(String[] args) throws Exception {
        writeJson("example.json");
        readJson("example.json");
        }
}




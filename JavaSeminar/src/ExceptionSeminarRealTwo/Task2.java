package ExceptionSeminarRealTwo;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Task2 {
    public static void main(String[] args) {
        HashMap<String, String> map = readFromFile();
        showMap(map);
        map.put("Андрей", "6");
        writeToFile(map);
    }
    public static HashMap<String, String> readFromFile(){
        try {
            File file = new File("C:\\Users\\drozd\\Documents\\GB\\Java\\JavaSeminar\\src\\" +
                    "ExceptionSeminarRealTwo\\data.txt");
            FileReader fileReader = null;
            fileReader = new FileReader(file);
            BufferedReader reader = new BufferedReader(fileReader);
            HashMap<String, String> map = new HashMap<>();
            String line = reader.readLine();
            if(line!=null){
                String [] lines = line.split("=");
                map.put(lines[0],lines[1]);
            }
            while (line!=null){
                line = reader.readLine();
                if(line!=null){
                    String [] lines = line.split("=");
                    map.put(lines[0],lines[1]);
                }
            }
            fileReader.close();
            return map;
        }catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
    public static void writeToFile(HashMap<String, String> map){
        try {
            File file = new File("C:\\Users\\drozd\\Documents\\GB\\Java\\JavaSeminar\\src\\" +
                    "ExceptionSeminarRealTwo\\data.txt");
            FileWriter fileWriter = new FileWriter(file, false);
            for (Map.Entry<String, String> entry : map.entrySet()) {
                fileWriter.write(entry.getKey() + "=" + entry.getValue());
                fileWriter.append("\n");
            }
            fileWriter.flush();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
    public static void showMap(HashMap<String, String> map){
        for (Map.Entry<String,String> entry: map.entrySet()) {
            findChar(entry);
            System.out.println("Key: "+ entry.getKey() + " value: "+entry.getValue());
        }
    }
    public static void findChar(Map.Entry<String,String> entry){
        if(entry.getValue().equals("?")){
            entry.setValue(String.valueOf(entry.getKey().length()));
        }
    }

}

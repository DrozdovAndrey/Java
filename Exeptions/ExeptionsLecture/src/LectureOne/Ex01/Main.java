package LectureOne.Ex01;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        System.out.println(getFileSize(new File("C:\\Users\\drozd\\Documents\\GB\\Java\\Exeptions\\" +
                "ExeptionsLecture\\src\\LectureOne\\Ex01\\ex1.txt")));
    }
    public static long getFileSize(File file){
        if (!file.exists()){
            return -1L;
        }
        return file.length();
    }

}
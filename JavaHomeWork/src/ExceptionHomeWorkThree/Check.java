package ExceptionHomeWorkThree;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class Check {

    public static void checkCountData(String[] array){
        int arrLength = 6;
        if (array.length < arrLength){
            throw new LessDataException();
        }
        if(array.length > arrLength){
            throw new LotsDataException();
        }
    }
    public static void checkFIO(String[] array, Data data) {
        data.setLastName(checkLetters(array[0]));
        data.setFirstName(checkLetters(array[1]));
        data.setFatherName(checkLetters(array[2]));
    }
    public static String checkLetters(String str){
        char[] chars = str.toCharArray();
        for (char c : chars) {
            if(!Character.isLetter(c)) {
                throw new FIOException();
            }
        }
        return str;

    }
    public static void checkBirthdate(String[] array, Data data) throws DateTimeParseException {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        LocalDate.parse(array[3], formatter);
        data.setBirthday(array[3]);
    }
    public static void checkNumber(String[] array, Data data) throws NumberFormatException {
        Integer.parseInt(array[4]);
        data.setPhoneNumber(array[4]);
    }
    public static void checkGender(String[] array, Data data) {
        if (!array[5].equals("f") && !array[5].equals("m")) {
            throw new GenderException();
        }
        data.setGender(array[5]);
    }




}

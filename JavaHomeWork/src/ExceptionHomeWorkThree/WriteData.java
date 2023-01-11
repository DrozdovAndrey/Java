package ExceptionHomeWorkThree;

import java.io.FileWriter;
import java.io.IOException;

public class WriteData {
    public static void writeData(Data data) {
        String fileName = data.getLastName();
        try (FileWriter writer = new FileWriter(String.format("%s.txt", fileName), true)) {
            writer.append(data.toString());
            writer.append("\n");
            System.out.printf("\nInput data is correct and added to txt file %s",fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

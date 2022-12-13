package OOPSeminar7.DecoratorFactory.src.calculator;

import java.io.FileWriter;
import java.io.IOException;

public class Logger implements Loggerable{
    String filePath;

    public Logger(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public void log(String message) {
        try {
            FileWriter writer = new FileWriter(filePath, true);
            writer.write("*   *   *\n");
            writer.write(message+"\n");
            writer.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

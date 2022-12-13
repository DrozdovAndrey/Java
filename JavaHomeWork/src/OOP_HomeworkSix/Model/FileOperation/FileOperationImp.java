package OOP_HomeworkSix.Model.FileOperation;

import OOP_HomeworkSix.Model.FileOperation.FileOperation;

import java.util.List;
import java.io.*;
import java.util.ArrayList;


public class FileOperationImp implements FileOperation {
    private final String fileName;

    public FileOperationImp(String fileName) {
        this.fileName = fileName;
        try (FileWriter writer = new FileWriter(fileName, true)) {
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public List<String> readAllLines() {
        List<String> lines = new ArrayList<>();
        try {
            File file = new File(fileName);
            //������� ������ FileReader ��� ������� File
            FileReader fr = new FileReader(file);
            //������� BufferedReader � ������������� FileReader ��� ����������� ����������
            BufferedReader reader = new BufferedReader(fr);
            // ������� ������� ������ ������
            String line = reader.readLine();
            if (line != null) {
                lines.add(line);
            }
            while (line != null) {
                // ��������� ��������� ������ � �����
                line = reader.readLine();
                if (line != null) {
                    lines.add(line);
                }
            }
            fr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return lines;
    }

    public void saveAllLines(List<String> lines) {
        try (FileWriter writer = new FileWriter(fileName, false)) {
            for (String line : lines) {
                // ������ ���� ������
                writer.write(line);
                // ������ �� ��������
                writer.append('\n');
            }
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}

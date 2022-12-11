package OOP_HomeworkSix.Model.FileOperation;

import java.util.List;

public interface FileOperation {
    List<String> readAllLines();

    void saveAllLines(List<String> lines);
}

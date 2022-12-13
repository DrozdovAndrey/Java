package OOP_HomeworkSix;

import OOP_HomeworkSix.Controllers.NoteController;
import OOP_HomeworkSix.Model.FileOperation.FileOperation;
import OOP_HomeworkSix.Model.FileOperation.FileOperationImp;
import OOP_HomeworkSix.Model.NoteOperation.NoteOperations;
import OOP_HomeworkSix.View.ViewUser;

public class Program {
    public static void main(String[] args) {
        FileOperation fileOperation = new FileOperationImp("C:\\Users\\drozd\\Documents" +
                "\\GB\\Java\\JavaHomeWork\\src\\OOP_HomeworkSix\\Notebook.txt");
        NoteOperations noteOperations = new NoteOperations(fileOperation);
        NoteController noteController = new NoteController(noteOperations);
        ViewUser viewUser = new ViewUser(noteController);
        viewUser.run();
    }
}

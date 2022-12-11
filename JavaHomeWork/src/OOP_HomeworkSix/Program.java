package OOP_HomeworkSix;

import OOP_HomeworkSix.Controllers.NoteController;
import OOP_HomeworkSix.Model.NoteOperation.NoteOperations;
import OOP_HomeworkSix.View.ViewUser;

public class Program {
    public static void main(String[] args) {
        ViewUser viewUser = new ViewUser(new NoteController(new NoteOperations()));
        viewUser.run();
    }
}

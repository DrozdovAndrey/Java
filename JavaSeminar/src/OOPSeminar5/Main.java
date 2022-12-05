package OOPSeminar5;

import OOPSeminar5.controllers.UserController;
import OOPSeminar5.model.FileOperation;
import OOPSeminar5.model.FileOperationImpl;
import OOPSeminar5.model.Repository;
import OOPSeminar5.model.RepositoryFile;
import OOPSeminar5.views.ViewUser;

public class Main {
    public static void main(String[] args) {
        FileOperation fileOperation = new FileOperationImpl("users.txt");
        Repository repository = new RepositoryFile(fileOperation);
        UserController controller = new UserController(repository);
        ViewUser view = new ViewUser(controller);
        view.run();
    }
}

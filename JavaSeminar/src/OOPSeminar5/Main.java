package OOPSeminar5;

import OOPSeminar5.controllers.UserController;
import OOPSeminar5.model.FileOperation.FileOperation;
import OOPSeminar5.model.FileOperation.FileOperationImpl;
import OOPSeminar5.model.RepositoryFile.Repository;
import OOPSeminar5.model.RepositoryFile.RepositoryFile;
import OOPSeminar5.model.RepositoryFile.RepositoryFileNew;
import OOPSeminar5.views.ViewUser;

public class Main {
    public static void main(String[] args) {
        FileOperation fileOperation = new FileOperationImpl("usersNew.txt");
        Repository repository = new RepositoryFileNew(fileOperation);
        UserController controller = new UserController(repository);
        ViewUser view = new ViewUser(controller);
        view.run();
    }
}

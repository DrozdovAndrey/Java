package OOPSeminar5.views;

import OOPSeminar5.controllers.UserController;
import OOPSeminar5.model.User;

import java.util.List;
import java.util.Scanner;

public class ViewUser {

    private UserController userController;

    public ViewUser(UserController userController) {
        this.userController = userController;
    }

    public void run() {
        Commands com = Commands.NONE;

        while (true) {
            String command = prompt("Input command: ");
            try {
                com = Commands.valueOf(command);
            } catch (IllegalArgumentException e) {
                System.out.println("I don't now this command");
            }
            if (com == Commands.EXIT)
                return;
            try {
                switch (com) {
                    case CREATE:
                        User user = setUser(false);
                        userController.saveUser(user);
                        break;
                    case READ:
                        String id = prompt("Contact id: ");
                        User readUser = userController.readUser(id);
                        System.out.println(readUser);
                        break;
                    case LIST:
                        List<User> userList = userController.readUserList();
                        for (User u : userList) {
                            System.out.println(u);
                            System.out.println();
                        }
                        break;
                    case UPDATE:
                        User updateUser = setUser(true);
                        userController.updateUser(updateUser);
                        break;
                    case DELETE:
                        String idDeleteUser = prompt("Contact id: ");
                        User deleteUser = userController.readUser(idDeleteUser);
                        userController.deleteUser(deleteUser);

                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }




    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }

    private User setUser(boolean forUpdate) {
        String idString = "";
        if (forUpdate) {
            idString = prompt("Id: ");

        }

        String firstName = prompt("Firstname: ");
        String lastName = prompt("Lastname: ");
        String phone = prompt("Phone number: ");
        if (forUpdate) {
            return new User(idString, firstName, lastName, phone);
        }
        return new User(firstName, lastName, phone);

    }
}

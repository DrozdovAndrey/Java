package OOPSeminar5.model.RepositoryFile;

import OOPSeminar5.model.FileOperation.FileOperation;
import OOPSeminar5.model.User;
import OOPSeminar5.model.UserMapper.UserMapperNew;

import java.util.ArrayList;
import java.util.List;

public class RepositoryFileNew implements Repository {
    private UserMapperNew mapper = new UserMapperNew();
    private FileOperation fileOperation;

    public RepositoryFileNew(FileOperation fileOperation) {
        this.fileOperation = fileOperation;
    }

    @Override
    public List<User> getAllUsers() {
        List<String> lines = fileOperation.readAllLines();
        List<User> users = new ArrayList<>();
        for (String line : lines) {
            users.add(mapper.map(line));
        }
        return users;
    }

    @Override
    public String CreateUser(User user) {

        List<User> users = getAllUsers();
        int max = 0;
        for (User item : users) {
            int id = Integer.parseInt(item.getId());
            if (max < id){
                max = id;
            }
        }
        int newId = max + 1;
        String id = String.format("%d", newId);
        user.setId(id);
        users.add(user);
        saveUsers(users);
        return id;
    }

    private void saveUsers(List<User> users) {
        List<String> lines = new ArrayList<>();
        for (User item: users) {
            lines.add(mapper.map(item));
        }
        fileOperation.saveAllLines(lines);
    }


    @Override
    public User updateUser(User user) throws Exception {
        List<User> users = getAllUsers();
        User foundUser = findUserById(users, user.getId());
        foundUser.setFirstName(user.getFirstName());
        foundUser.setLastName(user.getLastName());
        foundUser.setPhone(user.getPhone());
        saveUsers(users);
        return foundUser;
    }
    private User findUserById(List<User> users, String userId) throws Exception {
        for (User user : users) {
            if (user.getId().equals(userId)) {
                return user;
            }
        }
        throw new Exception("User not found");
    }

    @Override
    public User readUser(String userId) throws Exception {
            List<User> users = getAllUsers();
            return findUserById(users, userId);
    }

    @Override
    public void deleteUser(User user) throws Exception {
        List<User> users = getAllUsers();
        User foundUser = findUserById(users, user.getId());
        users.remove(foundUser);
        saveUsers(users);


    }
}

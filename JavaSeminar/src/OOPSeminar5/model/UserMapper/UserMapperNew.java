package OOPSeminar5.model.UserMapper;

import OOPSeminar5.model.User;

public class UserMapperNew {
    public String map(User user) {
        return String.format("%s;%s;%s;%s", user.getId(),
                user.getFirstName(), user.getLastName(), user.getPhone());
    }

    public User map(String line) {
        String[] lines = line.split(";");
        return new User(lines[0], lines[1], lines[2], lines[3]);
    }
}

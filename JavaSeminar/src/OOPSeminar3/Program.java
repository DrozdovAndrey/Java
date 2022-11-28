package OOPSeminar3;

import java.util.ArrayList;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        User bigBoss = new User("Big", "Boss", 50);
        User littleBoss = new User("Little", "Boss", 30);
        List<User> users = new ArrayList<>();
        users.add(new User("Vasilii", "Pupkin", 18));
        users.add(new User("Evgenii", "Ivanov", 35));
        users.add(new User("Andrey", "Sidorov", 25));
        users.add(new User("Igor", "Klikov", 29));
        users.add(new User("Igor", "Klikov", 19));
        Personal personal = new Personal(users);
        for (User user:personal) {
            System.out.println(user);
        }
        Collections.sort(users);
        System.out.println(users);
        Company company = new Company(bigBoss);
        littleBoss.setSubordinates(users);
        bigBoss.setSubordinates(Arrays.asList(littleBoss));
        for(User user: company){
            System.out.println(user);
        }

    }
}

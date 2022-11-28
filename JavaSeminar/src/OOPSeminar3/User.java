package OOPSeminar3;

import java.util.List;

public class User implements Comparable<User>{
    private String firstName;
    private String lastName;
    private int age;
    private Personal subordinates;

    public User(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public Personal getSubordinates() {
        return subordinates;
    }

    public void setSubordinates(List<User> subordinates) {
        this.subordinates = new Personal(subordinates);
    }

    @Override
    public String toString() {
        return String.format("name: %s, last name: %s, age: %d",
                firstName, lastName, age);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(User other) {
        String temp1 = this.firstName+this.lastName;
        String temp2 = other.firstName+other.lastName;
        System.out.printf("%s %s\n", temp1, temp2);
        int result = temp1.compareTo(temp2);
        if(result==0) {

            if (this.age > other.age)
                return 1;
            else if (this.age < other.age)
                return -1;
            else
                return 0;
        }else return result;
    }
}

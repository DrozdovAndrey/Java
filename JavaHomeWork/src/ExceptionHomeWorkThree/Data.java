package ExceptionHomeWorkThree;

import java.util.ArrayList;

public class Data {

    private String lastName;
    private String firstName;
    private String fatherName;
    private String gender;
    private String phoneNumber;
    private String birthday;
    private final ArrayList<String> data = new ArrayList<String>(6);


    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getLastName() {
        return lastName;
    }

    public void setData() {
        data.add(lastName);
        data.add(firstName);
        data.add(fatherName);
        data.add(birthday);
        data.add(phoneNumber);
        data.add(gender);
    }


    @Override
    public String toString() {
        return String.format("<%s><%s><%s><%s><%s><%s>",lastName, firstName, fatherName, birthday, phoneNumber, gender);
    }
}

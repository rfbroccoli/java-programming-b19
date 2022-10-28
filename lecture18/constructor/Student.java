package constructor;

import java.util.ArrayList;

public class Student {
    public String name;
    ArrayList<String> classes;
    public Address address;

    public Student(String name, String townshipName, String cityName) {
        this.name = name;
        this.address = new Address(townshipName, cityName);
        // System.out.println("This is a line from constractor for " + this.name);
    }
}

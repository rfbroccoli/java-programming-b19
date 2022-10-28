package encapsulation;

import java.util.ArrayList;

public class Student {
    private String name;
    private Address address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Student(String name, String townshipName, String cityName) {
        this.name = name;
        this.address = new Address(townshipName, cityName);
        // System.out.println("This is a line from constractor for " + this.name);
    }
}

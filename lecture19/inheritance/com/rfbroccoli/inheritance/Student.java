package inheritance.com.rfbroccoli.inheritance;

import java.util.ArrayList;

public class Student extends RFMember {
    ArrayList<String> classesTaken;

    public Student(String name, String telegramUsername, int age, String email) {
        super(name, telegramUsername, age, email);
        this.classesTaken = new ArrayList<String>();
    }

    void joinAClass(String className) {
        this.classesTaken.add(className);
    }

    void printClasses() {
        System.out.println(this.classesTaken.toString());
    }
}

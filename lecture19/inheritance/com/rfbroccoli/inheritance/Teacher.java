package inheritance.com.rfbroccoli.inheritance;

import java.util.ArrayList;

public class Teacher extends RFMember {
    ArrayList<String> classesTeaching;

    public Teacher(String name, String telegramUsername, int age, String email) {
        super(name, telegramUsername, age, email);
        this.classesTeaching = new ArrayList<String>();

    }

    void startAClass(String className) {
        this.classesTeaching.add(className);
    }

    void printClasses() {
        System.out.println(this.classesTeaching.toString());
    }
}

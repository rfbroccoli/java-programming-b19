import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");


        Student student1 = new Student();
        Student student2 = new Student();

        boolean something = student1.equals(student2);

        System.out.println(something);
        
        System.out.println(student1.getClass());
        System.out.println(student1.age);
        System.out.println(student1.name);
        student1.attendAClass();

        Student[] studentList = {};

        System.out.println(Arrays.toString(studentList));
        // System.out.println(studentList[0]);
        // System.out.println(student1.attendAClass(););
    }
}

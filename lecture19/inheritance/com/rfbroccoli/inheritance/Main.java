package inheritance.com.rfbroccoli.inheritance;

public class Main {
    public static void main(String[] args) {

        Student student = new Student("Chaw Yupar Aung", "chaw", 16, "chaw@gmail.com");

        Teacher teacher = new Teacher("Broccoli", "rfbroccoli", 24, "rfbroccoli@gmail.com");

        student.joinAClass("Java Programming");
        student.joinAClass("Watercolor");
        student.joinAClass("Singing");
        student.printClasses();

        teacher.startAClass("Java Programming");
        teacher.printClasses();

        System.out.println(student.name);
        System.out.println(student.age);
        System.out.println(student.email);
        System.out.println(student.telegramUsername);

        System.out.println(teacher.name);
        System.out.println(teacher.age);
        System.out.println(teacher.email);
        System.out.println(teacher.telegramUsername);
    }
}

package inheritance.com.rfbroccoli.inheritance;

public class RFMember {
    String name;
    String telegramUsername;
    int age;
    String email;

    public RFMember(String name, String telegramUsername, int age, String email) {
        this.name = name;
        this.telegramUsername = telegramUsername;
        this.age = age;
        this.email = email;
    }

    void joinRF() {
        System.out.println("Join RF");
    }

    void leaveRF() {
        System.out.println("leave RF");
    }
}

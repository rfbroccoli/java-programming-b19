package encapsulation;

public class Main {
    
    public static void main(String[] args) {
        Student aungaung = new Student("Aung Aung", "San Chaung", "Yangon");
    
        System.out.println(aungaung.getName());
        System.out.println(aungaung.getAddress().getTownshipName());
        System.out.println(aungaung.getAddress().getCityName());

        // aungaung.name = "Sout Yuu";
        aungaung.setName("Sout Yuu");
        System.out.println(aungaung.getName());
    }
}

package lecture06.string;

public class Main {

    public static void main(String[] args) {
        // String greeting = "Hello";
        // System.out.println(greeting.length());

        // String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        // System.out.println("The length of the txt string is: " + txt.length());

        String greeting = "Hello";
        System.out.println("greeting.toUpperCase() : " + greeting.toUpperCase());

        System.out.println("greeting.greeting.toLowerCase() : " + greeting.toLowerCase());

        String untrimed = "     untrimed string   ";
        System.out.println("untrimed : " + untrimed);
        System.out.println("untrimed.toLowerCase() : " + untrimed.trim());

        String txt = "Please locate where 'locate' occurs!";
        System.out.println(txt.indexOf("w")); // Outputs 7

        String firstName = "John ";
        String lastName = "Doe";
        System.out.println(firstName.concat(lastName));

        String x = "10";
        int y = 20;
        String z = x + y;
        System.out.println(z);

        String newString = "We are the so-called \\\\ from the north.";
        System.out.println(newString);
    }
}

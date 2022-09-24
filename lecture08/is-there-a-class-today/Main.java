import java.util.Calendar;
// import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // int day = 1;
        // switch (day) {
        // case 1:
        // System.out.println("Monday");
        // break;
        // case 2:
        // System.out.println("Tuesday");
        // break;
        // case 3:
        // System.out.println("Wednesday");
        // break;
        // case 4:
        // System.out.println("Thursday");
        // break;
        // case 5:
        // System.out.println("Friday");
        // break;
        // case 6:
        // System.out.println("Saturday");
        // break;
        // case 7:
        // System.out.println("Sunday");
        // break;
        // }

        Calendar calendar = Calendar.getInstance();
        int today = calendar.get(Calendar.DAY_OF_WEEK);
        // int today = 5;
        switch (today) {
            case 1:
            case 5:
                System.out.println("We have a class tomorrow.");
                break;
            case 2:
            case 6:
                System.out.println("We have a class today.");
                break;
            // case 3:
            // System.out.println("We will have a class on Friday.");
            // break;
            // case 4:
            // System.out.println("We will have a class on Friday.");
            // break;
            // case 5:
            // System.out.println("We will have a class on Friday.");
            // break;

            case 3:
            case 4:
                System.out.println("We will have a class on Friday.");
                break;
            case 7:
                System.out.println("We will have a class on Monday.");
                break;
        }
    }
}
import java.util.ArrayList;
import java.util.Scanner;

// Create  
// Read 
// Update 
// Delete

public class Main {
    static Scanner scanner = new Scanner(System.in);

    static ArrayList<String> todoList = new ArrayList<String>();

    static String getStringInput(String prompt, boolean isCommand) {
        System.out.print(prompt);
        String input = scanner.nextLine();
        if (isCommand) {
            return input.toUpperCase();
        }
        return input;
    }

    static void createTodoItem(String title) {
        todoList.add(title);
        System.out.println("CREATE: " + "Todo Item " + title + " is created.");
    }

    static void readOneTodoItem(int index) {
        System.out.println("READ ONE: " + todoList.get(index));
    }

    static void readAllTodoItem() {
        System.out.println("READ ALL: " + todoList.toString());
    }

    static void updateTodoItem(int index, String updatedTitle) {
        String oldTitle = todoList.remove(index);
        todoList.add(index, updatedTitle);
        System.out.println("UPDATE: " + "Todo Item " + oldTitle + " is updated to " + updatedTitle + ".");
    }

    static void deleteTodoItem(int index) {
        String oldTitle = todoList.remove(index);
        System.out.println("DELETE: " + "Todo Item " + oldTitle + " is deleted.");
    }

    public static void main(String[] args) {
        // System.out.println(Arrays.toString(todoList));
        // System.out.println(todoList.toString());

        boolean isClose = false;
        while (!isClose) {
            String command = getStringInput("Choose a command [C]reate, [R]ead, [U]pdate, [D]elete, [E]xit: ", true);
            switch (command) {
                case "C": {
                    String title = getStringInput("Type in the title: ", false);
                    createTodoItem(title);
                    System.out.println("----------");
                    break;
                }
                case "R": {
                    readAllTodoItem();
                    System.out.println("----------");
                    break;
                }
                case "U": {
                    String indexString = getStringInput("Type in the index: ", false);
                    int index = Integer.parseInt(indexString);
                    String title = getStringInput("Type in the title: ", false);
                    updateTodoItem(index, title);
                    System.out.println("----------");
                    break;
                }
                case "D": {
                    String indexString = getStringInput("Type in the index: ", false);
                    int index = Integer.parseInt(indexString);
                    deleteTodoItem(index);
                    System.out.println("----------");
                    break;
                }
                case "E": {
                    System.out.println("Bye!");
                    isClose = true;
                }
            }
        }
        // createTodoItem("Teach RF Java Class");
        // createTodoItem("Have Dinner");
        // createTodoItem("Code A Game App");

        // readAllTodoItem();

        // readOneTodoItem(2);

        // updateTodoItem(1, "Have Dinner Outside");

        // readAllTodoItem();

        // deleteTodoItem(1);

        // readAllTodoItem();
   
        scanner.close();
    }
}

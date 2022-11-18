import java.util.ArrayList;
import java.util.Scanner;

enum Action {
    CREATED,
    READ,
    UPADTED,
    DELETED
}

public class App {
    private boolean isAppClose;
    private Scanner scanner;
    private Repository repository;

    public App() {
        isAppClose = false;
        scanner = new Scanner(System.in);
        repository = new Repository();
    }

    public void welcome() {
        System.out.println("Welcome to password generator!");
    }

    private String getStringInput(String prompt, boolean isCommand) {
        System.out.print(prompt);
        String input = this.scanner.nextLine();
        if (isCommand) {
            return input.toUpperCase();
        }
        return input;
    }

    private void createItem() {
        String name = getStringInput("Name: ", false);
        String url = getStringInput("URL: ", false);
        String username = getStringInput("Username: ", false);
        String password = getStringInput("Password (leave empty to generate a random one): ", false);
        Item item = repository.create(name, url, username, password);
        item.display();
        System.out.println("SUCCESSFULLY " + Action.CREATED);
    }

    private void updateItem(int id) {
        String name = getStringInput("Name (leave empty to remain the same): ", false);
        String url = getStringInput("URL (leave empty to remain the same): ", false);
        String username = getStringInput("Username (leave empty to remain the same): ", false);
        String password = getStringInput("Password (leave empty to remain the same): ", false);
        Item item = repository.update(id, name, url, username, password);
        item.display();
        System.out.println("SUCCESSFULLY " + Action.CREATED);
    }

    private void readAllItems() {
        ArrayList<Item> itemLists = this.repository.readAll();
        for (int i = 0; i < itemLists.size(); i++) {
            itemLists.get(i).display();
        }
        System.out.println("SUCCESSFULLY " + Action.READ);
    }

    private void readOneItem(int id) {
        Item item = this.repository.read(id);
        item.display();
        System.out.println("SUCCESSFULLY " + Action.READ);
    }

    private void deleteItem(int id) {
        this.repository.delete(id);
        System.out.println("SUCCESSFULLY " + Action.DELETED);
    }

    public void startApp() {
        while (!isAppClose) {
            String command = getStringInput("Choose a command [C]reate, [R]ead, [U]pdate, [D]elete, [E]xit: ", true);
            switch (command) {
                case "C": {
                    this.createItem();
                    break;
                }
                case "R": {
                    String idString = getStringInput("Choose an ID (leave empty to choose all): ", false);
                    if (idString == "") {
                        this.readAllItems();
                    } else {
                        int id = Integer.parseInt(idString);
                        this.readOneItem(id);
                    }
                    break;
                }
                case "U": {
                    String idString = getStringInput("Choose an ID: ", false);
                    System.out.println();
                    int id = Integer.parseInt(idString);
                    this.updateItem(id);
                    break;
                }
                case "D": {
                    String idString = getStringInput("Choose an ID: ", false);
                    System.out.println();
                    int id = Integer.parseInt(idString);
                    this.deleteItem(id);
                    break;
                }
                case "E": {
                    System.out.println("Bye!");
                    this.scanner.close();
                    isAppClose = true;
                }
            }
            System.out.println("----------");
        }

    }
}

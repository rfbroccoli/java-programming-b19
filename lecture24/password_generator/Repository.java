import java.util.ArrayList;
import java.util.Random;

public class Repository {
    private ArrayList<Item> itemList;

    private int IDCount;

    public Repository() {
        this.itemList = new ArrayList<Item>();
        IDCount = 0;
    }

    // public void test() {
    //     int leftLimit = 1; // letter 'a'
    //     int rightLimit = 10; // letter 'z'
    //     Random random = new Random();
    //     int randomLimitedInt = leftLimit + (int) (random.nextFloat() * (rightLimit - leftLimit + 1));
    //     System.out.println(randomLimitedInt);
    // }

    public String generatePassword() {

        int leftLimit = 33; // letter '!'
        int rightLimit = 122; // letter 'z'
        int targetStringLength = 8;
        Random random = new Random();
        StringBuilder buffer = new StringBuilder(targetStringLength);
        for (int i = 0; i < targetStringLength; i++) {
            int randomLimitedInt = leftLimit + (int) (random.nextFloat() * (rightLimit -
                    leftLimit + 1));
            buffer.append((char) randomLimitedInt);
        }
        String generatedString = buffer.toString();

        return generatedString;
    }

    public Item create(String name, String url, String username, String password) {
        int id = this.IDCount;
        if (password == "") {
            password = generatePassword();
        }
        Item item = new Item(id, name, url, username, password);
        this.itemList.add(item);
        IDCount++;
        return item;
    }

    public Item read(int id) {
        // return this.itemList.get(id);
        for (int i = 0; i < this.itemList.size(); i++) {
            Item item = this.itemList.get(i);
            if (item.getId() == id) {
                return item;
            }
        }
        return null;
    }

    public ArrayList<Item> readAll() {
        return this.itemList;
    }

    public Item update(int id, String name, String url, String username, String password) {
        Item item = this.read(id);
        if (name != "") {
            item.setName(name);
        }
        if (url != "") {
            item.setUrl(url);
        }
        if (url != "") {
            item.setUsername(username);
        }
        if (password != "") {
            item.setPassword(password);
        }
        return item;

    }

    public void delete(int id) {
        this.itemList.remove(id);
    }

}

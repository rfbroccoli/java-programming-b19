import java.util.ArrayList;

public class Repository {
    private ArrayList<Item> itemList;

    public Repository() {
        this.itemList = new ArrayList<Item>();
    }

    public String generatePassword() {
        String generatedPassword;
        generatedPassword = "helloworld";
        return generatedPassword;
    }

    public Item create(String name, String url, String password) {
        int id = this.itemList.size();
        if (password == "") {
            password = generatePassword();
        }
        Item item = new Item(id, name, password, url);
        this.itemList.add(item);
        return item;
    }

    public Item read(int id) {
        return this.itemList.get(id);
    }

    public ArrayList<Item> readAll() {
        return this.itemList;
    }

    public Item update(int id, String name, String url, String password) {
        Item item = this.itemList.get(id);
        if (name != "") {
            item.setName(name);
        }
        if (url != "") {
            item.setUrl(url);
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

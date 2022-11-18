public class Item {

    private int id;
    private String name;
    private String url;
    private String username;

    private String password;

    public Item(int id, String name, String url, String username, String password) {
        this.id = id;
        this.name = name;
        this.username = username;
        this.password = password;
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void display() {
        System.out.println();
        System.out.println("ID: " + this.id);
        System.out.println("Name: " + this.name);
        System.out.println("URL: " + this.url);
        System.out.println("Username: " + this.username);
        System.out.println("Password: " + this.password);
    }
}

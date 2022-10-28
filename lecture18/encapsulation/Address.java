package encapsulation;

public class Address {

    private String townshipName;
    private String cityName;

    public String getTownshipName() {
        return townshipName;
    }

    public void setTownshipName(String townshipName) {
        this.townshipName = townshipName;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public Address(String townshipName, String cityName) {
        this.townshipName = townshipName;
        this.cityName = cityName;
    }


}

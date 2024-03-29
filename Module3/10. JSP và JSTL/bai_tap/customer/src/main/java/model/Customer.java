package model;

public class Customer {
    private String name;
    private String birthday;
    private String address;
    private String linkImg;

    public Customer() {
    }

    public Customer(String name, String birthday, String address, String linkImg) {
        this.name = name;
        this.birthday = birthday;
        this.address = address;
        this.linkImg = linkImg;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getLinkImg() {
        return linkImg;
    }

    public void setLinkImg(String linkImg) {
        this.linkImg = linkImg;
    }
}

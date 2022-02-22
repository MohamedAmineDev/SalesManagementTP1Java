package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Provider implements IProvider {
    private static int defaultId = 0;
    private int id;
    private String name;
    private String addressMail;
    private int phoneNumber;
    private String websiteUrl;
    private List<Product> products;

    public Provider() {
        defaultId++;
        id = defaultId;
        name = new String();
        addressMail = new String();
        phoneNumber = 0;
        websiteUrl = new String();
        products = new ArrayList<>();
    }

    public Provider(String name, String addressMail, int phoneNumber, String websiteUrl) {
        defaultId++;
        id = defaultId;
        this.name = name;
        this.addressMail = addressMail;
        this.phoneNumber = phoneNumber;
        this.websiteUrl = websiteUrl;
        products = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddressMail() {
        return addressMail;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public String getWebsiteUrl() {
        return websiteUrl;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddressMail(String addressMail) {
        this.addressMail = addressMail;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setWebsiteUrl(String websiteUrl) {
        this.websiteUrl = websiteUrl;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Provider)) return false;
        Provider provider = (Provider) o;
        return getName().equals(provider.getName()) && getAddressMail().equals(provider.getAddressMail());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAddressMail());
    }

    @Override
    public String toString() {
        return "Provider{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", addressMail='" + addressMail + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", websiteUrl='" + websiteUrl + '\'' +
                ", products=" + products +
                '}';
    }

    @Override
    public boolean addProduct(Product product) throws Exception {
        return false;
    }

    @Override
    public void displayProducts() {

    }
}

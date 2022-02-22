package model;

import java.time.LocalDate;
import java.util.Objects;

public class Product {
    private static int defaultId = 0;
    private int id;
    private String label;
    private double price;
    private LocalDate endConsommationDate;
    private LocalDate creationDate;
    private Provider provider;

    public Product() {
        defaultId++;
        id = defaultId;
        label = new String();
        price = 0;
        endConsommationDate = null;
        creationDate = LocalDate.now();
        provider = new Provider();
    }

    public Product(String label, double price, LocalDate endConsommationDate, LocalDate creationDate) {
        defaultId++;
        id = defaultId;
        this.label = label;
        this.price = price;
        this.endConsommationDate = endConsommationDate;
        this.creationDate = creationDate;
        provider = new Provider();
    }

    public int getId() {
        return id;
    }

    public String getLabel() {
        return label;
    }

    public double getPrice() {
        return price;
    }

    public LocalDate getEndConsommationDate() {
        return endConsommationDate;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }

    public Provider getProvider() {
        return provider;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setEndConsommationDate(LocalDate endConsommationDate) {
        this.endConsommationDate = endConsommationDate;
    }

    public void setCreationDate(LocalDate creationDate) {
        this.creationDate = creationDate;
    }

    public void setProvider(Provider provider) {
        this.provider = provider;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product)) return false;
        Product product = (Product) o;
        return getLabel().equals(product.getLabel()) && getEndConsommationDate().equals(product.getEndConsommationDate()) && getCreationDate().equals(product.getCreationDate());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getLabel(), getEndConsommationDate(), getCreationDate());
    }

    @Override
    public String toString() {
        return "Product{" +
                "" + "Label : " + label +
                "\nPrice : " + price +
                "\nCreate at : " + creationDate +
                "\nEnd of consommation date : " + endConsommationDate
                + "\nProvider name : " + provider.getName() + "" +
                "}";
    }
}

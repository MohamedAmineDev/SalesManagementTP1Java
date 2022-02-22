package model;

public interface IProvider {
    boolean addProduct(Product product) throws Exception;

    void displayProducts();
}

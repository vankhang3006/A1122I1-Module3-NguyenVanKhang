package model;

public class Product {
    private int id;
    private String name;
    private double price;
    private int quantity;
    private String color;
    private int categoryId;

    public Product(int id, String name, double price, int quantity, String color, int categoryId) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.color = color;
        this.categoryId = categoryId;
    }

    public Product(String name, double price, int quantity, String color, int categoryId) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.color = color;
        this.categoryId = categoryId;
    }

    public Product() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }
}

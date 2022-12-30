import javax.swing.*;

public class Product {
    private String name;
    private String description;
    private double price;
    private ImageIcon image;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public ImageIcon getImage() {
        return image;
    }

    public void setImage(ImageIcon image) {
        this.image = image;
    }

    public Product(String name, String description, double price, ImageIcon image) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.image = image;
    }
}

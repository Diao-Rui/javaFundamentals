package javaSE.basicOOP.entity;

/**
 * @Author Diao Rui
 * @Date 2023/5/23 10:00
 * @PackageName:javaSE.basicOOP.entity
 * @ClassName: Book
 * @Description: TODO
 * @Version 1.0
 */
public class Book {
    private String name;
    private String author;
    private double price;

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

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}

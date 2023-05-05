package javaSE.basicGrammar.test;

import java.util.Arrays;

/**
 * @Author Diao Rui
 * @Date 2023/5/3 16:37
 * @PackageName:javaSE.basicGrammar.test
 * @ClassName: Price
 * @Description: TODO
 * @Version 1.0
 */
public class Price {
    private String name;
    private double price[];
    private double sum;

    public double[] getPrice() {
        return price;
    }

    public void setPrice(double[] price) {
        double temp = 0.0;
        for (int i = 0; i < price.length; i++)
            temp += price[i];
        this.sum = temp;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSum() {
        return sum;
    }

    @Override
    public String toString() {
        return "Price{" +
                "name='" + name + '\'' +
                ", price=" + Arrays.toString(price) +
                ", sum=" + sum +
                '}';
    }
}
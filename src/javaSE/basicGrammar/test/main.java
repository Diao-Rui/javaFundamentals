package javaSE.basicGrammar.test;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author Diao Rui
 * @Date 2023/5/3 16:44
 * @PackageName:javaSE.basicGrammar.test
 * @ClassName: main
 * @Description: TODO
 * @Version 1.0
 */
public class main {
    public static void main(String[] args) {
        List<Price> prices = new ArrayList<>();
        Price temp = new Price();
        temp.setName("酒店费用");
        double jd[] = {128, 128};
        temp.setPrice(jd);
        prices.add(temp);

        temp = new Price();
        temp.setName("吃饭钱");
        double cf[] = {16, 90, 4, 30, 66, 7, 13, 8};
        temp.setPrice(cf);
        prices.add(temp);

        temp = new Price();
        temp.setName("通勤");
        double tq[] = {32.5, 19.5, 15, 43.5};
        temp.setPrice(tq);
        prices.add(temp);

        temp = new Price();
        temp.setName("门票");
        double mp[] = {45, 30, 10};
        temp.setPrice(mp);
        prices.add(temp);

        temp = new Price();
        temp.setName("公交地铁");
        double gjtd[] = {6, 2, 3, 3, 3, 3, 3, 3, 3, 1.5,};
        temp.setPrice(gjtd);
        prices.add(temp);

        temp = new Price();
        temp.setName("其余费用");
        double qt[] = {4, 46,};
        temp.setPrice(tq);
        prices.add(temp);
        show(prices);

        double arr[] = {256, 90, 10, 6, 7, 4.04, 2, 66, 3, 3, 3, 3, 10, 46, 4, 13, 3, 3, 3, 45, 30, 32.5, 19.5};
    }

    public static void show(List<Price> prices) {
        double sum = 0.0;
        for (Price price : prices) {
            sum += price.getSum();
            System.out.println(price);
        }
        System.out.println("总计" + sum);
    }
}

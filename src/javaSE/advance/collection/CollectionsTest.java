package javaSE.advance.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @Author Diao Rui
 * @Date 2023/6/26 15:01
 * @PackageName:javaSE.advance.collection
 * @ClassName: CollectionsTest
 * @Description: TODO
 * @Version 1.0
 */
public class CollectionsTest {
    public static void main(String[] args) {
        String[] cards = new String[]{"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        String[] colors = new String[]{"♢", "♣", "♡", "♠"};
        List<String> poker = new ArrayList<>();
        for (String color : colors) {
            for (String card : cards) {
                poker.add(color + card);
            }
        }
        poker.add("大王");
        poker.add("小王");
        //洗牌
        Collections.shuffle(poker);

        //发牌
        List<String> tom = new ArrayList<>();
        List<String> jerry = new ArrayList<>();
        List<String> lucy = new ArrayList<>();
        List<String> last = new ArrayList<>();

        for (int i = 0; i < poker.size(); ) {
            if (i >= poker.size() - 3) {
                last.add(poker.get(i));
                i++;
            } else {
                tom.add(poker.get(i));
                jerry.add(poker.get(i + 1));
                lucy.add(poker.get(i + 2));
                i += 3;
            }
        }
        //看牌
        System.out.println(tom);
        System.out.println(jerry);
        System.out.println(lucy);
        System.out.println(last);
    }
}

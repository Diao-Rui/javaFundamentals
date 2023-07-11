package javaSE.LeetCode.simple.simple901_1200;

/**
 * @Author Diao Rui
 * @Date 2023/6/21 16:48
 * @PackageName:javaSE.LeetCode.simple.simple901_1200
 * @ClassName: Simple1189
 * @Description: TODO
 * @Version 1.0
 */
public class Simple1189 {
    public static void main(String[] args) {
        System.out.println(new Simple1189().maxNumberOfBalloons("loonbalxballpoon"));
    }

    public int maxNumberOfBalloons(String text) {
        int[] res = new int[128];
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            res[text.charAt(i)]++;
        }
        while (true) {
            if (res['b'] > 0 && res['a'] > 0 && res['l'] > 1 && res['o'] > 1 && res['n'] > 0) {
                count++;
                res['b']--;
                res['a']--;
                res['l'] -= 2;
                res['o'] -= 2;
                res['n'] --;
            } else {
                break;
            }
        }
        return count;
    }
}

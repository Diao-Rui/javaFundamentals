package javaSE.LeetCode.simple.simple1201_1500;

/**
 * @Author Diao Rui
 * @Date 2023/6/22 16:03
 * @PackageName:javaSE.LeetCode.simple.simple1201_1500
 * @ClassName: Simple1287
 * @Description: TODO
 * @Version 1.0
 */
public class Simple1287 {
    public static void main(String[] args) {
        System.out.println(new Simple1287().maximum69Number(9669));
        //System.out.println(new Simple1287().findSpecialInteger(new int[]{1, 2, 2, 6, 6, 6, 6, 7, 10}));
    }

    public int findSpecialInteger(int[] arr) {
        int i = 0, j = 1, temp = 1, res = 0;
        if (arr.length < 2)
            return arr[0];
        while (j < arr.length) {
            while (j < arr.length && arr[i] == arr[j])
                j++;
            temp = j - i;
            if (temp > (arr.length / 4)) {
                res = arr[i];
                break;
            }

            i = j;
            j++;
        }
        return res;
    }

    public int maximum69Number(int num) {
        int[] s = new int[4];
        int j = 0;
        while (num > 0) {
            s[j++] = num % 10;
            num /= 10;
        }
        int i = j - 1, res = 0;
        while (i >= 0) {
            if (s[i] == 6) {
                s[i] = 9;
                break;
            }
            i--;
        }
        i = j - 1;
        while (i >= 0) {
            res = res * 10 + s[i];
            i--;
        }
        return res;
    }
}

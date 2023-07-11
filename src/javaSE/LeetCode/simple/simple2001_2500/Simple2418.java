package javaSE.LeetCode.simple.simple2001_2500;

import java.util.Arrays;

/**
 * @Author Diao Rui
 * @Date 2023/6/26 17:24
 * @PackageName:javaSE.LeetCode.simple.simple2001_2500
 * @ClassName: Simple2418
 * @Description: TODO
 * @Version 1.0
 */
public class Simple2418 {
    public static void main(String[] args) {
        String[] strings = sortPeople(new String[]{"Mary", "John", "Emma"}, new int[]{180, 165, 170});
        System.out.println(Arrays.toString(strings));
    }

    public static String[] sortPeople(String[] names, int[] heights) {
        int n = names.length;
        Integer[] index = new Integer[n];
        for (int i = 0; i < n; i++) {
            index[i] = i;
        }
        //普通写法
//        Arrays.sort(index, new Comparator<Integer>() {
//                @Override
//                public int compare(Integer o1, Integer o2) {
//                    return heights[o2] - heights[o1];
//                }
//        });
        //lamda表达式
        Arrays.sort(index, (a, b) -> heights[b] - heights[a]);
        String[] res = new String[n];
        for (int i = 0; i < n; i++) {
            res[i] = names[index[i]];
        }
        return res;
    }
}

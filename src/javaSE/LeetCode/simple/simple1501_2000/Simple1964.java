package javaSE.LeetCode.simple.simple1501_2000;

/**
 * @Author Diao Rui
 * @Date 2023/6/27 17:18
 * @PackageName:javaSE.LeetCode.simple.simple1501_2000
 * @ClassName: Simple1964
 * @Description: 1694. 重新格式化电话号码
 * @Version 1.0
 */
public class Simple1964 {
    public static void main(String[] args) {
        System.out.println(reformatNumber("123 4-56--17-5 229 35-39475"));
    }

    public static String reformatNumber(String number) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < number.length(); i++) {
            if (number.charAt(i) != ' ' && number.charAt(i) != '-')
                builder.append(number.charAt(i));
        }
        int len = builder.length();
        StringBuilder res = new StringBuilder();
        int i = 0;
        while (len > 0) {
            if (len > 4) {
                res.append(builder.substring(i, i + 3)).append("-");
                i += 3;
                len -= 3;
            } else {
                if (len == 4) {
                    res.append(builder.substring(i, i + 2)).append("-");
                    //最后两位不需要添加-
                    res.append(builder.substring(i + 2, i + 4));
                } else {
                    //最后少于4为的都不需要-
                    res.append(builder.substring(i, i + len));
                }
                break;
            }
        }

        return res.toString();
    }
}

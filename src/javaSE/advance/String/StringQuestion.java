package javaSE.advance.String;

/**
 * @Author Diao Rui
 * @Date 2023/6/19 14:33
 * @PackageName:javaSE.advance.String
 * @ClassName: StringQuestion
 * @Description: TODO
 * @Version 1.0
 */
public class StringQuestion {
    public static void main(String[] args) {
        String str = "ll he ll o wor ll d ll ll ll";
        StringBuilder builder = new StringBuilder();
        StringQuestion question = new StringQuestion();
        System.out.println(question.reverse(str, 0, 4));
        System.out.println(question.subStringCount(str, "ll"));
    }

    public String reverse(String str, int start, int end) {
        char[] chars = str.toCharArray();
        while (start < end) {
            char temp = chars[start];
            chars[start] = chars[end];
            chars[end] = temp;
            start++;
            end--;
        }
        return new String(chars);
    }

    public int subStringCount(String str, String subStr) {
        int count = 0;
        int index = str.indexOf(subStr);
        while (index >= 0) {
            count++;
            index = str.indexOf(subStr, index + subStr.length());
        }
        return count;
    }
}

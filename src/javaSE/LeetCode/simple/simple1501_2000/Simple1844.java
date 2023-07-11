package javaSE.LeetCode.simple.simple1501_2000;

/**
 * @Author Diao Rui
 * @Date 2023/6/28 10:02
 * @PackageName:javaSE.LeetCode.simple.simple1501_2000
 * @ClassName: Simple1844
 * @Description: TODO
 * @Version 1.0
 */
public class Simple1844 {
    public static void main(String[] args) {
        System.out.println(replaceDigits("a1c1e1"));
    }
    public static String replaceDigits(String s) {
        StringBuilder res = new StringBuilder();
        int k=0;
        for(int i=0;i<s.length();i++){
            char t=s.charAt(i);
            if(t>='a' && t<='z'){
                res.append(t);
                k++;
            }else{
                System.out.println(res.charAt(k-1));
                System.out.println(t-'0');
                res.append((char)(res.charAt(k-1)+(t-'0')));
                k++;
            }
        }
        return res.toString();
    }
}

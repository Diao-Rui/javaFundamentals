package javaSE.LeetCode.simple;

/**
 * @Author Diao Rui
 * @Date 2023/6/4 9:56
 * @PackageName:javaSE.LeetCode.simple
 * @ClassName: Simple2586
 * @Description: TODO
 * @Version 1.0
 */
public class Simple2586 {
    public static void main(String[] args) {

    }
    public int vowelStrings(String[] words, int left, int right) {
        int res=0;
        for(int i=left;i<=right;i++){
            if(isVolum(words[i].charAt(0))&&isVolum(words[i].charAt(words[i].length()-1)))
                res++;
        }
        return res;
    }
    public boolean isVolum(char s){
        return s=='a'||s=='e'||s=='i'||s=='o'||s=='u';
    }
}

package javaSE.LeetCode.simple.simple1201_1500;

import javaSE.HighOOP.entity.enumTest.INFO;
import javaSE.utils.MapUtil;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @Author Diao Rui
 * @Date 2023/6/20 17:40
 * @PackageName:javaSE.LeetCode.simple.simple1201_1500
 * @ClassName: Simple1207
 * @Description: TODO
 * @Version 1.0
 */
public class Simple1207 {
    public static void main(String[] args) {
        System.out.println(new Simple1207().uniqueOccurrences(new int[]{1, 2, 2, 1, 1, 3}));
    }
    public boolean uniqueOccurrences(int[] arrs) {
        Map<Integer,Integer> map=new HashMap<>();
        Set<Integer> set = new HashSet<>();
        for(int arr:arrs){
            if(map.containsKey(arr)){
                map.put(arr,map.get(arr)+1);
            }else{
                map.put(arr,1);
            }
        }
        for(Map.Entry<Integer, Integer>entry:map.entrySet()){
            if(set.contains(entry.getValue())){
                return false;
            }
            set.add(entry.getValue());
        }
        return true;
    }
}

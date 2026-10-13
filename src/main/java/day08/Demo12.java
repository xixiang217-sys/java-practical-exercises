package Java_08;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Demo12 {
    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<>(Map.of("apple", 5, "banana", 8, "orange", 3));
        System.out.println(hashMap.entrySet());
        Set<Map.Entry<String, Integer>> entries = hashMap.entrySet();
        for (Map.Entry<String, Integer> m:hashMap.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }




    }
}
//第 12 题
//Map：{"apple":5,"banana":8,"orange":3}
//使用entrySet 方式遍历 map，打印每一组键值对。
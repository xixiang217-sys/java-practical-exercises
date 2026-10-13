package Java_08;

import java.util.HashMap;
import java.util.Map;

public class Demo11 {
    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<>(Map.of("a", 10, "b", 20, "c", 30));

        for (String s : hashMap.keySet()) {
            System.out.println(s + "=" + hashMap.get(s));
        }
    }
}
//第 11 题
//Map：{"a":10,"b":20,"c":30}
//使用keySet 方式遍历 map，打印每一组键和值。
//---
//第 12 题
//Map：{"apple":5,"banana":8,"orange":3}
//使用entrySet 方式遍历 map，打印每一组键值对。
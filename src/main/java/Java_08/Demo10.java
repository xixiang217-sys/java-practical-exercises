package Java_08;

import java.util.HashMap;
import java.util.Map;

public class Demo10 {
    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<>(Map.of("name", "小明", "gender", "男", "age", "18"));
        System.out.println(hashMap.containsKey("gender"));
        hashMap.remove("age");
        System.out.println(hashMap.size());


    }
}
//第 10 题
//创建HashMap<String,String>，存入：
//"name":"小明","gender":"男","age":"18"
//1. 判断是否包含键"gender"
//2. 删除键为"age"的元素
//3. 获取 map 集合中键值对的数量
//---
//第 11 题
//Map：{"a":10,"b":20,"c":30}
//使用keySet 方式遍历 map，打印每一组键和值。
//---
//第 12 题
//Map：{"apple":5,"banana":8,"orange":3}
//使用entrySet 方式遍历 map，打印每一组键值对。
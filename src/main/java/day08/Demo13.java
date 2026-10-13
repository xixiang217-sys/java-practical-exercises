package Java_08;

import java.util.*;

public class Demo13 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("a", "b", "a", "c", "b", "a", "d"));
        HashSet<String> hashSet = new HashSet<>(list);
        HashMap<String, Integer> hashMap = new HashMap<>();
        for (String s : hashSet) {
            Integer count = 0;
            for (String s1 : list) {
                if (s.equals(s1)) {
                    count++;
                }
            }
            hashMap.put(s, count);
        }

        System.out.println(hashMap.entrySet());

    }
}
//第 13 题
//给定List<String> list = ["a","b","a","c","b","a","d"]
//利用 Map 统计每个字符串出现的次数。
//思路：key 存字符串，value 存出现次数。
//---
//第14 题
//两个 Map：
//map1: {101:"苹果",102:"香蕉",103:"橙子"}
//map2: {103:"橙子",104:"葡萄",105:"芒果"}
//找出两个 map都存在的 key，输出对应的 key 和 value。
//---
//第 15 题
//自定义 Student 类，属性 id,name；使用 HashMap，key 为学生 id (Integer)，value 为 Student 对象。
//存入：
//1,new Student (1,"张三")
//2,new Student (2,"李四")
//遍历 map，打印全部学生信息
//---
//第 16 题
//字符串"abacbcad"，统计字符串中每个字符出现多少次，用 HashMap 实现。
//key：Character 字符，value：出现次数。
package Java_08;

import java.util.HashMap;
import java.util.Map;

public class Demo14 {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap01 = new HashMap<>(Map.of(101, "苹果", 102, "香蕉", 103, "橙子"));
        HashMap<Integer, String> hashMap02 = new HashMap<>(Map.of(103, "橙子", 104, "葡萄", 105, "芒果"));
//        for (Integer i:hashMap01.keySet()){
//            for (Integer j:hashMap02.keySet()){
//                if (i.equals(j)){
//                    System.out.print(i);
//                    System.out.println(hashMap01.get(i));
//                }
//            }
//
//        }
        for (Integer i : hashMap01.keySet()) {
            if (hashMap02.containsKey(i)) {
                System.out.print(i);
                System.out.println(hashMap01.get(i));
            }
        }

    }
}
/// /第14 题
/// /两个 Map：
/// /map1: {101:"苹果",102:"香蕉",103:"橙子"}
/// /map2: {103:"橙子",104:"葡萄",105:"芒果"}
/// /找出两个 map都存在的 key，输出对应的 key 和 value。
/// /---
/// /第 15 题
/// /自定义 Student 类，属性 id,name；使用 HashMap，key 为学生 id (Integer)，value 为 Student 对象。
/// /存入：
/// /1,new Student (1,"张三")
/// /2,new Student (2,"李四")
/// /遍历 map，打印全部学生信息
/// /---
/// /第 16 题
/// /字符串"abacbcad"，统计字符串中每个字符出现多少次，用 HashMap 实现。
/// /key：Character 字符，value：出现次数。
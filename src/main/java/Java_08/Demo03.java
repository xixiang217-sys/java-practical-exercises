package Java_08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Demo03 {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>(Arrays.asList(10, 20, 20, 30, 30, 30));

        HashSet<Integer> hashSet = new HashSet<>(integerList);
        System.out.println(hashSet);


    }
}
//第 3 题
//给定 List：[10, 20, 20, 30, 30, 30]
//利用HashSet对 List 去重，把去重后的结果打印出来。
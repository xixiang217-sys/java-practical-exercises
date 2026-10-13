package Java_08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Demo05 {
    public static void main(String[] args) {
        List<Integer> list01 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        List<Integer> list02 = new ArrayList<>(Arrays.asList(4, 5, 6, 7, 8));

//        list01.retainAll(list02);
//        System.out.println(list01);

        HashSet<Integer> hashSet01=new HashSet<>(list01);
        HashSet<Integer> hashSet02=new HashSet<>(list02);
        hashSet01.retainAll(hashSet02);
        System.out.println(hashSet01);


    }
}
//第 5 题
//两个 List 集合：
//listA：[1,2,3,4,5]
//listB：[4,5,6,7,8]
//求交集（两个集合都存在的元素），用 Set 实现。
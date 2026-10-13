package Java_08;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Demo16 {
    public static void main(String[] args) {
        String a = "abacbcad";
        char[] b = a.toCharArray();
        List<Character> list = new ArrayList<>();
        for (int i = 0; i < b.length; i++) {
            list.add(b[i]);
        }
        HashSet<Character> hashSet = new HashSet<>(list);
        HashMap<Character, Integer> hashMap = new HashMap<>();

        for (Character character : hashSet) {
            int count = 0;
            for (Character character1 : list) {
                if (character1.equals(character)) {
                    count++;
                }
            }
            hashMap.put(character, count);
        }
        System.out.println(hashMap.entrySet());
    }
}
/// ///第 16 题
/// ///字符串"abacbcad"，统计字符串中每个字符出现多少次，用 HashMap 实现。
/// ///key：Character 字符，value：出现次数。
package Java_08;

import java.util.ArrayList;
import java.util.Arrays;

public class Demo02 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(11, 22, 33, 44, 55));

        list.remove(2);
        System.out.println(list.contains(44));
        System.out.println(list.size());


    }
}

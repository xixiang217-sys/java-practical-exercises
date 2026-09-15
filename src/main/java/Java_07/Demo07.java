package Java_07;

import java.util.LinkedList;

public class Demo07 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("A");
        list.add("B");
        list.add("C");

        list.addFirst("start");
        list.addLast("end");

        System.out.println(list.getFirst());
        System.out.println(list.getLast());

        for (String string : list) {
            System.out.println(string);
        }
    }
}

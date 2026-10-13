package java_12;

import java.util.ArrayList;
import java.util.List;

public class Demo03 {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();

        list.stream().filter(a->a.length()>=2).limit(7).skip(2).forEach(a-> System.out.println(a));

    }
}

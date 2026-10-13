package Java_08;

import java.util.HashSet;
import java.util.Set;

public class Demo04 {
    public static void main(String[] args) {

        HashSet<String> list = new HashSet<>();//set.of方法不允許重複元素
        list.add("张三");
        list.add("李四");
        list.add("张三");
        list.add("王五");

        System.out.println(list);
        System.out.println(list.contains("李四"));

    }
}
//创建HashSet<String>，存入 "张三","李四","张三","王五"。
//1. 观察打印结果，说明 Set 的特点
//2. 判断集合是否包含 "李四"
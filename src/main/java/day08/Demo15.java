package Java_08;

import java.util.HashMap;
import java.util.HashSet;

public class Demo15 {
    public static void main(String[] args) {
        HashMap<Integer, Student> hashMap = new HashMap<>();
        Student student01 = new Student(1, "张三");
        Student student02 = new Student(2, "李四");
        hashMap.put(student01.getId(), student01);
        hashMap.put(student02.getId(), student02);
        System.out.println(hashMap);
    }
}
/// ///第 15 题
/// ///自定义 Student 类，属性 id,name；使用 HashMap，key 为学生 id (Integer)，value 为 Student 对象。
/// ///存入：
/// ///1,new Student (1,"张三")
/// ///2,new Student (2,"李四")
/// ///遍历 map，打印全部学生信息

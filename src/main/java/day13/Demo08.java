package java_13;

import java.util.HashSet;

public class Demo08 {
    public static void main(String[] args) {
        HashSet<Student>set=new HashSet<>();
        set.add(new Student("aa",18));
        set.add(new Student("bb",20));
        set.add(new Student("cc",17));
        set.add(new Student("aa",22));

        for (Student student : set) {
            if (student.getName().equals("aa")){
                System.out.println(student);
            }
        }
    }
}
//8. 创建HashSet存储多个Student对象，遍历集合，找出姓名为"张三"的学生并输出。

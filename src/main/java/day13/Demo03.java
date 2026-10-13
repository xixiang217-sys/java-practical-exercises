package java_13;

import java.util.HashSet;

public class Demo03 {
    public static void main(String[] args) {
        Student student01=new Student("aa",18);
        Student student02=new Student("aa",18);

        HashSet<Student>set=new HashSet<>();
        set.add(student01);
        set.add(student02);

        System.out.println("集合大小："+set.size());
        for (Student student : set) {
            System.out.println(student);
        }
    }
}
//3. 创建2个Student对象，属性完全相同，将它们放入HashSet，观察结果并重写equals和hashCode方法实现去重。

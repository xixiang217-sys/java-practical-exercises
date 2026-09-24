package java_13;

import java.util.HashMap;

public class Demo05 {
    public static void main(String[] args) {
        HashMap<Integer,Student>map=new HashMap<>();

        map.put(1,new Student("aa",18));
        map.put(2,new Student("bb",20));
        map.put(3,new Student("cc",17));

        Student student = map.get(2);
        System.out.println("查询到："+student);

        map.remove(3);
        System.out.println("删除后："+map);
    }
}
//5. 使用HashMap存储学生编号和Student对象，编号为key，对象为value，完成添加、根据编号查询学生、删除学生操作。

package day07.demo06;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<Student> students=new ArrayList<>();
        Student student01=new Student("xiangxi",20);
        Student student02=new Student("aimishi",19);

        students.add(student01);
        students.add(student02);

        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i).toString());
        }
    }
}

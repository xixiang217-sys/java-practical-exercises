package day05.part01;

public class Test {
    public static void main(String[] args) {
        Student student=new Student();
        student.study();
        Teacher teacher=new Teacher();
        teacher.study();

        Student student01=new Student("xi",20,true,200);
        student01.study();
        System.out.println(student01.getName());
        Teacher teacher01=new Teacher("jian",26,true,900,20000);
        teacher01.study();
        System.out.println(teacher01.getName());
    }
}

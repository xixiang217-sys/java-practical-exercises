package day04.part04;

public  class Student extends Human{
    private  String  roomnumber;

    public void study(){
        System.out.println("学习");
    };

    @Override
    public void show(){
        System.out.println("学生信息");
    }
}
//6、
//学生具备姓名、年龄、工号属性，及学习行为，
// 教师具备姓名、年龄、工号、工资属性，及学习行为，注意：学生和教师的学习行为不同
// ，请利用抽象的思维，为学生及教师建模
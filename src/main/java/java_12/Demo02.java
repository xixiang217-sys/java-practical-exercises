package java_12;

public class Demo02 {
    public static void main(String[] args) {
       Calculator calculato01=(i ,j)->{
           return i+j;
       };

       Calculator calculator02=(i,j)->{
           return i-j;
       };
        System.out.println(calculato01.calc(2, 2));
        System.out.println(calculator02.calc(2, 2));


    }
}
//        2. 编写一个接口Calculator，包含抽象方法calc(int a,int b)，通过Lambda分别实现加减运算并调用。
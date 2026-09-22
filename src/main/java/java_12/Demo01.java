package java_12;

public class Demo01 {
    public static void main(String[] args) {
        Thread thread=new Thread(()->{
            System.out.println("Lambda线程执行");
        });
        thread.start();

    }
}
//1. 使用Lambda表达式创建Runnable接口对象，开启线程，控制台输出"Lambda线程执行"。
//        2. 编写一个接口Calculator，包含抽象方法calc(int a,int b)，通过Lambda分别实现加减运算并调用。
package java_11.part06;

public class Demo06 {
    public static void main(String[] args) {
        PrintRunnable printRunnable=new PrintRunnable();
        Thread thread01=new Thread(printRunnable);
        Thread thread02=new Thread(printRunnable);

        thread01.start();
        thread02.start();

    }
}
////题目6（实现Runnable接口创建多线程）
////题目描述：自定义类 PrintRunnable 实现 Runnable 接口，重写run方法，循环打印当前线程名称+1~80数字。在测试类中，使用同一个Runnable对象，创建两个Thread线程对象并启动。
////提示：贴合课件Runnable接口实现步骤，该方式可规避单继承限制，多个线程可共享同一个Runnable资源。
package java_11.part05;

public class Demo05 {
    public static void main(String[] args) {
        Work work=new Work();
        Thread thread01=new Thread(work);
        Thread thread02=new Thread(work);

        thread01.setDaemon(true);
        thread02.setDaemon(true);

        thread01.start();
        thread02.start();
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        System.out.println("main结束");
    }
}
//题目5（守护线程设置）
//题目描述：主线程循环打印1~10的数字，同时创建两个守护线程，守护线程无限循环打印线程名称。要求主线程执行结束后，守护线程自动结束程序。
//提示：启动线程前调用 setDaemon(true) 设置守护线程，守护线程依赖主线程，非守护线程全部结束后JVM会退出。
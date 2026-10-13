package java_11.part08;


public class Demo08 {
    public static void main(String[] args) {
        TickitSell01 tickitSell01=new TickitSell01();
        Thread window1=new Thread(tickitSell01);
        Thread window2=new Thread(tickitSell01);
        Thread window3=new Thread(tickitSell01);

        window1.setName("窗口1");
        window2.setName("窗口2");
        window3.setName("窗口3");

        window1.start();
        window2.start();
        window3.start();
    }
}
////题目8（同步代码块解决卖票安全问题）
////题目描述：基于题目7的卖票代码，使用同步代码块改造程序，解决多线程卖票的重复售票、超卖、负票数问题，保证售票数据安全。
////提示：将操作共享票数的代码放入synchronized(锁对象) 代码块中，锁对象可自定义普通对象，保证同一时刻只有一个线程执行售票逻辑。
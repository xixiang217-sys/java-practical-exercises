package java_11.part07;

public class Demo07 {
    public static void main(String[] args) {
        TickitSell tickitSell=new TickitSell();
        Thread window1=new Thread(tickitSell);
        Thread window2=new Thread(tickitSell);
        Thread window3=new Thread(tickitSell);

        window1.setName("窗口1");
        window2.setName("窗口2");
        window3.setName("窗口3");

        window1.start();
        window2.start();
        window3.start();

    }

}
////题目7（模拟多线程卖票并发问题）
////题目描述：模拟电影院卖票场景，总票数80张，开启3个售票窗口（线程）同时卖票。不做任何同步处理，复现多线程卖票的超卖、重复售票问题。
////提示：共享票数变量定义为成员变量，while死循环卖票，添加sleep模拟出票耗时，即可触发线程安全问题。
////题目8（同步代码块解决卖票安全问题）
////题目描述：基于题目7的卖票代码，使用同步代码块改造程序，解决多线程卖票的重复售票、超卖、负票数问题，保证售票数据安全。
////提示：将操作共享票数的代码放入synchronized(锁对象) 代码块中，锁对象可自定义普通对象，保证同一时刻只有一个线程执行售票逻辑。
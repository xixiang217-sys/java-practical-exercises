package java_11.part04;

public class Roll implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }
}
////题目4（线程join方法使用）
////题目描述：创建三个线程，分别命名为「主线程前置线程」「子线程1」「子线程2」。要求先启动「主线程前置线程」，并让主线程等待该线程执行完毕后，再启动另外两个子线程执行打印逻辑。
////提示：使用join() 方法实现线程等待，该方法需要捕获中断异常，核心是让主线程阻塞，等待指定线程死亡。
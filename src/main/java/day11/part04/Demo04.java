package java_11.part04;

public class Demo04 {
    public static void main(String[] args) {
        Roll roll=new Roll();
        Thread thread01=new Thread(roll);
        Thread thread02=new Thread(roll);
        Thread thread03=new Thread(roll);

        thread01.setName("主线程前置线程");
        thread02.setName("子线程1");
        thread02.setName("子线程2");

        thread01.start();
        try {
            thread01.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        thread02.start();
        thread03.start();

    }
}
////题目4（线程join方法使用）
////题目描述：创建三个线程，分别命名为「主线程前置线程」「子线程1」「子线程2」。要求先启动「主线程前置线程」，并让主线程等待该线程执行完毕后，再启动另外两个子线程执行打印逻辑。
////提示：使用join() 方法实现线程等待，该方法需要捕获中断异常，核心是让主线程阻塞，等待指定线程死亡。
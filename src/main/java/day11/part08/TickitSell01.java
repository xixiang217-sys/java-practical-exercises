package java_11.part08;

public class TickitSell01 implements Runnable {
    private final Object object = new Object();
    public static int tictik = 100;

    @Override
    public void run() {
        while (true) {
            synchronized (object) {
                if (tictik > 0) {
                    try {
                        Thread.sleep(10);
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println(Thread.currentThread().getName() + "卖出了第" + tictik + "张票");
                    tictik--;
                }
            }
        }

    }
}

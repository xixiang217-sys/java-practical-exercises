package java_11.part07;

public class TickitSell implements Runnable{
    public static int tictik=100;
    @Override
    public void run() {
        while (true){
            if (tictik>0){
                try {
                    Thread.sleep(10);
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
                System.out.println(Thread.currentThread().getName()+"卖出了第"+tictik+"张票");
                tictik--;
            }

        }

    }
}

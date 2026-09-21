package java_11.part01;

public class NumThread extends Thread {
    @Override
    public void run() {
        {
            for (int i = 1; i <= 50; i++) {
                System.out.println(i);
            }
        }
    }


}

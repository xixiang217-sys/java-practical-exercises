package java_11.part03;

public class Able implements Runnable{
    @Override
    public void run() {
        for (int i = 1; i <= 20; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(i);
        }

    }

}
////题目3（线程休眠sleep使用）
////题目描述：创建线程类，线程中循环打印1~20的数字，每打印一个数字，线程休眠1秒。创建两个该线程对象并启动，实现两个线程交替延时打印数字的效果。
////提示：在run方法的循环内添加 Thread.sleep(1000)，必须捕获 InterruptedException 异常，异常处理格式参考课件案例。

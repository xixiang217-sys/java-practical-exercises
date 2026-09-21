package java_11.part02;

public class Demo02 {
    public static void main(String[] args) {
        Demo02Thread demo02Thread01=new Demo02Thread();
        Demo02Thread demo02Thread02=new Demo02Thread();
        Demo02Thread demo02Thread03=new Demo02Thread();
        demo02Thread01.setName("最高优先级线程");
        demo02Thread01.setPriority(Thread.MAX_PRIORITY);
        demo02Thread02.setName("普通优先级线程");
        demo02Thread03.setName("最低优先级线程");
        demo02Thread03.setPriority(Thread.MIN_PRIORITY);

        demo02Thread01.start();
        demo02Thread02.start();
        demo02Thread03.start();
    }

}
////题目2（线程优先级实操）
////题目描述：定义三个线程类对象，分别命名为「最高优先级线程」「普通优先级线程」「最低优先级线程」，分别设置优先级为10、5、1，每个线程循环打印 1~100 的数字。启动所有线程，观察优先级对线程执行的影响。
////提示：使用 setPriority() 方法设置优先级，借用 Thread 类常量 MAX_PRIORITY、、，牢记Java是抢占式调度模型。
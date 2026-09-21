package java_11.part02;

public class Demo02Thread extends java.lang.Thread {
    @Override
    public void run() {
        super.run();
    }
    public Demo02Thread(){
        for (int i = 1; i <=100 ; i++) {
            System.out.println(i);
        }
    }
}

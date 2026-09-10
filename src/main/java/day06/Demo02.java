package day06;

public class Demo02 {
    public static void main(String[] args) {
        String s=new String("123");
        String s1=new String("123");
        System.out.println(s==s1);
        System.out.println(s1.equals(s));
    }
}

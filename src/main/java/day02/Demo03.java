package day02;

public class Demo03 {
    public static void main(String[] args){
        int count=0;
        for(int i=1988;i<=2019;i++){
            if((i%4==0&&i%100!=0)||i%400==0){
                count++;
                System.out.println(i);
        }

    }
        System.out.println(count);
}
}

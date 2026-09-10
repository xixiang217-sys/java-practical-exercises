package day06;

import java.util.Scanner;

public class Demo03 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("请输入账号");
        String admin=new String(sc.next());

        String passWord=new String("123456");

        int count=3;

        for (int i = 1; i <=3; i++) {
            count--;
            System.out.println("请输入密码");
            String userInPutPassword=new String(sc.next());
            if (passWord.equals(userInPutPassword)){
                System.out.println("密码正确,欢迎您");
                break;
            }
            else {
                System.out.print("密码错误，你的输入机会还有"+count+"次");

        }
            if (count==0){
                System.out.println();
                System.out.println("错误次数过多，以冻结");
                break;
            }

        }
    }
}

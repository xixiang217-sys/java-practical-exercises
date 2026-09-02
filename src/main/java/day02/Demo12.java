package day02;

public class Demo12 {
    public static void main(String[] args){
        for (int i=1;i<=3;i++){
            for(int j=1;j<=5;j++){
                if(j>=4-i&&j<=i+2)
                    System.out.print("*");
                else
                    System.out.print(" ");
        }
            System.out.println();
    }
        for (int i=1;i<=2;i++){
            for(int j=1;j<=5;j++){
                if(j>=i+1&&j<=4-i+1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }

}
}

//package day02;
//
//import java.util.Scanner;
//
//public class Demo12 {
//    public static void main(String[] args){
//        Scanner sc=new Scanner(System.in);
//        System.out.println("输入一个奇数");
//        int N=sc.nextInt();
//        for (int i=1;i<=N/2+1;i++){
//            for(int j=1;j<=N;j++){
//                if(j>=N-i-1&&j<=N-3+i)
//                    System.out.print("*");
//                else
//                    System.out.print(" ");
//            }
//            System.out.println();
//        }
//        for (int i=1;i<=N/2-1;i++){
//            for(int j=1;j<=N;j++){
//                if(j>=N-4+i&&j<=N-2-i)
//                    System.out.print("*");
//                else
//                    System.out.print(" ");
//            }
//            System.out.println();
//        }
//
//    }
//}

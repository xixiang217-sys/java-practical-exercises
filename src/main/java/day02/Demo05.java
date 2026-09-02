package day02;

public class Demo05 {
    public static void main(String[] args){
        double[]a={12.9,53.54,75.0,99.1,3.14};
        double mini=a[0];
        for (int i=0;i<a.length;i++){
        if (a[i]<mini)
            mini=a[i];
    }
        System.out.println(mini);
    }

}

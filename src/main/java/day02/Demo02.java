package day02;

public class Demo02 {
    public static void main(String[] args){
        for(int i=1;i<=10;i++){
            for(int j=1;j<i;j++){
                System.out.print(j+"x"+i+"="+i*j+"\t");
            }
            System.out.println();
        }

    }

}

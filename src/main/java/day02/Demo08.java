package day02;

public class Demo08 {
    public static  void main(String[] args){
        double[] arr= {0.14,-0.03,-0.062,0.12,-0.061,-0.19,-0.038,0.09,-0.045,0.55};
        int  count1=0;
        int count2=0;
        for (int i=0;i<arr.length;i++){
            if (arr[i]>0){
                count1++;
            }
            else
                count2++;
        }
        System.out.println("赚钱的股票一共有："+count1+"只");
        System.out.println("赔钱的股票一共有："+count2+"只");
    }


}

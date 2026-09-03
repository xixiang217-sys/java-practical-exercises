package day03;

public class Demo11 {
    public int[] fangZhuang(int[] arr){
        int [] temp=new int[arr.length];
        int i=0;
        for (int a = arr.length-1; a>=0; a--) {
            temp[i]=arr[a];
            i++;
        }
        for (int j = 0; j < temp.length; j++) {
            System.out.print(temp[j]+" ");
        }
        return temp;

    }
    public static void main(String[] args) {
        int[]arr= {19,28,37,46,50};
        Demo11 demo11=new Demo11();
        int[] numbers=  demo11.fangZhuang(arr);
    }
}

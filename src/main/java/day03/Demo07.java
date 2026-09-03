package day03;

public class Demo07 {
    public static void main(String[] args) {
        int thefirst=1;
        int thesecond=1;
        int thelast=0;
        for (int i = 2; i < 20; i++) {
            thelast=thesecond+thefirst;
            thefirst=thesecond;
            thesecond=thelast;
        }
        System.out.println(thelast);
}


}

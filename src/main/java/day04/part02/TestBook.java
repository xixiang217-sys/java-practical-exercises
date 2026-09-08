package day04.part02;

import java.util.Scanner;

public class TestBook {
    public static void main(String[] args) {
        Book book=new Book();
        book.show();
        Scanner scanner=new Scanner(System.in);
        book.setFee(scanner.nextDouble());
        book.setName(scanner.next());
        book.setPage(scanner.nextInt());
        book.show();

    }
}

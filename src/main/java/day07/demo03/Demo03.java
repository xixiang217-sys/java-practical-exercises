package Java_07.demo03;

import java.util.Scanner;

public class Demo03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入年龄");
        int age = scanner.nextInt();
        Person person = new Person();
        try {
            person.checkAge(age);
        } catch (AgeException ageException) {
            ageException.printStackTrace();
        }
    }
}

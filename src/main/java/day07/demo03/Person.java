package Java_07.demo03;

public class Person {
    public void checkAge(int age) throws AgeException {
        if (age >= 0 && age <= 150) {
            System.out.println("年龄校验通过");
        } else {
            throw new AgeException("异常");
        }
    }
}

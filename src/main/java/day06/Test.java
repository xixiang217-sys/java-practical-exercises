package day06;

public class Test {
    public static void main(String[] args) {
        User user=new User();
        user.setAge(10);
        user.setName("小7");

        Passager passager=new Passager();
        passager.setAge(10);
        passager.setName("小7");

        System.out.println(user.toString());
        System.out.println(passager.toString());

        User user1=new User("小7",10);
        if (user1.equals(user)){
            System.out.println("对象相同");
        }
        else {
            System.out.println("对象不相同");
        }



    }
}

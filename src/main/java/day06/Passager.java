package day06;

import java.util.Objects;

public class Passager {
    private int age;
    private String name;

    public Passager(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Passager() {
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Passager{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {

        if (o == null || getClass() != o.getClass()) return false;
        Passager passager = (Passager) o;
        return age == passager.age && Objects.equals(name, passager.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name);
    }
}

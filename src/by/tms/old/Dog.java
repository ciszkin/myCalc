package by.tms.old;

import java.util.Objects;

public class Dog {

    public static void main(String[] args) {
        Dog dog = new Dog("test", 22);
        Dog dog2 = new Dog(27);
        System.out.println(dog.equals(dog2));
    }

    String name;
    int age;


    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Dog(int age) {
        this.age = age;
    }

    public Dog() {

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return age == dog.age &&
                Objects.equals(name, dog.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
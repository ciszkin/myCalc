package by.tms.old;

import java.util.Objects;

public class Person {

    private String name;
    private String surname;
    private String profession;
    private int age;
    private int weight;
    private int height;

    public static void main(String[] args) {
        Person p1 = new Person("p1", "ppp", "painter", 28, 86, 185);
        Person p2 = new Person("p1", "ppp", "painter", 28, 86, 185);
        Person p3 = new Person("p1", "ppp", "painter", 28, 86, 185);

        System.out.println(p1.equals(p3));
        System.out.println(p2.equals(p3));
        System.out.println(p1.equals(p2));
    }

    public Person(String name, String surname, String profession, int age, int weight, int height) {
        this.name = name;
        this.surname = surname;
        this.profession = profession;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }


    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getProfession() {
        return profession;
    }

    public int getAge() {
        return age;
    }

    public int getWeight() {
        return weight;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(o == null) return false;
        Person pers;
        if(getClass() == o.getClass()) {
            pers = (Person) o;
        } else {
            return false;
        }

        return age == pers.age && weight == pers.weight && height == pers.height && name.equals(pers.name)
                && surname.equals(pers.surname) && profession.equals(pers.profession);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, profession, age, weight, height);
    }
}

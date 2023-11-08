package org.myexample;

public class Kitten {

    private  Gender gender;
    private String name;
    private int age;

    public enum Gender {
        MALE,
        FEMALE
    }

    public Kitten(String name, Gender gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Gender getGender() {
        return gender;

    }

    @Override
    public String toString() {
        return "Kitten{" +
                "gender=" + gender +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

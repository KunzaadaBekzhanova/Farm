package com.company;

public abstract class DosmeticAnimal {
    private double weight;
    private int age;
    private char gender;
    private String nickName;

    @Override
    public String toString() {
        return "DosmeticAnimal{" +
                "weight=" + weight +
                ", age=" + age +
                ", gender=" + gender +
                ", nickName='" + nickName + '\'' +
                '}';
    }

    public DosmeticAnimal(double weight, int age, char gender, String nickName) {
        this.weight = weight;
        this.age = age;
        this.gender = gender;
        this.nickName = nickName;
    }
}

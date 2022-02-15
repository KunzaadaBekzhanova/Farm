package com.company;

public class Horse extends DosmeticAnimal {
    private String color;

    public Horse(double weight, int age, char gender, String nickName,String color) {
        super(weight, age, gender, nickName);
        this.color = color;
    }
}

package com.company;

import java.util.Arrays;

public class Farm {
    private String address;
    private String owner;
    private  DosmeticAnimal[] sheep;
    private DosmeticAnimal[] cows;
    private DosmeticAnimal[] horse;


    public Farm(String address, String owner, Sheep[] sheep, Cow[] cows, Horse[] horse) {
        this.address = address;
        this.owner = owner;
        this.sheep = sheep;
        this.cows = cows;
        this.horse = horse;


    }

    @Override
    public String toString() {
        return "Farm{" +
                "\naddress='" + address  +
                ", \nowner='" + owner  +
                ", \nsheep=" +sheep.length+
                ", \ncows=" + cows.length +
                ", \nhorse=" + horse.length +
                '}';
    }
}

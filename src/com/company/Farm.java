package com.company;

import java.util.Arrays;

public class Farm {
    private String address;
    private String owner;
    private Sheep[] sheep;
    private Horse[] horses;
    private Cow[] cows;

    @Override
    public String toString() {
        return "Farm information: " +'\n' +
                "address: " + address + '\n' +
                "ownerName: " + owner + '\n' +
                "sheep: " + sheep.length +'\n' +
                "horses: " + horses.length +'\n' +
                "cows: " + cows.length+'\n';
    }

    public Farm(String address, String owner, Sheep[] sheep, Horse[] horses, Cow[] cows) {
        this.address = address;
        this.owner = owner;
        this.sheep = sheep;
        this.horses = horses;
        this.cows = cows;
    }


}

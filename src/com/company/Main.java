package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        DosmeticAnimal cow1 = new Cow(120.5, 5, 'M', "Ember");
        DosmeticAnimal cow2 = new Cow(130.45, 1, 'F', "Eshli");
        DosmeticAnimal cow3 = new Cow(20.5, 5, 'F', "Jenny");
        DosmeticAnimal cow4 = new Cow(160.7, 4, 'M', "Night");
        DosmeticAnimal cow5 = new Cow(90.5, 5, 'M', "Sila");
        DosmeticAnimal cow6 = new Cow(110.5, 3, 'F', "Lu");


        DosmeticAnimal sheep1 = new Sheep(20.4, 1, 'F', "Nick");
        DosmeticAnimal sheep2 = new Sheep(45.1, 2, 'M', "Lucky");
        DosmeticAnimal sheep3 = new Sheep(35.09, 3, 'F', "Sara");
        DosmeticAnimal sheep4 = new Sheep(35.09, 3, 'F', "Lara");

        DosmeticAnimal horse1 = new Horse(150, 13, 'M', "Tulpar", "grey");
        DosmeticAnimal horse2 = new Horse(200, 13, 'M', "Tulpar", "black");
        DosmeticAnimal horse3 = new Horse(200, 13, 'F', "Tanya", "white");

        DosmeticAnimal[] domesticAnimals = {sheep1, sheep2, sheep3, cow1, cow2, cow3, cow4, cow5, horse1, horse2};
        Cow[] cows = new Cow[5];
        Sheep[] sheep = new Sheep[3];
        Horse[] horses = new Horse[2];
        int count = 0;
        int count1 = 0;
        int count2 = 0;
        for (DosmeticAnimal d : domesticAnimals) {
            if (d instanceof Cow) {
                cows[count] = (Cow) d;
                count++;
            }
            if (d instanceof Sheep) {
                sheep[count1] = (Sheep) d;
                count1++;

            }
            if (d instanceof Horse) {
                horses[count2] = (Horse) d;
                count2++;
            }




        }
        Farm farm1 = new Farm("Jailoo", "Janybek", sheep, cows, horses);
        System.out.println(farm1);

        DosmeticAnimal[] domesticAnimals1 = {sheep4, cow6, horse3};
        Cow[] cow = new Cow[1];
        Sheep[] sheeps = new Sheep[1];
        Horse[] horse = new Horse[1];
        int count3 = 0;
        int count4 = 0;
        int count5 = 0;
        for (DosmeticAnimal о : domesticAnimals1) {
            if (о instanceof Cow) {
                cow[count3] = (Cow) о;
                count3++;
            }
            if (о instanceof Sheep) {
                sheeps[count4] = (Sheep) о;
                count4++;

            }
            if (о instanceof Horse) {
                horse[count5] = (Horse) о;
                count5++;
            }


        }
        System.out.println("♛♛♛♛♛♛♛♛♛♛♛♛♛♛♛♛♛♛");
        Farm farm2 = new Farm("ALay", "Kylym", sheeps, cow, horse);
        System.out.println(farm2);
    }
}
package com.company;

public class Main {

    public static void main(String[] args) {
	Cow cow1 = new Cow(120.5,5,'M',"Ember");
	Cow cow2 = new Cow(130.45,1,'F',"Eshli");
	Cow cow3 = new Cow(20.5,5,'F',"Jenny");
	Cow cow4 = new Cow(160.7,4,'M',"Night");
	Cow cow5 = new Cow(90.5,5,'M',"Sila");
	Cow cow6 = new Cow(110.5,3,'F',"Lu");

    Cow[] cows;

    Sheep sheep1 = new Sheep(20.4,1,'F',"Nick");
    Sheep sheep2 = new Sheep(45.1,2,'M',"Lucky");
    Sheep sheep3 = new Sheep(35.09,3,'F',"Sara");
    Sheep sheep4 = new Sheep(35.09,3,'F',"Lara");

    Horse horse1 = new Horse(150,13,'M',"Tulpar","grey");
    Horse horse2 = new Horse(200,13,'M',"Tulpar","black");
    Horse horse3 = new Horse(200,13,'F',"Tanya","white");

    Farm farm1 = new Farm("Syrt","Tashbai",
            new Sheep[]{sheep1,sheep2,sheep3},
            new Horse[]{horse1,horse2},
            new Cow[]{cow1,cow2,cow3,cow4,cow5});
    Farm farm2 = new Farm("Kadamzhai","Bekzhan",
            new Sheep[]{sheep4},
            new Horse[]{horse3},
            new Cow[]{cow6});

        System.out.println(farm1);
        System.out.println(farm2);

    }
}

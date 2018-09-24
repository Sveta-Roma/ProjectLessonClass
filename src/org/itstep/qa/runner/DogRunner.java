package org.itstep.qa.runner;

import org.itstep.qa.pet.Dog;

import java.util.Random;

public class DogRunner {
    public static void main(String[] args) {
        Random random = new Random();
        Dog dogOne = new Dog();
        dogOne.colorEyes = "Коричневый";
        dogOne.countLap = random.nextInt(5);

        dogOne.printDogColorEyesToConsole();
        dogOne.printCountLapToConsole();


        Dog dogTwo = new Dog();
        dogTwo.colorEyes = "Зеленый";
        dogTwo.countLap = random.nextInt(5);

        dogTwo.printDogColorEyesToConsole();
        dogTwo.printCountLapToConsole();

        if (dogOne.colorEyes == dogTwo.colorEyes){
            System.out.println("Родственники");
        }else System.out.println("Собаки не родственники");
    }
}

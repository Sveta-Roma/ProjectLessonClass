package org.itstep.qa.runner;

import org.itstep.qa.pet.Cat;

import java.util.Random;

// создаем экземпляр класса Кот -- объект
public class CatRunner {
    public static void main(String[] args) {
    Cat catOne = new Cat();
    catOne.countEyes = 2;
    catOne.nameCat = "Пушок";

    char firstLetter = catOne.getFirstLetterName();
        System.out.println("Первая буква" + firstLetter);
        catOne.printCatNameToConsole();// это не возвращаемый метод
        Random random = new Random();
        catOne.getMultEyes(random.nextInt(100500));

        Cat catTwo = new Cat();
        catTwo.nameCat = "Сидорович";
        catTwo.countEyes = 3;

        if (catOne.countEyes>=catTwo.countEyes){
            System.out.println(catOne.nameCat + " котистее");
        }else {
            System.out.println(catOne.nameCat + " не вау");
        }
    }
}

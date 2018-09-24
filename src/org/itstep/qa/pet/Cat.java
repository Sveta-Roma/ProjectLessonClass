package org.itstep.qa.pet;

// создаем класс -- чертеж
public class Cat {
    public String nameCat;
    public int countEyes;

    public char getFirstLetterName(){//метод на возвращение первой буквы имени кота
        char [] letters = nameCat.toCharArray();//разложили на массив имя кота
        return letters[0];//вернет первое имя кота
    }

    public void printCatNameToConsole(){//метод не возвращает ничего
        System.out.println(nameCat);//выведет имя кота
    }

    public int getMultEyes(int i){// в скобочках означет что мы получили значение из вне
        System.out.println(countEyes*i);// выводит на экран
        return countEyes*i;// возвращем количество глаз умноженный на коэффициент
    }
}

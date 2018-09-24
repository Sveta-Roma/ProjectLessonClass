package org.itstep.qa.runner;

import org.itstep.qa.geometry.Triangle;

public class CheckDifClass {
    public static void main(String[] args) {
        Triangle tr1 = new Triangle();
        tr1.setA(3);
        tr1.setB(4);
        tr1.setC(5);
        System.out.println(tr1.getA());
        System.out.println(tr1.getB());
        System.out.println(tr1.getC());
    }
}

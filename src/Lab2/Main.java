package Lab2;

import sun.util.calendar.LocalGregorianCalendar;

import java.lang.String;
import java.util.GregorianCalendar;
import java.util.TimeZone;
import javax.swing.JButton;

public class Main {
    public static void main(String[] args) throws  CloneNotSupportedException{

        GenericItem Laptop = new GenericItem();
        GenericItem Tv = new GenericItem();
        GenericItem PS = new GenericItem();
        FoodItem Pie = new FoodItem();
        TechnicalItem Smartphone = new TechnicalItem();

        Laptop.ID = 1;
        Tv.ID = 2;
        PS.ID = 3;
        Pie.ID =4;
        Smartphone.ID=5;

        Laptop.name = "Laptop";
        Tv.name = "TV";
        PS.name = "PS";
        Pie.name = "Pie";
        Smartphone.name = "Smartphone";

        Laptop.price = 1000;
        Tv.price = 700;
        PS.price = 400;
        Pie.price = 5;
        Smartphone.price = 500;

        Laptop.category = Category.GENERAL;
        Tv.category = Category.GENERAL;
        PS.category = Category.GENERAL;
        Pie.category = Category.FOOD;
        Smartphone.category = Category.GENERAL;


        Pie.dateOfIncome = new GregorianCalendar(2018, 6, 27, 16, 16, 47);
        Pie.expires = 8;


        Smartphone.warrantyTime = 900;


        Laptop.printAll();
        Tv.printAll();
        PS.printAll();
        Pie.printAll();
        Smartphone.printAll();

        FoodItem Snickers1 = new FoodItem();
        Snickers1.ID = 6;
        Snickers1.name = "Snickers1";
        Snickers1.price = 2;
        Snickers1.category = Category.FOOD;
        Snickers1.expires = 10;
        Snickers1.dateOfIncome = new GregorianCalendar(2014, 2, 22, 12, 15, 25);

        FoodItem Snickers2 = new FoodItem();
        Snickers2.ID = 6;
        Snickers2.name = "Snickers1";
        Snickers2.price = 2;
        Snickers2.category = Category.FOOD;
        Snickers2.expires = 10;
        Snickers2.dateOfIncome = new GregorianCalendar(2014, 2, 22, 12, 15, 25);

        FoodItem Snickers3 = Snickers2.clone();
        Snickers3.printAll();

        System.out.println(Snickers1);

        if(Snickers1.equals(Snickers2))
            System.out.printf ("Objects are equal: " + Snickers1.equals(Snickers2));

        if(Snickers2.equals(Snickers3))
            System.out.printf (" \n Objects are equal: " + Snickers2.equals(Snickers3));



        System.out.println("-------------------------------------------------------");

        Integer[] intArr = {10, 20, 15};
        Float[] floatArr = new Float[3];
        for (int i = 0; i < 3; i++) {
            floatArr[i] = 0.1f * i;
        }
        U0901WorkArray<Integer> insWorkArrayInt = new U0901WorkArray<>(intArr);
        U0901WorkArray<Float> insWorkArrayFloat = new U0901WorkArray<>(floatArr);
        System.out.println(insWorkArrayInt.sum());
        System.out.println(insWorkArrayFloat.sum());
    }











}


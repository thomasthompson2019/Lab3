package Lab2;

import java.text.DateFormat;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class FoodItem extends GenericItem implements Cloneable {
    public short expires;
    public GregorianCalendar dateOfIncome;
    public String analog;


    public FoodItem(String name, float price, FoodItem analog, GregorianCalendar dateOfIncome, short expires) {
        this.name = name;
        this.price = price;
        this.analog = null;
        this.dateOfIncome = dateOfIncome;
        this.expires = expires;
    }

    public FoodItem(String name, float price, short expires) {
        this.name = name;
        this.price = price;
        this.expires = expires;

    }


    public FoodItem() {
        this.name  = name;
    }


    @Override
    void printAll() {
        System.out.printf("\n ID:%d,Name:%s,price:%5.2f,Category:%s,Expires:%d,Date:%tD%n", ID, name, price, category, expires, dateOfIncome );
    }



    @Override
    public boolean equals (Object obj) {
        if (!(obj instanceof FoodItem)) return false;
        return this.hashCode() == obj.hashCode();
    }

    @Override
    public FoodItem clone() throws  CloneNotSupportedException{
        return (FoodItem) super.clone();
    }

    public String toString() {
        return ID +","+ name+ "," + price+ "," + "," + category + "," + expires;
    }






}

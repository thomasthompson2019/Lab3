package Lab2;

public class TechnicalItem extends GenericItem implements  Cloneable{
    public short warrantyTime;

    void printAll() {
        System.out.printf("\n ID:%d,Name:%s,price:%5.2f,Category:%s,Warranty Time:%-20s", ID, name, price, category, warrantyTime);
    }


    public boolean equals (Object obj) {
        return  true;
    }

    @Override
    public FoodItem clone() throws  CloneNotSupportedException{
        return (FoodItem) super.clone();
    }
}

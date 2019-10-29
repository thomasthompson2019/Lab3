package Lab2;
public class GenericItem implements Cloneable{
    public int ID;
    public String name;
    public float price;
    public String GenericItem;

    public Category category;

    public GenericItem(String name, float price, Category category){
        this.name = name;
        this.price = price;
        this.category = category;

    }
    public GenericItem(String name, float price, GenericItem analog){
        this.name = name;
        this.price = price;
        this.GenericItem = null;

    }

    public GenericItem(){
    }

    void printAll() {
        System.out.printf("\n ID:%d,Name:%s,price:%5.2f,Category:%s", ID, name, price, category);
    }


    public boolean equals (Object obj) {
        return  true;
    }

    @Override
    public FoodItem clone() throws  CloneNotSupportedException{
        return (FoodItem) super.clone();
    }





}

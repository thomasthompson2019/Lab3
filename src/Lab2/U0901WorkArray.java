package Lab2;

public class U0901WorkArray<T extends Number> {
    T[] arrNums;

    U0901WorkArray(T[] numP) {
        arrNums = numP;
    }

    public double sum() {
        double doubleWork = 0;
        for (T i : arrNums) {
            doubleWork += i.doubleValue();
        }
        return doubleWork;
    }


}

package task1.myTask5;

public class Snail {
    private int h;
    private int a;
    private int b;

    public Snail(int h, int a, int b) {
        this.h = h;
        this.a = a;
        this.b = b;
    }

    public int howLong(){
        int k = b/(a-b);
        int days = (h)/(a-b) - 1;
        return days;
    }

    public int snailsFor (){
        int days = 0;
        while (h>=a){
            if (h==a){
                days++;
                return days;
            }
            days++;
            h=h-a+b;
        }
        days++;
        return days;
    }
}

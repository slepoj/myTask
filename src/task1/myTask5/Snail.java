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
        int days = (h-k)/(a-b);
        return days;
    }
}

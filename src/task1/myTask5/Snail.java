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

    public int howLong() {
        return 1 + (h - b - 1) / (a - b);
    }

    public int snailsFor() {
        int days = 0;
        while (h >= a) {
            if (h == a) {
                days++;
                return days;
            }
            days++;
            h = h - a + b;
        }
        days++;
        return days;
    }

    public static void start(int h, int a, int b) {
        System.out.println("task 5:");
        while (b > a) {
            System.out.println("incorrect data, b>a");
        }
        Snail snail = new Snail(h, a, b);
        System.out.println("snail need " + snail.howLong() + " days");
    }
}

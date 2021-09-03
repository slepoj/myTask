package task1.myTask6;

public class Maxi {
    private int a;
    private int b;

    public Maxi(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int maxNumber() {
        int maxNum = 0;
        int ab = (int) Math.signum((int) ((a + 0.1) / b));
        int ba = (int) Math.signum((int) (b / (a + 0.1)));
        maxNum = ab * a + ba * b;
        return maxNum;
    }


    public static void start(int a, int b) {
        System.out.println("task 6:");
        Maxi maxi = new Maxi(a, b);
        System.out.println("Max number is " + maxi.maxNumber());
    }
}

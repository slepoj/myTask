package task1.myTask3;

public class DifferenceSeconds {
    private int h;
    private int m;
    private int s;
    private int h2;
    private int m2;
    private int s2;
    public DifferenceSeconds(int h, int m, int s, int h2, int m2, int s2) {
        this.h = h;
        this.m = m;
        this.s = s;
        this.h2 = h2;
        this.m2 = m2;
        this.s2= s2;
    }
    public int difference (){
        int diff = (h2-h)*3600+(m2-m)*60+(s2-s);
        return diff;
    }

    @Override
    public String toString() {
        return "difference is "+String.valueOf(difference()) + "sec";
    }



    public static void start(int a, int a2, int a3, int b, int b2, int b3) {
        System.out.println("task 3:");
        DifferenceSeconds diffSec = new DifferenceSeconds(a,a2,a3,b,b2,b3);
        System.out.println(diffSec);
    }
}

package task1.myTask1;

public class Swaper {

    public static void swap(int a, int b) {
        int buf = a;
        a = b;
        b = buf;
        System.out.println("a = " + a + "; b = " + b);
    }
    public static void start(int a, int b) {
        System.out.println("task 1:");
        Swaper.swap(a,b);
    }

}

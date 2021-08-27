package task1.myTask1;

public class Swaper {

    public static void swap(int a, int b) {
        int buf = a;
        a = b;
        b = buf;
        System.out.println("a = " + a + "; b = " + b);
    }
}

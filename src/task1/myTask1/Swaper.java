package task1.myTask1;

import java.util.Scanner;

public class Swaper {
    private int a;
    private int b;

    public Swaper(int a, int b) {
        this.a = b;
        this.b = a;
    }
    @Override
    public String toString() {
        String s = "a="+a+"b="+b;
        return s;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }
}

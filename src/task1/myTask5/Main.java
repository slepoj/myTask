package task1.myTask5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true) {
            int h = Input.setNumber();
            int a = Input.setNumber();
            int b = Input.setNumber();
            while (b > a) {
                System.out.println("incorrect data, b>a");
                b = Input.setNumber();
            }
            Snail snail = new Snail(h, a, b);
            System.out.println(snail.howLong());
        }
    }
}

package task1.myTask11;

import task1.myTask1.Swaper;

import java.util.Scanner;

public class SwapArray {
    private int size;
    private int array[];

    public SwapArray(int size) {
        this.size = size;
        array = new int[size];
    }

    public void setNumberOfArray() {
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            while (true) {
                if (in.hasNextInt()) {
                    array[i] = in.nextInt();
                    break;
                } else {
                    System.out.println("incorrect data");
                    in.next();
                }
            }
        }
    }

    public void getArray() {
        for (int num :
                array) {
            System.out.print(num + " ");
        }
    }
    public void swapArrayElement() {
        for (int i = 1; i < array.length; i+=2) {
            Swaper swaper = new Swaper(array[i-1],array[i]);
            array[i-1] = swaper.getA();
            array[i] = swaper.getB();
        }
    }
}

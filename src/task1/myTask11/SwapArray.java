package task1.myTask11;

import java.util.Scanner;

public class SwapArray {
    private int size;
    private int array[];

    public SwapArray(int size) {
        this.size = size;
        array = new int[size];
    }

    public SwapArray(int size, int[] array) {
        this.size = size;
        this.array = array;
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
        for (int i = 1; i < array.length; i += 2) {
            int buf = array[i - 1];
            array[i - 1] = array[i];
            array[i] = buf;
        }
    }

    public static void start(int a, int arr[]) {
        System.out.println("task 11:");
        SwapArray swapArray = new SwapArray(a, arr);
        swapArray.swapArrayElement();
        System.out.print("result is ");
        swapArray.getArray();
    }
}

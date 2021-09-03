package task1.myTask10;

import java.util.Scanner;

public class MoreNeighbors {
    private int size;
    private int array[];

    public MoreNeighbors(int size) {
        this.size = size;
        array = new int[size];
    }

    public MoreNeighbors(int size, int[] array) {
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

    public int findMaxNum() {
        int maxNum = 0;
        for (int i = 1; i < array.length - 1; i++) {
            if (array[i] > array[i - 1] && array[i] > array[i + 1]) {
                maxNum++;
                i ++;
            }
        }
        return maxNum;
    }
    public static void start(int a, int arr[]) {
        System.out.println("task 10:");
        MoreNeighbors moreNeighbors = new MoreNeighbors(a, arr);
        System.out.println("result is " + moreNeighbors.findMaxNum());
    }
}

package task1.myTask9;

import java.util.Scanner;

public class ArrayMaxNum {
    private int array[];

    public ArrayMaxNum(int size) {
        array = new int[size];
    }
    public ArrayMaxNum(int size, int array []) {
        this.array = new int[size];
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
        if (array.length == 1) {
            return 0;
        }
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] < array[i + 1]) {
                maxNum++;
            }
        }
        return maxNum;
    }


    public static void start(int a, int arr[]) {
        System.out.println("task 9:");
        ArrayMaxNum arrayMaxNum = new ArrayMaxNum(a,arr);
        System.out.println("result is " + arrayMaxNum.findMaxNum());
    }

}

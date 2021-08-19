package task1.myTask11;

import task1.myTask10.MoreNeighbors;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SwapArray swapArray = new SwapArray(Input.setNumber());
        swapArray.setNumberOfArray();
        swapArray.swapArrayElement();
        swapArray.getArray();
    }
}

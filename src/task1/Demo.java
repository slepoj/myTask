package task1;

import task1.myTask1.Swaper;
import task1.myTask10.MoreNeighbors;
import task1.myTask11.SwapArray;
import task1.myTask2.LessonsTime;
import task1.myTask3.DifferenceSeconds;
import task1.myTask4.Car;
import task1.myTask5.Snail;
import task1.myTask6.Maxi;
import task1.myTask7.Rook;
import task1.myTask8.FindEquals;
import task1.myTask9.ArrayMaxNum;

public class Demo {
    public static void main(String[] args) {
        Swaper.start(1,3);
        LessonsTime.start(1);
        DifferenceSeconds.start(1,1,1,1,1,10);
        Car.start(100, 650);
        Snail.start(10,3,2);
        Maxi.start(1,34);
        Rook.start(1,2,1,7);
        FindEquals.start(1,2,1);
        ArrayMaxNum.start(5, new int[]{1, 2, 3, 4, 5});
        MoreNeighbors.start(5, new int[]{1,2,1,2,1});
        SwapArray.start(5, new int[]{1,2,3,4,5});
    }
}

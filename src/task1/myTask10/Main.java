package task1.myTask10;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MoreNeighbors moreNeighbors = new MoreNeighbors(Input.setNumber());
        moreNeighbors.setNumberOfArray();
        //moreNeighbors.getArray();
        System.out.println(moreNeighbors.findMaxNum());
    }
}

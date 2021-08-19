package task1.myTask3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DifferenceSeconds diffSec = new DifferenceSeconds(Input.setHours(), Input.setMinAndSec(), Input.setMinAndSec(),
                Input.setHours(), Input.setMinAndSec(), Input.setMinAndSec());
        System.out.println(diffSec);
    }


}

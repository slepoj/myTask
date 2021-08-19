package task1.myTask2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true) {
            LessonsTime time = new LessonsTime(Input.setNumber());
            time.whatTime();
            time.viewResult();
        }
    }


}

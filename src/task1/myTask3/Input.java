package task1.myTask3;

import java.util.Scanner;

public class Input {

    public static int setHours() {
        Scanner in = new Scanner(System.in);
        int num = 0;
        while (true) {
            if (in.hasNextInt()) {
                num = in.nextInt();
                if (num >= 1 && num <= 23) {
                    return num;
                }
                System.out.println("incorrect data");
                continue;
            }
            System.out.println("incorrect data");
            in.next();
        }
    }

    public static int setMinAndSec() {
        Scanner in = new Scanner(System.in);
        int num = 0;
        while (true) {
            if (in.hasNextInt()) {
                num = in.nextInt();
                if (num >= 1 && num <= 59) {
                    return num;
                }
                System.out.println("incorrect data");
                continue;
            }
            System.out.println("incorrect data");
            in.next();
        }
    }

}

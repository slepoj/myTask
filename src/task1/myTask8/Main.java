package task1.myTask8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true){
        FindEquals findEquals = new FindEquals(Input.setNumber(),Input.setNumber(),Input.setNumber());
        System.out.println(findEquals.findNum());}
    }
}

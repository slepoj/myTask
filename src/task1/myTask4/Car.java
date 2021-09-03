package task1.myTask4;

public class Car {
    private int dayLength;
    private int length;

    public Car(int dayLength, int length) {
        this.dayLength = dayLength;
        this.length = length;
    }

    public int day() {
        int numDay;
        numDay = length / dayLength;
        switch (length % dayLength) {
            case 0: {
                break;
            }
            default:
                numDay++;
        }
        System.out.print("Nomber of day is ");
        return numDay;
    }

    public int day2() {
        System.out.print("Nomber of day is ");
        return  (int) (length / dayLength + Math.signum(length % dayLength));
    }


    public static void start(int a, int b) {
        System.out.println("task 4:");
        Car car  =new Car(a,b);
        System.out.println(car.day());
    }
}

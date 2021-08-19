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
        return numDay;
    }

    public int day2() {
        int numDay;
        //try {
            numDay = (int) (length / dayLength + Math.signum(length % dayLength));
        //} catch (Exception e) {
           // numDay = length / dayLength;
        //}
        return numDay;
    }
}

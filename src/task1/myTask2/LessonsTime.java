package task1.myTask2;

public class LessonsTime {
    private int numLessons;
    private int hours;
    private int mins;

    public LessonsTime(int numLessons) {
        this.numLessons = numLessons;
    }

    public void whatTime() {
        int k = numLessons / 2;
        mins = (60 + 45 - 2 * k * 5) % 60;
        hours = 8 + numLessons -numLessons/10;
    }

    public void viewResult() {
        System.out.printf("%2d %02d%n", hours, mins);
    }

}

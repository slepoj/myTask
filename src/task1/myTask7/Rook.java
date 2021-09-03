package task1.myTask7;

public class Rook {
    private int x1, y1, x2, y2;

    public Rook(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public void killFigure() {
        if (x1 == x2 || y1 == y2) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }


    public static void start(int x1, int y1, int x2, int y2) {
        System.out.println("task 7:");
        Rook rook = new Rook(x1, y1, x2, y2);
        rook.killFigure();
    }

}

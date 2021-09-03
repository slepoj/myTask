package task1.myTask7;

public class Main {
    public static void main(String[] args) {
        while (true) {
            Rook rook = new Rook(Input.setNumber(), Input.setNumber(), Input.setNumber(), Input.setNumber());
            rook.killFigure();
        }
    }
}

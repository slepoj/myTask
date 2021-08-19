package task1.myTask8;

public class FindEquals {
    private int a, b, c;

    public FindEquals(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int findNum() {
        if (a == b && b == c) {
            return 3;
        }
        if (a == b || b == c || a == c) {
            return 2;
        }
        return 0;
    }
}

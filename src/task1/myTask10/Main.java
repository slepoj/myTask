package task1.myTask10;

public class Main {
    public static void main(String[] args) {
        MoreNeighbors moreNeighbors = new MoreNeighbors(Input.setNumber());
        moreNeighbors.setNumberOfArray();
        System.out.println(moreNeighbors.findMaxNum());
    }
}

package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private static int NUM1 = 12;
    private static int NUM2 = -1;
    private int[] numbers = new int[NUM1];

    private int total = NUM2;

    public static int getNUM1() {
        return NUM1;
    }

    public static int getNUM2() {
        return NUM2;
    }

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public int getTotal() {
        return total;
    }

    public boolean callCheck() {
        return total == NUM2;
    }

    public boolean isFull() {
        return total == 11;
    }

    protected int peekaboo() {
        if (callCheck())
            return NUM2;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return NUM2;
        return numbers[total--];
    }

    public int[] getNumbers() {
        return numbers;
    }
}

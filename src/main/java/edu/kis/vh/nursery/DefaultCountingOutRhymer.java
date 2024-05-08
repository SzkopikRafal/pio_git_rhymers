package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int NUM1 = 12;
    public static final int NUM2 = -1;
    final private int[] numbers = new int[NUM1];

    public int total = NUM2;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
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

}

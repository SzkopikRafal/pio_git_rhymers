package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private static int NUM1 = 12;
    private static int NUM2 = -1;
    private int[] numbers = new int[NUM1];

    private int total = NUM2;

    public static int getNUM1() {
        return NUM1;
    }

    public static void setNUM1(int NUM1) {
        DefaultCountingOutRhymer.NUM1 = NUM1;
    }

    public static int getNUM2() {
        return NUM2;
    }

    public static void setNUM2(int NUM2) {
        DefaultCountingOutRhymer.NUM2 = NUM2;
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

    public void setNumbers(int[] numbers) {
        this.numbers = numbers;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}

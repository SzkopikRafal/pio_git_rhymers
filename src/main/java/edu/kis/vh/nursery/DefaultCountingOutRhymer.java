package edu.kis.vh.nursery;

/**
 * The DefaultCountingOutRhymer class provides a simple implementation of a counting out rhymer.
 * It uses an array to store values and includes methods to add, remove, and check values.
 */
public class DefaultCountingOutRhymer {

    /** The capacity of the rhymer. */
    private static int NUM1 = 12;

    /** The initial value indicating an empty rhymer. */
    private static int NUM2 = -1;

    /** The array to store the values. */
    private int[] numbers = new int[NUM1];

    /** The current total of the rhymer. */
    private int total = NUM2;

    /**
     * Gets the capacity of the rhymer.
     *
     * @return the capacity of the rhymer
     */
    public static int getNUM1() {
        return NUM1;
    }

    /**
     * Gets the initial value indicating an empty rhymer.
     *
     * @return the initial value indicating an empty rhymer
     */
    public static int getNUM2() {
        return NUM2;
    }

    /**
     * Adds a value to the rhymer.
     *
     * @param in the value to be added
     */
    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    /**
     * Gets the current total of the rhymer.
     *
     * @return the current total
     */
    public int getTotal() {
        return total;
    }

    /**
     * Checks if the rhymer is empty.
     *
     * @return true if the rhymer is empty, false otherwise
     */
    public boolean callCheck() {
        return total == NUM2;
    }

    /**
     * Checks if the rhymer is full.
     *
     * @return true if the rhymer is full, false otherwise
     */
    public boolean isFull() {
        return total == 11;
    }

    /**
     * Peeks at the top value of the rhymer without removing it.
     *
     * @return the top value if the rhymer is not empty, otherwise returns NUM2
     */
    protected int peekaboo() {
        if (callCheck())
            return NUM2;
        return numbers[total];
    }

    /**
     * Removes and returns the top value of the rhymer.
     *
     * @return the top value if the rhymer is not empty, otherwise returns NUM2
     */
    public int countOut() {
        if (callCheck())
            return NUM2;
        return numbers[total--];
    }

    /**
     * Gets the array storing the values of the rhymer.
     *
     * @return the array of values
     */
    public int[] getNumbers() {
        return numbers;
    }
}

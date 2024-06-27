public class Secrets {
    public static int shiftBack(int value, int amount) {
        return value >>> amount;
    }

    public static int setBits(int value, int mask) {
        return mask | value;
    }

    public static int flipBits(int value, int mask) {
        return mask ^ value;
    }

    public static int clearBits(int value, int mask) {
        throw new UnsupportedOperationException("Please implement the (static) Secrets.clearBits() method");
    }
}

public class Get {

    // !get

    public static int getBit(int n, int i) {
        int bitMask = 1 << i;

        if ((n & bitMask) == 0) {
            return 0;
        }

        else {
            return 1;
        }
    }

    

    // !set

    public static int setBit(int n, int i) {
        int bitMask = 1 << i;

        return n | bitMask;
    }

    // !clear

    public static int clearBit(int n, int i) {
        int bitMask = ~(1 << i);

        return n & bitMask;
    }

    public static int updateBit(int n, int i, int newBit) {
        // if (newBit == 0) {
        //     return clearBit(n, i);
        // }

        // else {
        //     return setBit(n, i);
        // }

        // !or

        n=clearBit(n, i);
        int bitMask=newBit<<i;
        return n|bitMask;
    }

    public static void main(String[] args) {
        System.out.println(getBit(15, 02));
        System.out.println(setBit(10, 2));
        System.out.println(clearBit(10, 1));
        System.out.println(updateBit(10, 2, 1));
    }
}

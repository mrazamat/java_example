package uz.coder.Numbers;

public class PositiveIntegerNumber {
    public static void main(String[] args) {
        int num = 54;
        int n = num;
        int rev = 0;
        while (num > 0) {
            rev <<= 1;
            if ((int) (num & 1) == 1)
                rev ^= 1;
            num >>= 1;

        }
        System.out.println("The orginal number is: " + n);
        System.out.println("The number with reversed bits is: " + rev);
    }
}

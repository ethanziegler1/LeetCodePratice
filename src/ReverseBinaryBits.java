import java.util.Stack;


public class ReverseBinaryBits {
    public static void main(String[]args){
        String number = new String("100111101101111011101");
        System.out.println(number);
        System.out.println(reverseBits(number));
    }
        // you need treat n as an unsigned value
        public static int reverseBits(String n) {
            int numElements = Integer.bitCount(Integer.parseUnsignedInt(n));
            String result = new String("");
            for (int i = numElements; i > 0; i--) {
                result += n.charAt(i-1);
            }
            return Integer.parseInt(result);
    }
    public static int countElements(int n){
            int counter = 0;
            while (n != 0){
                n /= 10;
                counter++;
            }
            return counter;
    }
}
